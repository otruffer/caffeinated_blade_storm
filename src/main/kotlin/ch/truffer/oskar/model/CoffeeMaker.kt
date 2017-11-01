package ch.truffer.oskar.model

import dagger.Lazy
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class CoffeeMaker @Inject constructor(
        private val heater: Lazy<Heater>,
        private val pump: Pump) {

    fun brew() {
        heater.get().on()
        TimeUnit.SECONDS.sleep(1)
        pump.pump()
        TimeUnit.SECONDS.sleep(1)
        println(" [_]P coffee! [_]P ")
        TimeUnit.SECONDS.sleep(1)
        heater.get().off()
    }
}