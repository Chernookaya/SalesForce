package tests;

import dto.Account;
import org.testng.annotations.Test;

public class NewAccountTest extends BaseTest {

    @Test(description = "Make new account test")
    public void createNewAccount() {
        loginPage.open()
                .login("drak@tms.sandbox", "Password01!!");
        newAccountPage.open();
        Account account = new Account("Antonina_blr_20", "Express Logistics and Transport",
                "5557799", "1@tut.by", "Customer", "Banking", "222", "Hot",
                "+375336594160", "80176321578", "tut.by", "DDD", "Public", "Anna",
                "888", "Как жизнь молодая?", "Avangardnaya", "Minsk", "6",
                "220080", "Minsk", "Peredovaya", "Brest", "88",
                "220037", "Diatlovichi", "High");
        newAccountPage.createNewAccount(account);
        newAccountPage.saveAccount();
    }
}