package by.taf.fixprice.po;

import by.taf.fixprice.webdriver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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
        Singleton.clickWebElement(CATALOG_BUTTON_LOCATOR);
    }

    public void clickCartButton() {
        Singleton.clickWebElement(CART_BUTTON_LOCATOR);
    }
    public void clickSearchButton(){
        Singleton.waitForWebElementAndClick(SEARCH_BUTTON_LOCATOR);
    }
    public void enterSearchQuery(){
        String sendKeys = "Aльбом";
        Singleton.findWebElementAndSendKeys(SEARCH_INPUT_LOCATOR, sendKeys);
    }

}
