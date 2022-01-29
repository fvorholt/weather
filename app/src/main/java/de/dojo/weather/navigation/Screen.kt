package de.dojo.weather.navigation

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home")
    object DetailScreen : Screen("detail")
    object SettingsScreen : Screen("settings")
}
