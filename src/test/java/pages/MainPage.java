package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MainPage {
    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://demoqa.com/");
    }

    public WebElement getElements() {
        return driver.findElement(By.xpath("//*[text()='Elements']"));
    }

    public void hoverOverElements() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement elements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Elements']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elements);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elements);
    }

    public void checkPage() {
        String expectedUrl = "https://demoqa.com/elements";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Не удалось перейти на ожидаемую страницу!");
    }
}
