package de.dojo.weather.ui.WeatherScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import de.dojo.weather.data.repository.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

const val currentStation = "10156"

@HiltViewModel
class HomeWeatherViewModel @Inject constructor(
    val repository: DWDRepository,
    val stationRepository: StationRepository
) : ViewModel() {

    var currentWeather: MutableStateFlow<Result<Forecast>> = MutableStateFlow(Result.Loading())
        private set

    init {
        requestForecast()
    }

    private fun requestForecast() {
        currentWeather.value.let { result ->
            when (result) {
                is Result.Success -> currentWeather.tryEmit(Result.Loading(result.data))
                else -> currentWeather.tryEmit(Result.Loading())
            }
        }

        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) {
                repository.getForecast(currentStation)  // Lübeck "10156"
            }

            when (result) {
                is Result.Success -> {
                    currentWeather.tryEmit(Result.Success(result.data))
                }
                else -> {
                    currentWeather.tryEmit(Result.Error(500, "Internal Error"))
                }
            }
        }
    }
}