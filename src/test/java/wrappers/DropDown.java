package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {
    WebDriver driver;
    String label;
    String baseDropDownLocator = "//*[text()='%s']/ancestor::lightning-picklist//button";
    String optionLocator = "//*[text()='%s']";

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;

    }

    public void selectDropDown(String option) {
        driver.findElement(By.xpath(String.format(baseDropDownLocator, label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
    }
}