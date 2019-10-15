package de.atennert.kotlinfx

import javafx.scene.control.Button
import javafx.stage.Stage
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.testfx.api.FxAssert
import org.testfx.api.FxToolkit
import org.testfx.framework.junit5.ApplicationTest
import org.testfx.matcher.control.LabeledMatchers

/**
 * Test for MyView and MyController.
 */
class UITest : ApplicationTest() {
    override fun start(stage: Stage?) {
        MyApplication.loadStage(stage)
        stage?.toFront()
    }

    @BeforeEach
    fun setup() {
    }

    @AfterEach
    fun tearDown() {
        FxToolkit.hideStage()
    }

    @Test
    fun `check that button exists`()
            = FxAssert.verifyThat<Button>("#myButton") {it != null}

    @Test
    fun `check initial label text`()
            = FxAssert.verifyThat("#myLabel", LabeledMatchers.hasText("Hello World"))

    @Test
    fun `change label text`() {
        val testString = "test"

        clickOn("#myText")
        write(testString)
        clickOn("#myButton")

        FxAssert.verifyThat("#myLabel", LabeledMatchers.hasText(testString))
    }
}
