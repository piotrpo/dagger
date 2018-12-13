package pl.com.digita.example.traditional

import pl.com.digita.example.implementations.Application
import pl.com.digita.example.traditional.AllFactiories.Companion.clock
import pl.com.digita.example.traditional.AllFactiories.Companion.databaseConfiguration
import pl.com.digita.example.traditional.AllFactiories.Companion.eventBusImplementation
import pl.com.digita.example.traditional.AllFactiories.Companion.repositoryImplementation
import pl.com.digita.example.traditional.AllFactiories.Companion.webServiceConfiguration
import pl.com.digita.example.traditional.AllFactiories.Companion.webServiceImplementation

class ApplicationFactory {

    fun makeApplication(): Application {

        val eventBus = eventBusImplementation();
        val databaseConfiguration = databaseConfiguration()
        val clock = clock()
        val repository = repositoryImplementation(databaseConfiguration, clock, eventBus)
        val webServiceConfiguration = webServiceConfiguration()
        val webService = webServiceImplementation(webServiceConfiguration, eventBus)

        return Application(repository, webService)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val makeApplication = ApplicationFactory().makeApplication()
        }
    }
}