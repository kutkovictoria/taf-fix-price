package by.taf.fixprice.po;

import by.taf.fixprice.webdriver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static by.taf.fixprice.po.HomePageLocators.*;

public class HomePage {

    public void openHomePage() {
        Singleton.getDriver().get("https://fix-price.by/");
    }

    public void clickLoginButton() {
        Singleton.clickElement(LOGIN_BUTTON_LOCATOR);
    }

    public String getCopyRightText() {
        WebElement copyRightElement = Singleton.getDriver().findElement(By.xpath(COPY_RIGHT_LOCATOR));
        return copyRightElement.getText();
    }

    public void clickAcceptCookieButton() {
        Singleton.waitForElementAndClick(ACCEPT_COOKIE_BUTTON_LOCATOR);
    }

    public void clickConfirmMinskLocationButton() {
        Singleton.clickElement(CONFIRM_MINSK_LOCATION_BUTTON_LOCATOR);
    }

    public void clickChooseDeliveryStoreButton() {
        Singleton.clickElement(CHOOSE_DELIVERY_STORE_BUTTON_LOCATOR);
    }

    public void clickCatalogButton() {
        Singleton.clickElement(DELIVERY_STORE_ADDRESS_BUTTON_LOCATOR);
    }

    public void clickCartButton() {
        Singleton.clickElement(CART_BUTTON_LOCATOR);
    }

}
