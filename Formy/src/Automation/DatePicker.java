package Automation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class DatePicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Hags/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("08/23/2021");
        dateField.sendKeys(Keys.RETURN);

        driver.quit();
    }
}