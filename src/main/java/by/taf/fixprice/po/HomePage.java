package by.taf.fixprice.po;

import by.taf.fixprice.webdriver.Singleton;
import org.openqa.selenium.By;
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
        WebElement loginButtonElement = Singleton.getDriver().findElement(By.xpath(LOGIN_BUTTON_LOCATOR));
        loginButtonElement.click();
    }

    public String getCopyRightText() {
        WebElement copyRightElement = Singleton.getDriver().findElement(By.xpath(COPY_RIGHT_LOCATOR));
        return copyRightElement.getText();
    }

    public void clickAcceptCookieButton() {
        WebElement acceptCookieButtonElement = new WebDriverWait(Singleton.getDriver(), Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(ACCEPT_COOKIE_BUTTON_LOCATOR)));
        acceptCookieButtonElement.click();

    }

    public void clickConfirmMinskLocationButton() {
        WebElement confirmMinskLocationButtonElement = new WebDriverWait(Singleton.getDriver(), Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(CONFIRM_MINSK_LOCATION_BUTTON_LOCATOR)));
        confirmMinskLocationButtonElement.click();
    }

    public void clickChooseDeliveryStoreButton() {
        WebElement chooseDeliveryStoreButtonElement = new WebDriverWait(Singleton.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(CHOOSE_DELIVERY_STORE_BUTTON_LOCATOR)));
        chooseDeliveryStoreButtonElement.click();
    }

    public void clickCatalogButton() {
        WebElement catalogButtonElement = Singleton.getDriver().findElement(By.xpath(DELIVERY_STORE_ADDRESS_BUTTON_LOCATOR));
        catalogButtonElement.click();
    }

    public void clickCartButton() {
        WebElement cartButtonElement = Singleton.getDriver().findElement(By.xpath(CART_BUTTON_LOCATOR));
        cartButtonElement.click();
    }

}
