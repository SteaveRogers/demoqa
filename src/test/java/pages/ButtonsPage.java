package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ButtonsPage {
    WebDriver driver;

    By doubleClick = By.xpath("//*[@class='btn btn-primary'and contains(text(), 'Double Click Me')]");
    By rightClick = By.xpath("//button[@type='button' and text()='Right Click Me']");
    By clickMe = By.xpath("//*[@class='btn btn-primary' and text()='Click Me']");
    By messageDoubleClick = By.xpath("//*[@id='doubleClickMessage']");
    By messageRightClick = By.xpath("//*[@id='rightClickMessage']");
    By messageClickMe = By.xpath("//*[@id='dynamicClickMessage']");

    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://demoqa.com/buttons");
    }

    public void doubleClick() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(doubleClick));
        Actions actions = new Actions(driver);
        actions.doubleClick(button).perform();
    }

    public void rightClick() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(rightClick));
        Actions actions = new Actions(driver);
        actions.contextClick(button).perform();
    }

    public void click() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(clickMe));
        button.click();
    }

    public String checkDoubleClick() {
        return driver.findElement(messageDoubleClick).getText();
    }

    public String checkRightClick() {
        return driver.findElement(messageRightClick).getText();
    }

    public String checkClickMe() {
        return driver.findElement(messageClickMe).getText();

    }

    public void scrollTo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Прокрутка к элементу
        WebElement elements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//button[@type='button' and text()='Double Click Me']"))
        );
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elements);

        // JavaScript клик
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elements);
    }
}
