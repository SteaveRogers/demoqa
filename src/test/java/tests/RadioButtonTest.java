package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RadioButtonTest extends BasicClassTest {

    @Test
    public void checkRadioButtonYes() {
        mainPage.open();
        mainPage.hoverOverElements();
        mainPage.checkPage();
        elementsPage.clickRadioButton();
        assertEquals
                (
                        radioButtonPage.checkYes(),
                        "You have selected Yes",
                        "Wrong message"
                );
    }

    @Test
    public void checkRadioButtonNo() {
        mainPage.open();
        mainPage.hoverOverElements();
        mainPage.checkPage();
        elementsPage.clickRadioButton();
        assertTrue
                (
                        radioButtonPage.checkNo(),
                        "Сообщения не должно быть"
                );
    }

    @Test
    public void checkRadioButtonImpressive() {
        mainPage.open();
        mainPage.hoverOverElements();
        mainPage.checkPage();
        elementsPage.clickRadioButton();
        assertEquals
                (
                        radioButtonPage.checkImpressive(),
                        "You have selected Impressive",
                        "Wrong message"
                );
    }
}
