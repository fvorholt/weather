package de.dojo.weather.data.stations

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Station::class], version = 1)
abstract class StationDatabase : RoomDatabase() {
    abstract fun stationDao(): StationDAO
}