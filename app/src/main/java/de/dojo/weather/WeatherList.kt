package de.dojo.weather

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import de.dojo.weather.data.WeatherForecast
import de.dojo.weather.data.WeatherRepository.forecast
import de.dojo.weather.data.WeatherType.CLOUDY
import de.dojo.weather.data.WeatherType.PARTLY_SUNNY
import de.dojo.weather.data.WeatherType.RAINY
import de.dojo.weather.data.WeatherType.SUNNY
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun WeatherListItem(
    weatherForecast: WeatherForecast
) {
    val weatherDrawable = when (weatherForecast.weatherType) {
        SUNNY -> R.drawable.ic_sunny
        PARTLY_SUNNY -> R.drawable.ic_partly_cloudy
        CLOUDY -> R.drawable.ic_cloudy
        RAINY -> R.drawable.ic_rainy
    }
    Row(
        modifier = Modifier.padding(all = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = weatherDrawable),
            contentDescription = null
        )

        Spacer(modifier = Modifier.width(4.dp))


        Text(
            text = "${getDayFromDate(weatherForecast.date)}, ",
            fontWeight = FontWeight.Bold,
        )

        Text(
            text = getDayAndMonthFromDate(weatherForecast.date),
            fontWeight = FontWeight.Light,
            fontSize = 11.sp,
        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = "${weatherForecast.highestTemperature}",
            fontWeight = FontWeight.Bold,
        )

        Text(
            text = "/${weatherForecast.lowestTemperature}°",
            fontWeight = FontWeight.Light,
            fontSize = 11.sp,
        )
    }
}

@Composable
fun WeatherList(forecasts: List<WeatherForecast>) {
    Column {
        forecasts.forEach { forecast ->
            WeatherListItem(
                weatherForecast = forecast
            )
        }
    }
}

private fun getDayFromDate(date: Date): String =
    SimpleDateFormat("EEEE", Locale.getDefault()).format(date)

private fun getDayAndMonthFromDate(date: Date) =
    SimpleDateFormat("dd MMM", Locale.getDefault()).format(date)

@Preview(
    uiMode = UI_MODE_NIGHT_NO,
    name = "Day mode",
    showBackground = true,
    widthDp = 200
)
@Composable
fun MockWeatherListItem0() {
    WeatherList(forecasts = forecast)
}
