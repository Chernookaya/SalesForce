package pages;

import dto.Contact;
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
public class NewContactPage extends BasePage {
    private static final By SAVE_BUTTON = By.xpath("//*[@name='SaveEdit']");

    public NewContactPage(WebDriver driver) {

        super(driver);
    }

    public NewContactPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h2[text()='New Contact']")));
        return this;
    }

    public NewContactPage open() {
        driver.get(NEW_CONTACT_BASE_URL);
        waitForPageLoaded();
        return this;
    }

    @Step("Filling new Contact data")
    public void createNewContact(Contact contact) {
        log.info("Filling new Contact data {}", contact);
        new DropDown(driver, "Salutation").selectDropDown(contact.getSalutation());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new SearchInput(driver, "Account Name").selectSearch(contact.getAccountName());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Email").write(contact.getEmail());
        new SearchInput(driver, "Reports To").selectSearch(contact.getReportsTo());
        new Input(driver, "Department").write(contact.getDepartment());
        new Input(driver, "Fax").write(contact.getFax());
        new TextArea(driver, "Mailing Street").write(contact.getMailingStreet());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing State").write(contact.getMailingState());
        new Input(driver, "Postal Code").write(contact.getPostalCode());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());

    }

    @Step("Click Save button")
    public void saveContact() {
        log.info("Clicking Save button");
        driver.findElement(SAVE_BUTTON).click();
    }
}
