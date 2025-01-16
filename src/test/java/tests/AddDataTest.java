package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddDataTest extends BasicClassTest {

    @Test
    public void checkCorrectData() {
        mainPage.open();
        mainPage.hoverOverElements();
        mainPage.checkPage();
        elementsPage.clickTextBox();
        textPage.addData
                (
                        "test",
                        "test@gmail.com",
                        "test",
                        "test"
                );
        textPage.clickButton();
        Assert.assertEquals
                (
                        textPage.checkName(),
                        "Name:test",
                        "Error message");
        Assert.assertEquals
                (
                        textPage.checkEmail(),
                        "Email:test@gmail.com",
                        "Error message"
                );
        Assert.assertEquals
                (
                        textPage.checkCurrent(),
                        "Current Address :test",
                        "Error message"
                );
        Assert.assertEquals
                (
                        textPage.checkPermanent(),
                        "Permananet Address :test",
                        "Error message"
                );
    }
}
