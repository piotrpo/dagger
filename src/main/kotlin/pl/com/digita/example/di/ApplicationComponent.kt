package pl.com.digita.example.di

import dagger.BindsInstance
import dagger.Component
import pl.com.digita.example.implementations.Application
import java.time.Clock
import javax.inject.Singleton

@Singleton
@Component(modules = [BindingModule::class])
interface ApplicationComponent {
    val application: Application

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun clock(clock: Clock): Builder

        fun build(): ApplicationComponent
    }
}