package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CheckPage {
    WebDriver driver;

    By checkMark = By.xpath("//span[.//*[text()='Home']]//button");
    By checkMarkDesktop = By.xpath("//span[.//*[text()='Desktop']]//button");
    By documents = By.xpath("//span[.//*[text()='Documents']]//button");
    By workSpaces = By.xpath("//span[.//*[text()='WorkSpace']]//button");
    By checkDownloads = By.xpath("//span[.//*[text()='Downloads']]//button");
    By desktop = By.xpath("//*[text()='Desktop']");
    By veu = By.xpath("//*[text()='Veu']");
    By downloads = By.xpath("//*[text()='Downloads']");
    By result = By.xpath("//div[@class='display-result mt-4']");

    public CheckPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://demoqa.com/checkbox");
    }

    public void scrollToElement(By element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(element));
    }

    public void clickCheckMark() {
        driver.findElement(checkMark).click();
        scrollToElement(downloads);
        driver.findElement(checkMarkDesktop).click();
        driver.findElement(desktop).click();
        driver.findElement(documents).click();
        driver.findElement(workSpaces).click();
        driver.findElement(veu).click();
        driver.findElement(checkDownloads).click();
        driver.findElement(downloads).click();
    }

    public String checkMark() {
        return driver.findElement(result).getText();
    }
}
