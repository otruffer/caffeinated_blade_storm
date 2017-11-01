package ch.truffer.oskar.view

import ch.truffer.oskar.controller.MainController
import javafx.geometry.Insets
import tornadofx.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CoffeeShopView @Inject constructor(
        private var controller: MainController
): View("Hello TornadoFX + Dagger2") {

    override val root = borderpane {
        padding = Insets(10.0)

        top {
            label("Welcome to the coffeshop!") {
                padding = Insets(10.0)
            }
        }

        center {
            vbox {
                button("Make coffee in new Window") {
                    padding = Insets(10.0)
                    useMaxWidth = true
                    action { controller.makeCoffeeInNewWindow() }
                }

                label("Take a seat, you're coffee will be ready in a few seconds!") {
                    padding = Insets(10.0)
                    visibleWhen(controller.isBrewing)
                }
            }
        }
    }
}