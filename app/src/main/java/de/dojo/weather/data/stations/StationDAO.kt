package de.dojo.weather.data.stations

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface StationDAO {
    @Query("SELECT * FROM stations WHERE name LIKE '%' || :name || '%'")
    fun findByName(name: String): List<Station>

    @Query("SELECT * FROM stations WHERE id LIKE :id")
    fun findById(id: String): Station

    @Query("SELECT * FROM stations")
    fun getAll(): List<Station>

    @Query("SELECT * FROM stations WHERE saved = 1")
    fun getSavedStations(): Flow<List<Station>>

    @Query("UPDATE stations SET saved=1 WHERE id = :id")
    fun saveStation(id: String)

    @Query("UPDATE stations SET saved=0 WHERE id = :id")
    fun unsaveStation(id: String)
}
