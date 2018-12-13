package pl.com.digita.example.implementations

import pl.com.digita.example.interfaces.Repository
import pl.com.digita.example.interfaces.WebService
import javax.inject.Inject

class Application @Inject constructor(val repository: Repository, val webService: WebService) {
    fun makeSomeStuff(){}
}