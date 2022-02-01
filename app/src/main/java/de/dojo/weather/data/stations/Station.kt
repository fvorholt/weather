package de.dojo.weather.data.stations

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "stations")
data class Station(
    @PrimaryKey val id: String,
    val name: String,
    val region: String?
)