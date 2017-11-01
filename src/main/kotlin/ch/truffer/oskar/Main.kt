package ch.truffer.oskar

import ch.truffer.oskar.model.DaggerCoffeeShop
import javafx.application.Application
import javafx.stage.Stage
import tornadofx.*

fun main(args: Array<String>) {
    Application.launch(MainApp::class.java, *args)
}

class MainApp : App(null /**, Stylesheet1::class, Stylesheet2::class **/) {

    /**
     * Here we start dagger's DI.
     */
    private var coffeeShop = DaggerCoffeeShop.builder().build()

    /**
     * This is an override needed for us to start with Dagger as Dependency Injection Framework
     * instead of TornadoFXs dependency injection.
     */
    override fun start(stage: Stage) {
        FX.registerApplication(scope, this, stage)

        try {
            val view = coffeeShop.mainView()

            stage.apply {
                //                view.muteDocking = true
                scene = createPrimaryScene(view)
                view.properties["tornadofx.scene"] = scene
                FX.applyStylesheetsTo(scene)
                titleProperty().bind(view.titleProperty)
                hookGlobalShortcuts()
                onBeforeShow(view)
                if (shouldShowPrimaryStage()) show()
            }
            FX.initialized.value = true
        } catch (ex: Exception) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), ex)
        }
    }

}