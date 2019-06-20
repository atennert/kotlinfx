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
    val pane = fxmlLoader.load<Pane>() // this loads VBox, but VBox is an extension of Pane

    val scene = Scene(pane)

    stage?.title = "MyApp"
    stage?.scene = scene

    stage?.show()
}