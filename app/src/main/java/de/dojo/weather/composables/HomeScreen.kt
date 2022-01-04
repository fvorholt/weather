package de.dojo.weather.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import de.dojo.weather.data.repository.Forecast
import de.dojo.weather.data.repository.Result
import de.dojo.weather.data.repository.Weather
import de.dojo.weather.ui.home.HomeViewModel
import java.text.SimpleDateFormat

@Composable
fun HomeScreen(viewModel: HomeViewModel, modifier: Modifier = Modifier) {
    val forecastModel: State<Result<Forecast>> =
        viewModel.weatherData.collectAsState(initial = Result.Loading())

    Box(modifier = modifier) {
        var filter by remember { mutableStateOf("") }
        val stationNames by viewModel.filteredStationData.collectAsState(initial = listOf())

        Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {

            TextField(value = filter, onValueChange = {
                filter = it
                viewModel.onFilterChanged(filter)
            })
            if (stationNames.isNotEmpty()) {
                LazyColumn {
                    items(count = kotlin.math.min(5, stationNames.size)) {
                        Box(modifier = Modifier.clickable {
                            viewModel.onStationNameSelected(stationNames[it])
                        }) {
                            Text(text = stationNames[it], modifier = Modifier.padding(all = 16.dp))
                        }
                    }
                }
            }

            when (val weatherResult = forecastModel.value) {
                is Result.Success -> {
                    HomeSuccessView(weatherResult.data)
                }
                is Result.Loading -> {
                    HomeLoadingView()
                }
                is Result.Error -> {
                    HomeErrorView()
                }
            }
        }
    }
}

@Composable
fun HomeSuccessView(forecast: Forecast) {
    Column {
        CurrentWeatherBox(forecast.weatherData.first())
        ForecastList(forecast = forecast)
    }
}

@Composable
fun HomeLoadingView() {
    Text(text = "Loading")
}

@Composable
fun HomeErrorView() {
    Text(text = "Error")
}

@Composable
fun CurrentWeatherBox(
    weather: Weather
) {
    Text(text = "Current weather")
}

@Composable
fun ForecastList(forecast: Forecast) {
    Column {
        Text(forecast.station.stationName)
        LazyColumn {
            items(count = forecast.weatherData.size) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Text(
                            SimpleDateFormat.getDateTimeInstance()
                                .format(forecast.weatherData[it].date)
                        )
                        val tempK = forecast.weatherData[it].temperature
                        Text(text = "${(tempK - 272.15).toInt()} °C")
                        Text(forecast.weatherData[it].condition)
                    }
                }
            }
        }
    }
}
