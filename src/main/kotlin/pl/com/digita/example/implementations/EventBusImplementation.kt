package pl.com.digita.example.implementations

import pl.com.digita.example.interfaces.EventBus
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class EventBusImplementation @Inject constructor() : EventBus