package de.dojo.weather.data.stations

import androidx.room.Dao
import androidx.room.Query

@Dao
interface StationDAO {
    @Query("SELECT * FROM stations WHERE name LIKE '%' || :name || '%'")
    suspend fun findByName(name: String): List<Station>

    @Query("SELECT * FROM stations WHERE id LIKE :id")
    fun findById(id: String): Station

    @Query("SELECT * FROM stations")
    fun getAll(): List<Station>
}
