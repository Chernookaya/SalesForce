package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class MainPage extends BasePage {
    private final By PROFILE_ICON = By.className("profileTrigger");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void isOpened() {
        waitForPageLoaded();
        /*wait.until(ExpectedConditions.visibilityOfElementLocated(PROFILE_ICON));*/

    }

    public MainPage open() {
        driver.get("https://tms41-dev-ed.lightning.force.com/lightning/setup/SetupOneHome/home");
        return this;
    }
}
