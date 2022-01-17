package de.dojo.weather.ui.WeatherScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.statusBarsPadding
import de.dojo.weather.data.Weather
import de.dojo.weather.data.WeatherRepository
import de.dojo.weather.ui.composables.ForecastSlider
import de.dojo.weather.ui.composables.WeatherTable

@Composable
fun WeatherScreen(
    currentLocation: String,
    onSettingsClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val currentWeather = WeatherRepository.getCurrentWeather(currentLocation)

    LazyColumn(
        modifier = modifier.statusBarsPadding()
    ) {
        item {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = currentWeather.place,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier.padding(20.dp)
                )
                IconButton(onClick = onSettingsClick) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = null)
                }
            }
        }
        item {
            WeatherTable(
                weather = currentWeather,
                modifier = Modifier.padding(horizontal = 20.dp)
            )
        }
        item {
            ForecastSlider(
                forecast = currentWeather.todaysForecast,
                modifier = Modifier.padding(top = 32.dp, start = 20.dp, end = 20.dp)
            )
        }
    }
}

