package de.dojo.weather

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import de.dojo.weather.ui.SettingsScreen.SettingsScreen
import de.dojo.weather.ui.WeatherDetailScreen.WeatherDetailScreen
import de.dojo.weather.ui.WeatherScreen.WeatherScreen

@Composable
fun WeatherNavHost(
    navController: NavHostController,
    startDestination: String = WeatherDestination.WEATHER.name
) {
    NavHost(navController, startDestination) {
        composable(WeatherDestination.WEATHER.name) {
            WeatherScreen(currentLocation = "headquarter",
                onSettingsClick = {
                    navController.navigate(WeatherDestination.SETTINGS.name)
                }, onDetailClick = {
                    navController.navigate(WeatherDestination.WEATHER_DETAIL.name)
                }
            )
        }
        composable(WeatherDestination.SETTINGS.name) { SettingsScreen(onApplySettings = {}) }
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