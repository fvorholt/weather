package de.dojo.weather.data.stations

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class StationModule {

    @Provides
    fun provideStationDatabase(@ApplicationContext context: Context): StationDatabase {
        return Room
            .databaseBuilder(context, StationDatabase::class.java, "stations.db")
            .createFromAsset("databases/stations.db")
            .allowMainThreadQueries()
            .build()
    }

    @Provides
    fun provideStationDao(stationDatabase: StationDatabase): StationDAO {
        return stationDatabase.stationDao()
    }

    @Provides
    @Singleton
    fun provideStationRepository(stationDAO: StationDAO): StationRepository {
        return StationRepository(stationDAO = stationDAO)
    }
}