package tests;

import org.testng.annotations.Test;

public class TextBoxesTest extends BasicClassTest {

    @Test
    public void checkTextBox() {
        mainPage.open();
        mainPage.hoverOverElements();
        mainPage.checkPage();
    }
}
