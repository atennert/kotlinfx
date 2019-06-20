package de.atennert.kotlinfx

/**
 *
 */
fun main() {
    val printFun = {println("Hello World")}
    Thread(printFun).start()

    // Start the UI
    MyView.run()
}