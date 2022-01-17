package de.dojo.weather.ui.composables

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.dojo.weather.data.WeatherForecast
import de.dojo.weather.data.WeatherRepository
import de.dojo.weather.data.getImageResourceOnPrimary
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Composable
fun WeatherListItem(
    weatherForecast: WeatherForecast,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.padding(all = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = weatherForecast.weatherType.getImageResourceOnPrimary()),
            modifier = Modifier.size(32.dp),
            contentDescription = null
        )

        Spacer(modifier = Modifier.width(32.dp))


        Text(
            text = "${getDateTimeFromDate(weatherForecast.dateTime)}, ",
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Text(
            text = getDayAndMonthFromDateTime(weatherForecast.dateTime),
            color = Color.White.copy(alpha = 0.6f)
        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = "${weatherForecast.highestTemperature}",
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Text(
            text = "/${weatherForecast.lowestTemperature}°",
            color = Color.White.copy(alpha = 0.6f)
        )
    }
}

@Composable
fun WeatherList(forecasts: List<WeatherForecast>) {
    Column {
        forecasts.forEach { forecast ->
            WeatherListItem(
                weatherForecast = forecast,
                modifier = Modifier.padding(all = 16.dp)
            )
        }
    }
}

private fun getDateTimeFromDate(date: LocalDateTime): String =
    DateTimeFormatter.ofPattern("EEEE").format(date)

private fun getDayAndMonthFromDateTime(date: LocalDateTime) =
    DateTimeFormatter.ofPattern("dd MMM").format(date)

@Preview(
    uiMode = UI_MODE_NIGHT_NO,
    name = "Day mode",
    showBackground = true,
    widthDp = 200
)
@Composable
fun MockWeatherListItem0() {
    WeatherList(forecasts = WeatherRepository.getCurrentForecast("headquarter"))
}
