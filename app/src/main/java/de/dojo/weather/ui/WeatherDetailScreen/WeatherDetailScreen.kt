package de.dojo.weather.ui.WeatherDetailScreen

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.statusBarsPadding
import de.dojo.weather.data.WeatherRepository
import de.dojo.weather.ui.composables.WeatherList

@Composable
fun WeatherDetailScreen(
    location: String,
    onBackClick: () -> Unit
) {

    val forecasts = WeatherRepository.getCurrentForecast(location)

    Scaffold(
        backgroundColor = Color(0xFF3B6FFF)
    ) {
        Column(
            modifier = Modifier.statusBarsPadding()
        ) {
            Box(modifier = Modifier.padding(top = 8.dp, start = 8.dp)) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 12.dp)
                ) {
                    Text(
                        text = forecasts.first().place,
                        color = Color.White
                    )
                }
                IconButton(onClick = onBackClick) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        tint = Color.White,
                        contentDescription = "Back"
                    )
                }
            }
            Text(
                text = "Next 7 Days",
                style = MaterialTheme.typography.h6,
                color = Color.White,
                modifier = Modifier.padding(all = 16.dp)
            )
            WeatherList(forecasts = forecasts)
        }
    }
}

@Preview
@Composable
fun WeatherDetailScreenPreview() {
    WeatherDetailScreen(
        location = "headquarter",
        onBackClick = {}
    )
}
