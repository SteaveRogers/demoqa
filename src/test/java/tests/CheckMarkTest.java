package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckMarkTest extends BasicClassTest {

    @Test
    public void checkMark() {
        mainPage.open();
        mainPage.hoverOverElements();
        mainPage.checkPage();
        elementsPage.clickCheckBox();
        checkPage.clickCheckMark();
        Assert.assertEquals
                (
                        checkPage.checkMark(),
                        "You have selected :\n" +
                                "desktop\n" +
                                "notes\n" +
                                "commands\n" +
                                "veu\n" +
                                "downloads\n" +
                                "wordFile\n" +
                                "excelFile"
                );
    }
}
