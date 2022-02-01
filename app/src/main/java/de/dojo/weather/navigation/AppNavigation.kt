package de.dojo.weather.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import de.dojo.weather.ui.screens.settings.SettingsScreen
import de.dojo.weather.ui.screens.detail.WeatherDetailScreen
import de.dojo.weather.ui.screens.home.HomeWeatherScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(Screen.HomeScreen.route) {
            HomeWeatherScreen(
                onSettingsClick = { navController.navigate(Screen.SettingsScreen.route) },
                onWeatherDetailClick = { navController.navigate(Screen.DetailScreen.route) }
            )
        }
        composable(Screen.DetailScreen.route) {
            WeatherDetailScreen(onUpClick = { navController.navigateUp() })
        }
        composable(Screen.SettingsScreen.route) {
            SettingsScreen(onApplySettings = { navController.navigateUp() })
        }
    }
}
