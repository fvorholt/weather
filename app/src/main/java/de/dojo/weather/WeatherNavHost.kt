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
    var location: String by remember { mutableStateOf("headquarter") }

    // Needs to be the template like url without any argument. Argument has to be passed through the
    // defaultValue in navArgument
    val startDestination: String = WeatherDestination.Weather(location = location).getRoute()

    NavHost(navController, startDestination) {
        composable(
            route = WeatherDestination.Weather(location = location).getRoute(),
            arguments = listOf(
                navArgument("location") { defaultValue = "headquarter" }
            )
        ) {
            WeatherScreen(
                currentLocation = location,
                onSettingsClick = {
                    navController.navigate(
                        WeatherDestination.Settings(location = location).getLink()
                    )
                },
                onDetailClick = {
                    navController.navigate(
                        WeatherDestination.WeatherDetail(location = location).getLink()
                    )
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
                location = location,
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
        WeatherDestination(destination = "weather", location = location)

    data class WeatherDetail(override val location: String) :
        WeatherDestination(destination = "weather_detail", location = location)

    data class Settings(override val location: String) :
        WeatherDestination(destination = "settings", location = location)
}
