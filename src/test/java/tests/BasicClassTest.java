package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;

public class BasicClassTest {
    WebDriver driver;
    MainPage mainPage;
    ElementsPage elementsPage;
    TextPage textPage;
    CheckPage checkPage;
    RadioButtonPage radioButtonPage;
    WebTablesPage webTablesPage;
    ButtonsPage buttonsPage;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.setCapability("pageLoadStrategy", "eager");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        mainPage = new MainPage(driver);
        elementsPage = new ElementsPage(driver);
        textPage = new TextPage(driver);
        checkPage = new CheckPage(driver);
        radioButtonPage = new RadioButtonPage(driver);
        webTablesPage = new WebTablesPage(driver);
        buttonsPage = new ButtonsPage(driver);
    }

    public void checkData() {
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
