package de.dojo.weather.data.stations

import javax.inject.Inject

class StationRepository @Inject constructor(private val stationDAO: StationDAO) {

    suspend fun findStation(name: String): List<Station> {
        return stationDAO.findByName(name)
    }

}