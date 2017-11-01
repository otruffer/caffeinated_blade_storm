package ch.truffer.oskar.model

import ch.truffer.oskar.view.CoffeeShopView
import ch.truffer.oskar.view.CoffeeView
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(DripCoffeeModule::class))
interface CoffeeShop {

    /**
     * As seen in the
     */
    fun maker(): CoffeeMaker
    fun mainView(): CoffeeShopView
    fun coffeeView(): CoffeeView
}

