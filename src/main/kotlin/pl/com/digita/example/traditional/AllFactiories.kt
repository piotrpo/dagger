package pl.com.digita.example.traditional

import pl.com.digita.example.implementations.*
import java.time.Clock

class AllFactiories {
    companion object {
        fun webServiceImplementation(webServiceConfiguration: WebServiceConfiguration, eventBus: EventBusImplementation) =
                WebServiceImplementation(webServiceConfiguration, eventBus)

        fun webServiceConfiguration() = WebServiceConfiguration()

        fun repositoryImplementation(databaseConfiguration: DatabaseConfiguration, clock: Clock, eventBus: EventBusImplementation) =
                RepositoryImplementation(databaseConfiguration, clock, eventBus)

        fun clock() = Clock.systemUTC()

        fun databaseConfiguration() = DatabaseConfiguration()

        fun eventBusImplementation() = EventBusImplementation()
    }
}