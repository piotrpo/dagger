package pl.com.digita.example.di

import dagger.Binds
import dagger.Module
import pl.com.digita.example.implementations.EventBusImplementation
import pl.com.digita.example.implementations.RepositoryImplementation
import pl.com.digita.example.implementations.WebServiceImplementation
import pl.com.digita.example.interfaces.EventBus
import pl.com.digita.example.interfaces.Repository
import pl.com.digita.example.interfaces.WebService

@Module
abstract class AutoBindingModule {
    @Binds
    abstract fun repository(repositoryImplementation: RepositoryImplementation): Repository

    @Binds
    abstract fun webService(webService: WebServiceImplementation): WebService

    @Binds
    abstract fun eventBus(eventBus: EventBusImplementation): EventBus
}