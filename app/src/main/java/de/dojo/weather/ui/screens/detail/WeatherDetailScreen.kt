package de.dojo.weather.ui.screens.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import de.dojo.weather.data.WeatherRepository
import de.dojo.weather.ui.composables.WeatherList

@Composable
fun WeatherDetailScreen(
    location: String = "headquarter",
    onUpClick: () -> Unit,
    modifier: Modifier = Modifier
) {

    val forecasts = WeatherRepository.getCurrentForecast(location)

    Column(
        modifier = modifier.background(Color(0xFF3B6FFF))
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
            IconButton(onClick = onUpClick) {
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
