package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTest extends BasicClassTest {

    @Test
    public void addUserData() {
        mainPage.open();
        mainPage.hoverOverElements();
        mainPage.checkPage();
        elementsPage.clickWebTables();
        webTablesPage.registration(
                "Magic",
                "Dragon",
                "dragon@gmail.com",
                "30",
                "250000",
                "IT"
        );
        webTablesPage.search("dragon@gmail.com");
        Assert.assertTrue(webTablesPage.checkUser("Magic"), "wrong user");
    }
}
