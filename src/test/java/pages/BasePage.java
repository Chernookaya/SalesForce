package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

abstract class BasePage {
    final String BASE_URL = "https://tms41-dev-ed.my.salesforce.com/";
    final String NEW_ACCOUNT_BASE_URL = "https://tms41-dev-ed.lightning.force.com/lightning/o/Account/new";
    final String NEW_CONTACT_BASE_URL = "https://tms41-dev-ed.lightning.force.com/lightning/o/Contact/new";
    WebDriverWait wait;
    WebDriver driver;

    BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    void write(String label, String text) {
        driver.findElement(By.xpath(String.format("//*[text()='%s']/ancestor::lightning-input//input", label)))
                .sendKeys(text);
    }

    protected void waitForPageLoaded() {
        new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver)
                        .executeScript("return document.readyState")
                        .toString().equals("complete");
            }
        };
    }
}
