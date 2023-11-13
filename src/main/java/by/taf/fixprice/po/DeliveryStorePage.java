package by.taf.fixprice.po;

import by.taf.fixprice.webdriver.Singleton;

import static by.taf.fixprice.locators.DeliveryStorePageLocators.*;

public class DeliveryStorePage {

    public void clickOnFirstAddressFromTheList() {
        Singleton.clickWebElement(STORE_ADDRESS_LOCATOR);
    }

    public void enterDeliveryAddress(String sendKeys) {
        Singleton.findWebElementAndSendKeys(SEARCH_INPUT_LOCATOR, sendKeys);
    }

    public void clickSelectStoreButton() {
        Singleton.clickWebElement(SELECT_STORE_BUTTON_LOCATOR);
    }
}
