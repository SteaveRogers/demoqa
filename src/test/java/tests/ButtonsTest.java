package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ButtonsTest extends BasicClassTest {

    @Test
    public void doubleClickButton() {
        mainPage.open();
        mainPage.hoverOverElements();
        mainPage.checkPage();
        elementsPage.clickButtons();
        buttonsPage.doubleClick();
        assertEquals(
                buttonsPage.checkDoubleClick(),
                "You have done a double click",
                "error message"
        );
    }

    @Test
    public void rightClickButton() {
        mainPage.open();
        mainPage.hoverOverElements();
        mainPage.checkPage();
        elementsPage.clickButtons();
        buttonsPage.scrollTo();
        buttonsPage.rightClick();
        assertEquals(
                buttonsPage.checkRightClick(),
                "You have done a right click",
                "error message"
        );
    }

    @Test
    public void dynamicClickButton() {
        mainPage.open();
        mainPage.hoverOverElements();
        mainPage.checkPage();
        elementsPage.clickButtons();
        buttonsPage.scrollTo();
        buttonsPage.click();
        assertEquals(
                buttonsPage.checkClickMe(),
                "You have done a dynamic click",
                "error message");
    }
}
