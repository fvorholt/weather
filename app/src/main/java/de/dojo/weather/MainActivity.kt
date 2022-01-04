package de.dojo.weather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import dagger.hilt.android.AndroidEntryPoint
import de.dojo.weather.composables.HomeScreen
import de.dojo.weather.ui.home.HomeViewModel
import de.dojo.weather.ui.theme.WeatherTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WeatherTheme {
                // A surface container using the 'background' color from the theme
                Scaffold {
                    HomeScreen(
                        viewModel = viewModel,
                        modifier = Modifier.padding(it)
                    )
                }
            }
        }
    }
}
