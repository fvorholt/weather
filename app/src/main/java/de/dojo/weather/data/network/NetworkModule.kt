package de.dojo.weather.data.network

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import de.dojo.weather.data.repository.DWDRepository
import de.dojo.weather.data.repository.StationRepository
import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.features.logging.*
import io.ktor.http.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideHttpClient(): HttpClient {
        return HttpClient {
            install(Logging)

            defaultRequest {
                url {
                    protocol = URLProtocol.HTTPS
                    host = "opendata.dwd.de"
                }
            }
        }
    }

    @Provides
    @Singleton
    fun provideDWDBackend(httpClient: HttpClient): DWDBackend {
        return DWDBackend(client = httpClient)
    }

    @Provides
    @Singleton
    fun provideDWDRepository(dwdBackend: DWDBackend): DWDRepository {
        return DWDRepository(dwdBackend = dwdBackend)
    }

    @Provides
    @Singleton
    fun provideStationRepository(): StationRepository {
        return StationRepository
    }
}
