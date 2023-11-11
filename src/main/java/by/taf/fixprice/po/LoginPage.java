package by.taf.fixprice.po;

import by.taf.fixprice.webdriver.Singleton;

import static by.taf.fixprice.locators.LoginPageLocators.*;

public class LoginPage {
    public void clickEmailTab() {
        Singleton.clickWebElement(EMAIL_TAB_LOCATOR);
    }

    public void enterEmail(String email) {
        Singleton.findWebElementAndSendKeys(EMAIL_INPUT_LOCATOR, email);
    }

    public void enterPhoneNumber(String phoneNumber) {
        Singleton.findWebElementAndSendKeys(PHONE_INPUT_LOCATOR, phoneNumber);
    }

    public void enterPassword(String password) {
        Singleton.waitForWebElementAndSendKeys(PASSWORD_INPUT_LOCATOR, password);
    }

    public void clickEnterButton() {
        Singleton.clickWebElement(ENTER_LOCATOR);
    }

    public String getErrorText() {
        return Singleton.getTextFromWebElement(ERROR_LOCATOR);
    }
}
