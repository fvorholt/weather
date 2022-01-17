package de.dojo.weather

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import de.dojo.weather.ui.WeatherScreen.WeatherScreen

@Composable
fun WeatherNavHost(
    navController: NavHostController,
    startDestination: String = "weather"
) {
    NavHost(navController, startDestination) {
        composable("weather") { WeatherScreen(currentLocation = "headquarter", onSettingsClick = { /*TODO*/ }) }
    }
}