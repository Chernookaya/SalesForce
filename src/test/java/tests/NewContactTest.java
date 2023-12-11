package tests;

import org.testng.annotations.Test;
import pages.ContactConstructor;

public class NewContactTest extends BaseTest {

    @Test(description = "Make new contact test")
        public void createNewContact() {
            loginPage.open()
                    .login("drak@tms.sandbox", "Password01!!");
            newContactPage.open();

        ContactConstructor contact = new ContactConstructor("Ms.","Antonina", "Chernookaya",
                "4564","ASD","1@tut.by", "+375336606096","+375336606096","Babara Levy",
                "333", "80176632587","Medelki","Vigotskogo","55","220085",
                "Belarus");
        newContactPage.createNewContact(contact);
        newContactPage.saveContact();
    }
}