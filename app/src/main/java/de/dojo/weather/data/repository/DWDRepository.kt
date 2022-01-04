package de.dojo.weather.data.repository

import de.dojo.weather.data.network.DWDBackend
import de.dojo.weather.util.parseKML
import de.dojo.weather.util.unzipStream
import javax.inject.Inject

class DWDRepository @Inject constructor(private val dwdBackend: DWDBackend) {
    suspend fun getForecast(stationId: String): Result<Forecast> {
        return try {
            val inputStream = dwdBackend.getWeatherData(stationId = stationId)
            val document = unzipStream(inputStream)
            Result.Success(parseKML(document = document))
        } catch (e: Exception) {
            Result.Error(code = 512, reason = "Parsing failure")
        }
    }
}
