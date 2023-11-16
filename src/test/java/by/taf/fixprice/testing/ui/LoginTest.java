package by.taf.fixprice.testing.ui;

import by.taf.fixprice.po.HomePage;
import by.taf.fixprice.po.LoginPage;
import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {


    @Test
    public void loginWithAnyCorrectEmailAnyPassword() {
        logger.info("Test: login with any correct email and any password");
        homePage.clickLoginButton();
        logger.info("Open Login page");

        LoginPage loginPage = new LoginPage();
        Faker faker = new Faker();
        loginPage.clickEmailTab();
        loginPage.enterEmail(faker.internet().emailAddress());
        logger.info("Enter valid email");
        loginPage.enterPassword(faker.internet().password());
        logger.info("Enter password");
        loginPage.clickEnterButton();
        String expectedResult = "Неверный логин или пароль. Проверьте введённые данные и попробуйте снова. Осталось попыток: 4";
        String actualResult = loginPage.getErrorText();
        Assertions.assertEquals(expectedResult, actualResult);
        logger.info("Error message: " + expectedResult);
    }

    @Test
    public void loginWithWrongFormatEmailAnyPassword() {
        logger.info("Test: login with wrong format email and any password");
        homePage.clickLoginButton();

        LoginPage loginPage = new LoginPage();
        Faker faker = new Faker();
        loginPage.clickEmailTab();
        loginPage.enterEmail("testgmail.com");
        logger.info("Enter email with incorrect format");
        loginPage.enterPassword(faker.internet().password());
        logger.info("Enter password");
        loginPage.clickEnterButton();
        String expectedResult = "Укажите корректный email";
        String actualResult = loginPage.getErrorText();
        Assertions.assertEquals(expectedResult, actualResult);
        logger.info("Error message: " + expectedResult);
    }

    @Test
    public void loginWithEmptyEmailAnyPassword() {
        logger.info("Test: login with empty email and any password");
        homePage.clickLoginButton();

        LoginPage loginPage = new LoginPage();
        Faker faker = new Faker();
        loginPage.clickEmailTab();
        loginPage.enterEmail("");
        logger.info("Enter nothing in email input field");
        loginPage.enterPassword(faker.internet().password());
        logger.info("Enter password");
        loginPage.clickEnterButton();
        String expectedResult = "Требуется указать email";
        String actualResult = loginPage.getErrorText();
        Assertions.assertEquals(expectedResult, actualResult);
        logger.info("Error message: " + expectedResult);
    }

    @Test
    public void loginWithAnyCorrectPhoneNumberAnyPassword() {
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
