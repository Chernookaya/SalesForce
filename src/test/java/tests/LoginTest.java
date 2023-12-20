package tests;

import org.testng.annotations.Test;


public class LoginTest extends BaseTest {


    @Test(description = "Try login user")
    public void login() {
        loginPage.
                open().
                login("drak@tms.sandbox", "Password01!!");
        mainPage.isOpened();
    }
}