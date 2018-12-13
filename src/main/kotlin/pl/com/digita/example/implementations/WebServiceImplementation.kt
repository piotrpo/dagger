package pl.com.digita.example.implementations

import pl.com.digita.example.interfaces.EventBus
import pl.com.digita.example.interfaces.WebService
import javax.inject.Inject

class WebServiceImplementation @Inject constructor(webServiceConfiguration: WebServiceConfiguration, eventBus: EventBus) : WebService {
}