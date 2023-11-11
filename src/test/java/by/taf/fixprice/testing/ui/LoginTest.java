package by.taf.fixprice.testing.ui;

import by.taf.fixprice.po.HomePage;
import by.taf.fixprice.po.LoginPage;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginWithAnyEmailAnyPassword() {
        HomePage homePage = new HomePage();
        homePage.clickLoginButton();

        LoginPage loginPage = new LoginPage();
        Faker faker = new Faker();
        loginPage.clickEmailTab();
        loginPage.enterEmail(faker.internet().emailAddress());
        loginPage.enterPassword(faker.internet().password());
        loginPage.clickEnterButton();
        String expectedResult = "Неверный логин или пароль. Проверьте введённые данные и попробуйте снова. Осталось попыток: 4";
        String actualResult = loginPage.getErrorText();
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
