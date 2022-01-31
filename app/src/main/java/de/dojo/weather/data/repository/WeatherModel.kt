package de.dojo.weather.data.repository

import java.time.LocalDateTime

data class Forecast(
    val station: WeatherStation,
    val weatherData: List<Weather>
)

data class Weather(
    val date: LocalDateTime,
    val condition: String,
    val temperature: Float, // Unit: K
    val dewPoint: Float, // Unit: K
    val pressure: Float, // Unit: Pa
    val windSpeed: Float, // Unit: m/s
    val windDirection: String, // Unit: Degrees
    val windGusts: Float, // Unit: m/s
    val precipitation: Float, // Unit: kg/m2
    val precipitationProbability: Float, // Unit: % (0..100)
    val precipitationDuration: Float, // Unit: s
    val cloudCoverage: Float, // Unit: % (0..100)
    val visibility: Float, // Unit: m
    val sunDuration: Float, // Unit: s
    val sunIrradiance: Float, // Unit: kJ/m2
    val fogProbability: Float, // Unit: % (0..100)
    val humidity: Float, // Unit: %
)

fun Weather.temperatureCelsius(): Float {
    return temperature - 273.15f
}

fun Weather.pressureMBar(): Float {
    return pressure * 0.01f
}