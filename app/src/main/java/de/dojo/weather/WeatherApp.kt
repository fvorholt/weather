package de.dojo.weather

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import de.dojo.weather.navigation.AppNavigation

@Composable
fun WeatherApp(modifier: Modifier = Modifier) {
//    WeatherScreen(
//        currentWeather = WeatherRepository.getCurrentWeather("headquarter"),
//        onSettingsClick = {}
//    )
//                    WeatherDetailScreen("headquarter")
//                    SettingsScreen(onApplySettings = {})
    // A surface container using the 'background' color from the theme
    Scaffold(
        modifier = modifier
    ) {
        AppNavigation()
    }
}
