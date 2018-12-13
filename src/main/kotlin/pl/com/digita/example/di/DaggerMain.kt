package pl.com.digita.example.di

import java.time.Clock

fun main() {
    val app = DaggerAutoApplicationComponent.builder()
            .clock(Clock.systemUTC())
            .build()
            .application
    app.makeSomeStuff()
}

