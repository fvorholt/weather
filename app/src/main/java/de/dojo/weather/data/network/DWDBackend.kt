package de.dojo.weather.data.network

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.utils.io.jvm.javaio.*
import java.io.InputStream
import javax.inject.Inject


class DWDBackend @Inject constructor(private val client: HttpClient) {
    suspend fun getWeatherData(stationId: String): InputStream {
        val url =
            "weather/local_forecasts/mos/MOSMIX_L/single_stations/${stationId}/kml/MOSMIX_L_LATEST_${stationId}.kmz"

        val response = client.get<HttpResponse>(url)
        return response.content.toInputStream()
    }
}