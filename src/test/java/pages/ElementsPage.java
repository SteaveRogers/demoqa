package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage {
    WebDriver driver;

    By textBox = By.xpath("//li[@class = 'btn btn-light ' and @id='item-0']");
    By checkBox = By.xpath("//li[@class = 'btn btn-light ' and @id='item-1']");
    By radioButton = By.xpath("//li[@class = 'btn btn-light ' and @id='item-2']");
    By webTables = By.xpath("//li[@class = 'btn btn-light ' and @id='item-3']");
    By buttons = By.xpath("//li[@class = 'btn btn-light ' and @id='item-4']");

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://demoqa.com/elements");
    }

    public void clickTextBox() {
        driver.findElement(textBox).click();
    }

    public void clickCheckBox() {
        driver.findElement(checkBox).click();
    }

    public void clickRadioButton() {
        driver.findElement(radioButton).click();
    }

    public void clickWebTables() {
        driver.findElement(webTables).click();
    }

    public void clickButtons() {
        driver.findElement(buttons).click();
    }
}
