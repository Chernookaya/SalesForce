package pages;

import dto.Account;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.DropDown;
import wrappers.Input;
import wrappers.SearchInput;
import wrappers.TextArea;

@Log4j2
public class NewAccountPage extends BasePage {
    public static final By SAVE_BUTTON = By.xpath("//*[@name='SaveEdit']");
    public static final By alertMessageText = By.className("toastMessage");


    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public NewAccountPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h2[text()='New Account']")));
        return this;
    }

    @Step("Opening NewAccountPage")
    public NewAccountPage open() {
        log.info("Opening NewAccountPage");
        driver.get(NEW_ACCOUNT_BASE_URL);
        waitForPageLoaded();
        return this;
    }

    @Step("Filling new Account data")
    public void createNewAccount(Account account) {
        log.info("Filling new Account data {}", account);
        new Input(driver, "Account Name").write(account.getAccountName());
        new SearchInput(driver, "Parent Account").selectSearch(account.getParentAccount());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Website").write(account.getWebsite());
        new DropDown(driver, "Type").selectDropDown(account.getType());
        new DropDown(driver, "Industry").selectDropDown(account.getIndustry());
        new Input(driver, "Employees").write(account.getEmployees());
        new TextArea(driver, "Description").write(account.getDescription());
        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State").write(account.getBillingState());
        new Input(driver, "Billing Zip").write(account.getBillingZip());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State").write(account.getShippingState());
        new Input(driver, "Shipping Zip").write(account.getShippingZip());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
    }

    @Step("Click Save button")
    public void saveAccount() {
        log.info("Clicking Save button");
        driver.findElement(SAVE_BUTTON).click();
    }
}
