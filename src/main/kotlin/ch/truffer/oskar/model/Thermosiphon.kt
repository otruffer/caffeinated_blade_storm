package ch.truffer.oskar.model

import javax.inject.Inject

internal class Thermosiphon @Inject
constructor(private val heater: Heater) : Pump {

    override fun pump() {
        if (heater.isHot) {
            println("=> => pumping => =>")
        }
    }
}