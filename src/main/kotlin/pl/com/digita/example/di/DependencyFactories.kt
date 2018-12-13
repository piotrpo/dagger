package pl.com.digita.example.di

import dagger.Module
import dagger.Provides
import pl.com.digita.example.implementations.DatabaseConfiguration
import pl.com.digita.example.implementations.WebServiceConfiguration
import java.time.Clock

class DependencyFactories {
    @Module
    companion object {
        @Provides
        fun databaseConfiguration() = DatabaseConfiguration()

        @Provides
        fun webServiceConfiguration() = WebServiceConfiguration()

        @Provides
        fun clock() = Clock.systemUTC()
    }
}