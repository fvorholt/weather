package de.dojo.weather.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import de.dojo.weather.composables.HomeScreen
import de.dojo.weather.ui.SettingsScreen.SettingsScreen
import de.dojo.weather.ui.WeatherDetailScreen.WeatherDetailScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(Screen.HomeScreen.route) {
            HomeScreen()
        }
        composable(Screen.DetailScreen.route) {
            WeatherDetailScreen()
        }
        composable(Screen.SettingsScreen.route) {
            SettingsScreen(onApplySettings = {})
        }
    }
}
