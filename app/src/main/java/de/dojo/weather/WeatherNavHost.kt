package de.dojo.weather

import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import de.dojo.weather.ui.SettingsScreen.SettingsScreen
import de.dojo.weather.ui.WeatherDetailScreen.WeatherDetailScreen
import de.dojo.weather.ui.WeatherScreen.WeatherScreen

private const val locationArgumentPlaceholder = "location"

@Composable
fun WeatherNavHost(
    navController: NavHostController,
) {
    var location: String by remember {
        mutableStateOf("headquarter")
    }
    val startDestination: String = WeatherDestination.Weather(location = location).getLink()

    NavHost(navController, startDestination) {
        composable(
            route = WeatherDestination.Weather(location = location).getRoute(),
            arguments = listOf(navArgument(locationArgumentPlaceholder) {})
        ) {
            WeatherScreen(
                currentLocation = location,
                onSettingsClick = {
                    navController.navigate(WeatherDestination.Settings(location = location).getLink())
                },
                onDetailClick = {
                    navController.navigate(WeatherDestination.Weather(location = location).getLink())
                }
            )
        }
        composable(WeatherDestination.Settings(location = location).getLink()) {
            SettingsScreen(
                currentLocation = location,
                onApplySettings = { chosenLocation ->
                    location = chosenLocation
                    navController.navigateUp()
                })
        }
        composable(WeatherDestination.WeatherDetail(location = location).getLink()) {
            WeatherDetailScreen(
                location = "headquarter",
                onBackClick = { navController.navigateUp() }
            )
        }

    }
}

private sealed class WeatherDestination(
    val destination: String,
    open val location: String,
) {

    fun getRoute(): String = "$destination?location={$locationArgumentPlaceholder}"

    fun getLink(): String = "$destination?location=$location"

    data class Weather(override val location: String) :
        WeatherDestination(destination = "WEATHER", location = location)

    data class WeatherDetail(override val location: String) :
        WeatherDestination(destination = "WEATHER_DETAIL", location = location)

    data class Settings(override val location: String) :
        WeatherDestination(destination = "SETTINGS", location = location)
}
