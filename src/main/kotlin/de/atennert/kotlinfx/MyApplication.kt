package de.atennert.kotlinfx

import javafx.application.Application
import javafx.stage.Stage

/**
 *
 */
class MyApplication : Application() {
    override fun start(primaryStage: Stage?) {
        loadApp(primaryStage)
    }

    companion object {
        /** Runs the de.atennert.kotlinfx.main view. This method is blocking! */
        fun run(): Unit = launch(MyApplication::class.java)
    }
}
