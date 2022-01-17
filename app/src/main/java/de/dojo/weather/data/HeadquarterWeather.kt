package de.dojo.weather.data

import java.time.LocalDateTime

val headquarterWeather = Weather(
    date = getDate(0),
    place = "gcx headquarter",
    country = "Germany",
    weatherType = WeatherType.PARTLY_SUNNY,
    temperature = 24,
    windSpeed = 2.2f,
    feelsLikeTemperature = 25,
    indexUV = 2,
    pressure = 1014,
    todaysForecast = listOf(
        HourlyForecast(
            dateTime = LocalDateTime.now().plusHours(1),
            weatherType = WeatherType.SUNNY,
            temperature = 32,
        ),
        HourlyForecast(
            dateTime = LocalDateTime.now().plusHours(2),
            weatherType = WeatherType.SUNNY,
            temperature = 31,
        ),
        HourlyForecast(
            dateTime = LocalDateTime.now().plusHours(3),
            weatherType = WeatherType.RAINY,
            temperature = 29,
        ),
        HourlyForecast(
            dateTime = LocalDateTime.now().plusHours(4),
            weatherType = WeatherType.RAINY,
            temperature = 26,
        ),
        HourlyForecast(
            dateTime = LocalDateTime.now().plusHours(5),
            weatherType = WeatherType.CLOUDY,
            temperature = 22,
        ),
        HourlyForecast(
            dateTime = LocalDateTime.now().plusHours(6),
            weatherType = WeatherType.RAINY,
            temperature = 27,
        ),
        HourlyForecast(
            dateTime = LocalDateTime.now().plusHours(7),
            weatherType = WeatherType.PARTLY_SUNNY,
            temperature = 27,
        ),
        HourlyForecast(
            dateTime = LocalDateTime.now().plusHours(8),
            weatherType = WeatherType.PARTLY_SUNNY,
            temperature = 28,
        ),
        HourlyForecast(
            dateTime = LocalDateTime.now().plusHours(9),
            weatherType = WeatherType.SUNNY,
            temperature = 31,
        ),
        HourlyForecast(
            dateTime = LocalDateTime.now().plusHours(10),
            weatherType = WeatherType.SUNNY,
            temperature = 28,
        ),
    )
)

val headquarterForecast = listOf(
    WeatherForecast(
        dateTime = LocalDateTime.now(),
        place = "gcx headquarter",
        weatherType = WeatherType.SUNNY,
        highestTemperature = 32,
        lowestTemperature = 31
    ),
    WeatherForecast(
        dateTime = LocalDateTime.now().plusDays(1),
        place = "gcx headquarter",
        weatherType = WeatherType.RAINY,
        highestTemperature = 22,
        lowestTemperature = 23
    ),
    WeatherForecast(
        dateTime = LocalDateTime.now().plusDays(2),
        place = "gcx headquarter",
        weatherType = WeatherType.SUNNY,
        highestTemperature = 30,
        lowestTemperature = 31
    ),
    WeatherForecast(
        dateTime = LocalDateTime.now().plusDays(3),
        place = "gcx headquarter",
        weatherType = WeatherType.CLOUDY,
        highestTemperature = 24,
        lowestTemperature = 26
    ),
    WeatherForecast(
        dateTime = LocalDateTime.now().plusDays(4),
        place = "gcx headquarter",
        weatherType = WeatherType.PARTLY_SUNNY,
        highestTemperature = 26,
        lowestTemperature = 27
    ),
    WeatherForecast(
        dateTime = LocalDateTime.now().plusDays(5),
        place = "gcx headquarter",
        weatherType = WeatherType.PARTLY_SUNNY,
        highestTemperature = 27,
        lowestTemperature = 28
    ),
    WeatherForecast(
        dateTime = LocalDateTime.now().plusDays(6),
        place = "gcx headquarter",
        weatherType = WeatherType.RAINY,
        highestTemperature = 22,
        lowestTemperature = 23
    ),
)
