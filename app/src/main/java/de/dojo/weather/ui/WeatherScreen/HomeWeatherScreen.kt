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
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import de.dojo.weather.data.repository.Forecast
import de.dojo.weather.data.repository.Result
import de.dojo.weather.data.repository.displayName
import de.dojo.weather.ui.composables.ForecastSlider
import de.dojo.weather.ui.composables.WeatherTable
import de.dojo.weather.util.isCurrentHour
import de.dojo.weather.util.isLaterCurrentDay

@Composable
fun HomeWeatherScreen(
    onSettingsClick: () -> Unit,
    onWeatherDetailClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val viewModel = hiltViewModel<HomeWeatherViewModel>()
    val currentWeather = viewModel.currentWeather.collectAsState()

    when (val current = currentWeather.value) {
        is Result.Success -> HomeWeatherSuccessView(
            forecast = current.data,
            onSettingsClick = onSettingsClick,
            onWeatherDetailClick = onWeatherDetailClick,
            modifier = modifier
        )
    }
}

@Composable
fun HomeWeatherSuccessView(
    forecast: Forecast,
    onSettingsClick: () -> Unit,
    onWeatherDetailClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val currentWeather = forecast.weatherData.first { it.date.isCurrentHour() }

    LazyColumn(
        modifier = modifier
    ) {
        item {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = forecast.station.displayName(),
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
                forecast = forecast.weatherData.filter { it.date.isLaterCurrentDay() },
                onWeatherDetailClick = onWeatherDetailClick,
                modifier = Modifier.padding(top = 32.dp, start = 20.dp, end = 20.dp)
            )
        }
    }
}

