package by.taf.fixprice.po;

import by.taf.fixprice.webdriver.Singleton;

import static by.taf.fixprice.locators.HomePageLocators.*;

public class HomePage {


    public void openHomePage() {
        Singleton.getDriver().get("https://fix-price.by/");

    }

    public void clickLoginButton() {
        Singleton.clickWebElement(LOGIN_BUTTON_LOCATOR);
    }

    public String getCopyRightText() {
        return Singleton.getTextFromWebElement(COPY_RIGHT_LOCATOR);
    }

    public void clickAcceptCookieButton() {
        Singleton.waitForWebElementAndClick(ACCEPT_COOKIE_BUTTON_LOCATOR);
    }

    public void clickConfirmMinskLocationButton() {
        Singleton.clickWebElement(CONFIRM_MINSK_LOCATION_BUTTON_LOCATOR);
    }

    public void clickChooseDeliveryStoreButton() {
        Singleton.waitForWebElementAndClick(CHOOSE_DELIVERY_STORE_BUTTON_LOCATOR);
    }

    public String getDeliveryAddressText() {
        return Singleton.getTextFromWebElement(DELIVERY_STORE_ADDRESS_BUTTON_LOCATOR);
    }

    public void clickSearchButton() {
        Singleton.findWebElementAndClickEnter(SEARCH_BUTTON_LOCATOR);
    }

    public void enterSearchQuery(String sendKeys) {
        Singleton.findWebElementAndSendKeys(SEARCH_INPUT_LOCATOR, sendKeys);
        Singleton.waitFor(1);
        Singleton.findWebElementAndClickEnter(SEARCH_INPUT_LOCATOR);
    }
}
