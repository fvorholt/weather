package de.dojo.weather

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import de.dojo.weather.composables.HomeScreen
import de.dojo.weather.data.WeatherRepository
import de.dojo.weather.ui.WeatherScreen.WeatherScreen

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
        HomeScreen(
            modifier = Modifier.padding(it)
        )
    }
}
