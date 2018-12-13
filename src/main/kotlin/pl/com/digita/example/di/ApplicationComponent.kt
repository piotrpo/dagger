package pl.com.digita.example.di

import dagger.Component
import pl.com.digita.example.implementations.Application

@Component(modules = arrayOf(DependencyFactories.Companion::class, Bindings::class))
interface ApplicationComponent{
    fun makeApplication(): Application
}