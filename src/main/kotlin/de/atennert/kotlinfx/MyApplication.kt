package de.atennert.kotlinfx

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafx.stage.Stage

class MyApplication : Application() {
    override fun start(primaryStage: Stage?) {
        loadStage(primaryStage)
    }

    companion object {
        /** Runs the de.atennert.kotlinfx.main view. This method is blocking! */
        fun run(): Unit = launch(MyApplication::class.java)

        fun loadStage(stage: Stage?) {
            val fxmlLoader = FXMLLoader(javaClass.getResource("/my-view.fxml"))
            val pane = fxmlLoader.load<Pane>() // this loads VBox, but VBox is an extension of Pane

            val scene = Scene(pane)

            stage?.title = "MyApp"
            stage?.scene = scene

            stage?.show()
        }
    }
}
