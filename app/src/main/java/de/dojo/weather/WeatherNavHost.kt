package de.dojo.weather

import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import de.dojo.weather.ui.SettingsScreen.SettingsScreen
import de.dojo.weather.ui.WeatherDetailScreen.WeatherDetailScreen
import de.dojo.weather.ui.WeatherScreen.WeatherScreen

@Composable
fun WeatherNavHost(
    navController: NavHostController,
    startDestination: String = WeatherDestination.WEATHER.name,
) {
    var location: String by remember {
        mutableStateOf("headquarter")
    }

    NavHost(navController, startDestination) {
        composable(WeatherDestination.WEATHER.name) {
            WeatherScreen(currentLocation = location,
                onSettingsClick = {
                    navController.navigate(WeatherDestination.SETTINGS.name)
                }, onDetailClick = {
                    navController.navigate(WeatherDestination.WEATHER_DETAIL.name)
                }
            )
        }
        composable(WeatherDestination.SETTINGS.name) {
            SettingsScreen(onApplySettings = { chosenLocation ->
                location = chosenLocation
                navController.navigateUp()
            })
        }
        composable(WeatherDestination.WEATHER_DETAIL.name) {
            WeatherDetailScreen(
                location = "headquarter",
                onBackClick = { navController.navigateUp() }
            )
        }

    }
}

private enum class WeatherDestination {
    WEATHER,
    WEATHER_DETAIL,
    SETTINGS
}
