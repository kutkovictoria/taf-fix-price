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
        Singleton.clickWebElement(CHOOSE_DELIVERY_STORE_BUTTON_LOCATOR);
    }

    public void clickCatalogButton() {
        Singleton.clickWebElement(DELIVERY_STORE_ADDRESS_BUTTON_LOCATOR);
    }

    public void clickCartButton() {
        Singleton.clickWebElement(CART_BUTTON_LOCATOR);
    }
}
