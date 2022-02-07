package de.dojo.weather.data.stations

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.distinctUntilChanged
import javax.inject.Inject

class StationRepository @Inject constructor(private val stationDAO: StationDAO) {

    fun findStation(name: String): List<Station> {
        return stationDAO.findByName(name)
    }

    fun getSavedStations(): Flow<List<Station>> {
        return stationDAO.getSavedStations().distinctUntilChanged()
    }

    fun saveStation(id: String) {
        return stationDAO.saveStation(id)
    }

    fun unsaveStation(id: String) {
        return stationDAO.unsaveStation(id)
    }
}