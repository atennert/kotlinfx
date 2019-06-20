package de.atennert.kotlinfx

import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafx.stage.Stage

/**
 *
 */
fun loadApp(stage: Stage?) {
    val fxmlLoader = FXMLLoader(ClassLoader.getSystemResource("my-view.fxml"))
    val main = fxmlLoader.load<Pane>()

    val scene = Scene(main)

    stage?.title = "MyApp"
    stage?.scene = scene

    stage?.show()
}