package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextPage {
    WebDriver driver;

    By userName = By.xpath("//input[@id='userName']");
    By userEmail = By.xpath("//input[@id='userEmail']");
    By current = By.xpath("//textarea[@id='currentAddress']");
    By permanent = By.xpath("//textarea[@id='permanentAddress']");
    By button = By.xpath("//button[@id='submit']");
    By checkName = By.xpath("//p[@id='name']");
    By checkEmail = By.xpath("//p[@id='email']");
    By checkCurrent = By.xpath("//p[@id='currentAddress']");
    By checkPermanent = By.xpath("//p[@id='permanentAddress']");

    public TextPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://demoqa.com/text-box");
    }

    public void addData
            (
                    String name,
                    String email,
                    String currentAddress,
                    String permanentAddress
            ) {
        driver.findElement(userName).sendKeys(name);
        driver.findElement(userEmail).sendKeys(email);
        driver.findElement(current).sendKeys(currentAddress);
        driver.findElement(permanent).sendKeys(permanentAddress);
    }

    public void clickButton() {
        driver.findElement(button).click();
    }

    public String checkName() {
        return driver.findElement(checkName).getText();
    }

    public String checkEmail() {
        return driver.findElement(checkEmail).getText();
    }

    public String checkCurrent() {
        return driver.findElement(checkCurrent).getText();
    }

    public String checkPermanent() {
        return driver.findElement(checkPermanent).getText();
    }
}
