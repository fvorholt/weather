package de.dojo.weather.ui.screens.settings

import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.insets.ExperimentalAnimatedInsets
import com.google.accompanist.insets.rememberImeNestedScrollConnection
import de.dojo.weather.data.stations.Station

@OptIn(
    ExperimentalAnimatedInsets::class,
    androidx.compose.animation.ExperimentalAnimationApi::class
)
@Composable
fun SettingsScreen(
    onApplySettings: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val viewModel = hiltViewModel<SettingsViewModel>()

    val stations = viewModel.stations.collectAsState(initial = listOf())

    var addStationText by remember { mutableStateOf("") }

    Column(
        modifier = modifier.padding(16.dp)
    ) {
        Text(
            text = "Stations",
            style = MaterialTheme.typography.h5,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        OutlinedTextField(
            value = addStationText,
            label = { Text(text = "Add station") },
            trailingIcon = {
                AnimatedVisibility(
                    visible = addStationText.isNotBlank(),
                    enter = fadeIn(),
                    exit = fadeOut()
                ) {
                    IconButton(
                        onClick = {
                            addStationText = ""
                            viewModel.findStations("")
                        }
                    ) {
                        Icon(imageVector = Icons.Default.Close, contentDescription = "Remove query")
                    }
                }
            },
            onValueChange = {
                addStationText = it
                viewModel.findStations(it)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp )
        )
        StationList(
            stations = stations.value,
            onStationClick = viewModel::stationSelected,
            onRemoveStationClick = viewModel::removeStation,
            modifier = Modifier.weight(1f)
        )
    }
}

@OptIn(ExperimentalAnimatedInsets::class)
@Composable
fun StationList(
    stations: List<Station>,
    onStationClick: (String) -> Unit,
    onRemoveStationClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Log.d("Fabian", "Compose stations: $stations")

    LazyColumn(
        modifier = modifier.nestedScroll(connection = rememberImeNestedScrollConnection())
    ) {
        items(stations) {
            StationRow(
                station = it,
                onStationClick = onStationClick,
                onRemoveStationClick = onRemoveStationClick
            )
        }
    }
}

@Composable
fun StationRow(
    station: Station,
    onStationClick: (String) -> Unit,
    onRemoveStationClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .clickable { onStationClick(station.id) }
            .padding(vertical = 8.dp)
            .padding(start = 8.dp)
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = station.name
            )
            Text(
                text = "${station.region ?: ""}",
                style = MaterialTheme.typography.caption,
                color = Color.Gray,
                fontSize = 12.sp
            )
        }
        if (station.saved) {
            IconButton(
                onClick = { onRemoveStationClick(station.id) }
            ) {
                Icon(imageVector = Icons.Default.Close, contentDescription = null)
            }
        }
    }
}


