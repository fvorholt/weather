package de.dojo.weather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.insets.ProvideWindowInsets
import de.dojo.weather.data.WeatherRepository
import de.dojo.weather.ui.WeatherScreen.WeatherScreen
import de.dojo.weather.ui.theme.WeatherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            WeatherTheme {
                ProvideWindowInsets {
                    val navHostController = rememberNavController()
                    WeatherNavHost(navController = navHostController)
                }
            }
        }
    }
}
