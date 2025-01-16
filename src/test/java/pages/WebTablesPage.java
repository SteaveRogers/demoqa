package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTablesPage {
    WebDriver driver;

    By add = By.xpath("//div[@class='col-md-7']//button");
    By userFirstName = By.xpath("//*[@id='firstName']");
    By userLastName = By.xpath("//*[@id='lastName']");
    By userEmail = By.xpath("//*[@id='userEmail']");
    By userAge = By.xpath("//*[@id='age']");
    By userSalary = By.xpath("//*[@id='salary']");
    By userDepartment = By.xpath("//*[@id='department']");
    By submit = By.xpath("//*[@class='text-right col-md-2 col-sm-12']//button");
    By userSearch = By.xpath("//*[@id='searchBox']");
    By userData = By.xpath("//*[@class='rt-tr -odd']");

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://demoqa.com/webtables");
    }

    public void registration(
            final String firstName,
            final String lastName,
            final String email,
            final String age,
            final String salary,
            final String department
    ) {
        driver.findElement(add).click();
        driver.findElement(userFirstName).sendKeys(firstName);
        driver.findElement(userLastName).sendKeys(lastName);
        driver.findElement(userEmail).sendKeys(email);
        driver.findElement(userAge).sendKeys(age);
        driver.findElement(userSalary).sendKeys(salary);
        driver.findElement(userDepartment).sendKeys(department);
        driver.findElement(submit).click();
    }

    public void search(final String search) {
        driver.findElement(userSearch).sendKeys(search);
    }

    public boolean checkUser(String name) {
        List<WebElement> rows = driver.findElements(userData);
        for (WebElement row : rows) {
            if (row.getText().contains(name)) {
                return true;
            }
        }
        return false;
    }
}
