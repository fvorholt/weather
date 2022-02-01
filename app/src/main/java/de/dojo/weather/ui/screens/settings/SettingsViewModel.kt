package de.dojo.weather.ui.screens.settings

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import de.dojo.weather.data.stations.Station
import de.dojo.weather.data.stations.StationRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor(
    private val stationRepository: StationRepository
) : ViewModel() {

    val savedStations: List<Station> = listOf(
        Station("1", "Lübeck", "SH")
    )

    val searchedStations: MutableStateFlow<List<Station>> = MutableStateFlow(listOf())

    fun findStations(query: String) {
        if (query.isBlank()) {
            searchedStations.tryEmit(listOf())
        } else {
            viewModelScope.launch {
                stationRepository.findStation(query).also {
                    searchedStations.tryEmit(it)
                }
            }
        }
    }

}