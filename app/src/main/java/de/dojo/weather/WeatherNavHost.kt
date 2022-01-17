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
    startDestination: String = "weather"
) {
    NavHost(navController, startDestination) {
        composable("weather") {
            WeatherScreen(currentLocation = "headquarter",
                onSettingsClick = {
                    navController.navigate("setting")
                }, onDetailClick = {
                    navController.navigate("weather_detail")
                }
            )
        }
        composable("setting") { SettingsScreen(onApplySettings = {}) }
        composable("weather_detail") {
            WeatherDetailScreen(
                location = "headquarter",
                onBackClick = { navController.navigateUp() }
            )
        }

    }
}