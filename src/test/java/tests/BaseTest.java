package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.MainPage;
import pages.LoginPage;
import pages.NewAccountPage;
import pages.NewContactPage;
/*import pages.NewAccountPage;*/

import java.time.Duration;

@Listeners(TestListener.class)
public abstract class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    MainPage mainPage;
    NewAccountPage newAccountPage;
    NewContactPage newContactPage;


    @Parameters({"browser"})
    @BeforeMethod(description = "Browser setup")
    public void setup(@Optional("chrome") String browser, ITestContext testContext) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("headless");
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        testContext.setAttribute("driver", driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        newAccountPage = new NewAccountPage(driver);
        newContactPage = new NewContactPage(driver);
    }

    @AfterMethod(alwaysRun = true, description = "Close browser")
    public void tearDown() {
        driver.quit();
    }
}