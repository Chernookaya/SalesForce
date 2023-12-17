package wrappers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Log4j2
public class SearchInput {
    String baseSearchInputLocator = "//*[contains(text(),'%s')]/ancestor::lightning-lookup//input";
    String optionLocator = "//*[@title='%s']";
    String label;
    WebDriver driver;


    public SearchInput(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectSearch(String text) {
        log.info("Select {} from {}", text, label);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath(String.format(baseSearchInputLocator, label))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(optionLocator, text))));
        driver.findElement(By.xpath(String.format(optionLocator, text))).click();
    }
}
