package pl.com.digita.example.implementations

import pl.com.digita.example.interfaces.EventBus
import pl.com.digita.example.interfaces.WebService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WebServiceImplementation @Inject constructor(
        private val webServiceConfiguration: WebServiceConfiguration,
        private val eventBus: EventBus
) : WebService