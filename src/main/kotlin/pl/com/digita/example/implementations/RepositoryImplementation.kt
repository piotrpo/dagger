package pl.com.digita.example.implementations

import pl.com.digita.example.interfaces.EventBus
import pl.com.digita.example.interfaces.Repository
import java.time.Clock
import javax.inject.Inject

class RepositoryImplementation @Inject constructor(val configuration: DatabaseConfiguration, val clock: Clock, eventBus: EventBus): Repository {
    override fun saveData(data: Any) {
    }
}