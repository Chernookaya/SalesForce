package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class MainPage extends BasePage {
    private final By PROFILE_ICON = By.className("profileTrigger");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void isOpened() {
        log.info("Waiting page opened");
        waitForPageLoaded();
        /*wait.until(ExpectedConditions.visibilityOfElementLocated(PROFILE_ICON));*/

    }

    public MainPage open() {
        driver.get("https://tms41-dev-ed.lightning.force.com/lightning/setup/SetupOneHome/home");
        return this;
    }
}
