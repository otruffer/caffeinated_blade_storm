package ch.truffer.oskar.model

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = arrayOf(PumpModule::class))
internal class DripCoffeeModule {
    @Provides
    @Singleton
    fun provideHeater(): Heater {
        return ElectricHeater()
    }
}