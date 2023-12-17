package wrappers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
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
        log.info("Click button {}", label);
        driver.findElement(By.xpath(String.format(baseDropDownLocator, label))).click();
        log.info("Select on {}", option , label);
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
    }
}