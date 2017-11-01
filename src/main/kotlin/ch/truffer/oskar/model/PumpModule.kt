package ch.truffer.oskar.model

import dagger.Binds
import dagger.Module

@Module
internal abstract class PumpModule {
    @Binds
    internal abstract fun providePump(pump: Thermosiphon): Pump
}