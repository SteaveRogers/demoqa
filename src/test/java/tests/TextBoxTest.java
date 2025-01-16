package tests;

import org.testng.annotations.Test;

public class TextBoxTest extends BasicClassTest {

    @Test
    public void addData() {
        mainPage.open();
        mainPage.hoverOverElements();
        mainPage.checkPage();
    }
}
