package de.dojo.weather.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import de.dojo.weather.data.repository.DWDRepository
import de.dojo.weather.data.repository.Forecast
import de.dojo.weather.data.repository.Result
import de.dojo.weather.data.repository.StationRepository
import de.dojo.weather.data.repository.WeatherStation
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    val repository: DWDRepository,
    val stationRepository: StationRepository
) : ViewModel() {

    private var _weatherData: MutableStateFlow<Result<Forecast>> =
        MutableStateFlow(Result.Loading())
    val weatherData: Flow<Result<Forecast>> = _weatherData

    private var _stationNames = stationRepository.stationNames

    private var _filteredStationData: MutableStateFlow<List<String>> = MutableStateFlow(listOf())
    val filteredStationData: Flow<List<String>> = _filteredStationData

    private var _currentStation = MutableStateFlow(
        WeatherStation(stationId = "P0489", stationName = "")
    )

    init {
        requestForecast()
    }

    fun onStationNameSelected(name: String) {
        _currentStation.tryEmit(stationRepository.getWeatherStation(name))
        onFilterChanged("")
        requestForecast()
    }

    fun onFilterChanged(filter: String) {
        if (filter.isNotBlank()) {
            _filteredStationData.tryEmit(_stationNames.filter {
                it.contains(filter, ignoreCase = true)
            })
        } else {
            _filteredStationData.tryEmit(listOf())
        }
    }

    private fun requestForecast() {
        _weatherData.tryEmit(Result.Loading())
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) {
                repository.getForecast(_currentStation.value.stationId)  // Lübeck "10156"
            }
            _weatherData.emit(result)
        }
    }
}
