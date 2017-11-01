package ch.truffer.oskar.controller

import ch.truffer.oskar.model.CoffeeMaker
import ch.truffer.oskar.model.CoffeeShop
import javafx.beans.property.SimpleBooleanProperty
import javax.inject.Inject
import tornadofx.*
import javax.inject.Singleton

@Singleton
class MainController @Inject constructor(
        private var coffeeMaker: CoffeeMaker,
        private var coffeeShop: CoffeeShop
) : Controller() {

    var isBrewing = SimpleBooleanProperty(false)

    fun makeCoffeeInNewWindow() {
        runAsync {
            isBrewing.value = true
            coffeeMaker.brew()
        } ui {
            isBrewing.value = false
            coffeeShop.coffeeView().openWindow()
        }

    }
}