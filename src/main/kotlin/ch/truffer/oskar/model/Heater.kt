package ch.truffer.oskar.model

interface Heater {
    val isHot: Boolean
    fun on()
    fun off()
}