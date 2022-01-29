package de.dojo.weather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.insets.systemBarsPadding
import dagger.hilt.android.AndroidEntryPoint
import de.dojo.weather.ui.theme.WeatherTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            WeatherTheme {
                ProvideWindowInsets {
                    WeatherApp(modifier = Modifier.systemBarsPadding())
                }
            }
        }
    }
}
