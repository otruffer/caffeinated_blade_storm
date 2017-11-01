package ch.truffer.oskar.view

import tornadofx.*
import javax.inject.Inject

class CoffeeView @Inject constructor(): View("Hello TornadoFX") {
    override val root = borderpane {
        center {
            label("Here's your coffee sir!")
        }
    }
}