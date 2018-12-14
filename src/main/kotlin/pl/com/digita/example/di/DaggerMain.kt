package pl.com.digita.example.di

import java.time.Clock

fun main() {
    val app = DaggerApplicationComponent.builder()
            .clock(Clock.systemUTC())
            .build()
            .application
    app.makeSomeStuff()
}

