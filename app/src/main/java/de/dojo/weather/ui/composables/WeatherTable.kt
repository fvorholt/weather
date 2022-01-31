package de.dojo.weather.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import de.dojo.weather.R
import de.dojo.weather.data.repository.Weather
import de.dojo.weather.data.repository.pressureMBar
import de.dojo.weather.data.repository.temperatureCelsius
import java.time.format.DateTimeFormatter

@Composable
fun WeatherTable(weather: Weather, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.fillMaxWidth(),
        backgroundColor = Color(0xFF3F7CF5),
        elevation = 0.dp,
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.ic_sunny_on_primary),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 24.dp)
                    .size(64.dp)
            )
            Text(
                text = weather.condition,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.h6,
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )

            val dateFormatter = DateTimeFormatter.ofPattern("EE, dd MMM HH:MM")
            Text(
                text = weather.date.format(dateFormatter),
                style = MaterialTheme.typography.caption,
                color = Color.White
            )
            Text(
                text = "${weather.temperatureCelsius().toInt()}°",
                style = MaterialTheme.typography.h1,
                color = Color.White,
                modifier = Modifier.padding(24.dp)
            )
            WeatherDateTable(currentWeather = weather)
        }
    }
}

@Composable
fun WeatherDateTable(currentWeather: Weather) {
    Column {
        Divider(color = Color(0xFF61A2F7))
        Row() {
            WeatherTableItem(
                iconId = R.drawable.ic_wind,
                title = "WIND",
                value = "${currentWeather.windSpeed} km/h",
                modifier = Modifier
                    .weight(1f)
                    .height(80.dp)
            )
            Box(
                modifier = Modifier
                    .width(1.dp)
                    .height(80.dp)
                    .background(color = Color(0xFF61A2F7))
            )
            WeatherTableItem(
                iconId = R.drawable.ic_thermostat,
                title = "FEELS LIKE",
                value = "${currentWeather.temperatureCelsius().toInt()}°",
                modifier = Modifier
                    .weight(1f)
                    .height(80.dp)
            )
        }
        Divider(color = Color(0xFF61A2F7))
        Row() {
            WeatherTableItem(
                iconId = R.drawable.ic_sun,
                title = "INDEX UV",
                value = "${currentWeather.precipitation} kg/m2",
                modifier = Modifier
                    .weight(1f)
                    .height(80.dp)
            )
            Box(
                modifier = Modifier
                    .width(1.dp)
                    .height(80.dp)
                    .background(color = Color(0xFF61A2F7))
            )
            WeatherTableItem(
                iconId = R.drawable.ic_pressure,
                title = "PRESSURE",
                value = "${currentWeather.pressureMBar()} mbar",
                modifier = Modifier
                    .weight(1f)
                    .height(80.dp)
            )
        }
    }
}

@Composable
fun WeatherTableItem(iconId: Int, title: String, value: String, modifier: Modifier = Modifier) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(iconId),
            contentDescription = null,
            modifier = Modifier
                .padding(start = 24.dp)
                .size(24.dp)
        )
        Column(modifier = Modifier.padding(20.dp)) {
            Text(
                text = title,
                style = MaterialTheme.typography.caption,
                color = Color.White.copy(alpha = 0.6f)
            )
            Text(
                text = value,
                modifier = Modifier.padding(top = 4.dp),
                style = MaterialTheme.typography.caption,
                color = Color.White
            )
        }
    }
}
