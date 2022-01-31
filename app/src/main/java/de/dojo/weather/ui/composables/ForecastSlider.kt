package de.dojo.weather.ui.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import de.dojo.weather.R
import de.dojo.weather.data.repository.Weather
import de.dojo.weather.data.repository.temperatureCelsius
import de.dojo.weather.util.readableHour

@Composable
fun ForecastSlider(
    forecast: List<Weather>,
    onWeatherDetailClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier.fillMaxWidth()
        ) {
            Text(
                text = "Today",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.h6,
            )
            Row(
                modifier = Modifier.clickable { onWeatherDetailClick() },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Next 7 Days",
                    style = MaterialTheme.typography.h6,
                )
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Go to next 7 Days"
                )
            }
        }
        LazyRow(
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            items(count = forecast.size) { index ->
                ForecastItem(forecast = forecast[index], isFirst = index == 0)
                if (index != forecast.size - 1) {
                    Spacer(modifier = Modifier.size(16.dp))
                }
            }
        }
    }
}


@Composable
fun ForecastItem(forecast: Weather, isFirst: Boolean, modifier: Modifier = Modifier) {
    Card(
        border = BorderStroke(1.dp, color = Color.LightGray),
        elevation = 0.dp,
        shape = RoundedCornerShape(12.dp),
        modifier = modifier.width(48.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = forecast.date.readableHour(),
                modifier = Modifier.padding(vertical = 8.dp),
                style = MaterialTheme.typography.caption,
            )
            Image(
                painter = painterResource(R.drawable.ic_sunny_on_primary),
                contentDescription = null,
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .size(24.dp)
            )
            Text(
                text = "${forecast.temperatureCelsius().toInt()}°",
                modifier = Modifier.padding(vertical = 8.dp),
                style = MaterialTheme.typography.caption,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
