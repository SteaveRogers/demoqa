package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage {
    WebDriver driver;

    By yes = By.xpath("//*[@class='custom-control-label' and contains(text(), 'Yes')]");
    By impressive = By.xpath("//*[@class='custom-control-label' and contains(text(), 'Impressive')]");
    By no = By.xpath("//*[@class='custom-control-label disabled' and contains(text(), 'No')]");
    By checkButtons = By.className("mt-3");

    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://demoqa.com/radio-button");
    }

    public String checkYes() {
        driver.findElement(yes).click();
        return driver.findElement(checkButtons).getText();
    }

    public String checkImpressive() {
        driver.findElement(impressive).click();
        return driver.findElement(checkButtons).getText();
    }

    public boolean checkNo() {
        driver.findElement(no).click();
        return driver.findElements(checkButtons).isEmpty();
    }
}
