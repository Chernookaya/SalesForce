package pages;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");
    private final By ERROR_MESSAGE = By.id("error");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Cheсk that Login Page was opened")
    public void isOpened() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(LOGIN_BUTTON));
           }

    @Step("Opening login page")
    public LoginPage open() {
        driver.get(BASE_URL);
        return this;
    }

    @Step("login by {user}")
    public MainPage login(String user, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        takeScreenshot(driver);
        driver.findElement(LOGIN_BUTTON).click();
        return new MainPage(driver);
    }

    @Attachment(value = "screenshot", type = "image/png")
    private static byte[] takeScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
