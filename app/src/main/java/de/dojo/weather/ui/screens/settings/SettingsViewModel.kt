package de.dojo.weather.ui.screens.settings

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import de.dojo.weather.data.stations.Station
import de.dojo.weather.data.stations.StationRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor(
    private val stationRepository: StationRepository
) : ViewModel() {
    private val searchedStations: MutableStateFlow<List<Station>> = MutableStateFlow(listOf())
    private val savedStations: Flow<List<Station>> = stationRepository.getSavedStations()

    val stations: Flow<List<Station>>
        get() {
            return if (searchedStations.value.isEmpty()) {
                savedStations
            } else {
                searchedStations
            }
        }

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

    fun stationSelected(id: String) {
        addStationToFavorites(id)
        // todo add to data store
    }

    fun removeStation(id: String) {
        removeStationFromFavorites(id)
    }

    private fun addStationToFavorites(id: String) {
        stationRepository.saveStation(id)
    }

    private fun removeStationFromFavorites(id: String) {
        stationRepository.unsaveStation(id)
    }

}