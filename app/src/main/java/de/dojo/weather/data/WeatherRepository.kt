package de.dojo.weather.data

import de.dojo.weather.R
import java.time.LocalDateTime
import java.util.Calendar
import java.util.Date

object WeatherRepository {
    fun getCurrentWeather(location: String): Weather {
        return when (location) {
            "headquarter" -> headquarterWeather
            else -> dortmundWeather
        }
    }

    fun getCurrentForecast(location: String): List<WeatherForecast> {
        return when (location) {
            "headquarter" -> headquarterForecast
            else -> dortmundForecast
        }
    }
}

data class Weather(
    val date: Date,
    val place: String,
    val country: String,
    val weatherType: WeatherType,
    val temperature: Int,
    val windSpeed: Float,
    val feelsLikeTemperature: Int,
    val indexUV: Int,
    val pressure: Int,
    val todaysForecast: List<HourlyForecast>
)

data class WeatherForecast(
    val dateTime: LocalDateTime,
    val place: String,
    val weatherType: WeatherType,
    val highestTemperature: Int,
    val lowestTemperature: Int
)

data class HourlyForecast(
    val dateTime: LocalDateTime,
    val weatherType: WeatherType,
    val temperature: Int
)

enum class WeatherType {
    SUNNY, PARTLY_SUNNY, CLOUDY, RAINY
}

fun getDate(days: Int): Date {
    return Calendar.getInstance().apply {
        add(Calendar.DATE, days)
    }.time
}

fun WeatherType.getDisplayName(): String {
    return when (this) {
        WeatherType.SUNNY -> "Sunny"
        WeatherType.PARTLY_SUNNY -> "Partly sunny"
        WeatherType.CLOUDY -> "Cloudy"
        WeatherType.RAINY -> "Rainy"
    }
}

fun WeatherType.getImageResourceOnPrimary(): Int {
    return when (this) {
        WeatherType.SUNNY -> R.drawable.ic_sunny_on_primary
        WeatherType.PARTLY_SUNNY -> R.drawable.ic_partly_cloudy_on_primary
        WeatherType.CLOUDY -> R.drawable.ic_cloudy_on_primary
        WeatherType.RAINY -> R.drawable.ic_rainy_on_primary
    }
}


fun WeatherType.getImageResourceOnSecondary(): Int {
    return when (this) {
        WeatherType.SUNNY -> R.drawable.ic_sunny_on_secondary
        WeatherType.PARTLY_SUNNY -> R.drawable.ic_partly_cloudy_on_secondary
        WeatherType.CLOUDY -> R.drawable.ic_cloudy_on_secondary
        WeatherType.RAINY -> R.drawable.ic_rainy_on_secondary
    }
}
