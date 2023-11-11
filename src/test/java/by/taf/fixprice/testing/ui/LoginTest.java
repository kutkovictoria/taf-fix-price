package by.taf.fixprice.testing.ui;

import by.taf.fixprice.po.HomePage;
import by.taf.fixprice.po.LoginPage;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginWithAnyEmailAnyPassword() {
        HomePage homePage = new HomePage();
        homePage.openHomePage();
        homePage.clickAcceptCookieButton();
        homePage.clickConfirmMinskLocationButton();
        homePage.clickLoginButton();

        LoginPage loginPage = new LoginPage();
        loginPage.clickEmailTab();
        loginPage.enterEmail("test@test.com");
        loginPage.enterPassword("qwerty34");
        loginPage.clickEnterButton();
    }
}
