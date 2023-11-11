package by.taf.fixprice.testing.ui;

import by.taf.fixprice.po.HomePage;
import by.taf.fixprice.po.LoginPage;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginWithAnyCorrectEmailAnyPassword() {
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
    @Test
    public void loginWithWrongFormatEmailAnyPassword() {
        HomePage homePage = new HomePage();
        homePage.clickLoginButton();

        LoginPage loginPage = new LoginPage();
        Faker faker = new Faker();
        loginPage.clickEmailTab();
        loginPage.enterEmail("testgmail.com");
        loginPage.enterPassword(faker.internet().password());
        loginPage.clickEnterButton();
        String expectedResult = "Укажите корректный email";
        String actualResult = loginPage.getErrorText();
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void loginWithEmptyEmailAnyPassword() {
        HomePage homePage = new HomePage();
        homePage.clickLoginButton();

        LoginPage loginPage = new LoginPage();
        Faker faker = new Faker();
        loginPage.clickEmailTab();
        loginPage.enterEmail("");
        loginPage.enterPassword(faker.internet().password());
        loginPage.clickEnterButton();
        String expectedResult = "Требуется указать email";
        String actualResult = loginPage.getErrorText();
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void loginWithAnyCorrectPhoneNumberAnyPassword() {
        HomePage homePage = new HomePage();
        homePage.clickLoginButton();

        LoginPage loginPage = new LoginPage();
        Faker faker = new Faker();
        loginPage.enterPhoneNumber(faker.phoneNumber().cellPhone());
        loginPage.enterPassword(faker.internet().password());
        loginPage.clickEnterButton();
        String expectedResult = "Неверный логин или пароль. Проверьте введённые данные и попробуйте снова. Осталось попыток: 4";
        String actualResult = loginPage.getErrorText();
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void loginWithPhoneNumberWrongFormatAnyPassword() {
        HomePage homePage = new HomePage();
        homePage.clickLoginButton();

        LoginPage loginPage = new LoginPage();
        Faker faker = new Faker();
        loginPage.enterPhoneNumber("123456");
        loginPage.enterPassword(faker.internet().password());
        loginPage.clickEnterButton();
        String expectedResult = "Укажите корректный номер телефона";
        String actualResult = loginPage.getErrorText();
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void loginWithEmptyPhoneNumberAnyPassword() {
        HomePage homePage = new HomePage();
        homePage.clickLoginButton();

        LoginPage loginPage = new LoginPage();
        Faker faker = new Faker();
        loginPage.enterPhoneNumber("");
        loginPage.enterPassword(faker.internet().password());
        loginPage.clickEnterButton();
        String expectedResult = "Требуется указать телефон";
        String actualResult = loginPage.getErrorText();
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
