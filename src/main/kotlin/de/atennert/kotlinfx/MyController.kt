package de.atennert.kotlinfx

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.TextField

/**
 * Controller for my-view.fxml.
 */
class MyController {

    @FXML
    private lateinit var myLabel: Label

    @FXML
    private lateinit var myText: TextField

    fun updateLabel(event: ActionEvent) {
        myLabel.text = myText.text
    }
}