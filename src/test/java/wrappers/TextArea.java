package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextArea {
    String baseTextAreaLocator = "//*[contains(text(),'%s')]/ancestor::lightning-textarea//textarea";
    WebDriver driver;
    String label;

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        driver.findElement(By.xpath(String.format(baseTextAreaLocator, label)))
                .sendKeys(text);
    }
}
