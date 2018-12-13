package pl.com.digita.example.implementations

import pl.com.digita.example.interfaces.Repository
import pl.com.digita.example.interfaces.WebService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Application @Inject constructor(
        private val repository: Repository,
        private val webService: WebService
) {
    fun makeSomeStuff(){}
}