package by.taf.fixprice.po;

import by.taf.fixprice.webdriver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private String loginButtonLocator = "//button[@class='log-in link']";
    private String copyRightLocator = "//p[@class='copyright copyright-desktop']";
    private String acceptCookieButtonLocator = "//button[text() = 'Принять все файлы cookie']";
    private String confirmMinskLocationButtonLocator = "//button[@class='button normal']";
    private String chooseDeliveryStoreButtonLocator = "//div[@class='title'][text() = 'Самовывоз']";
    private String deliveryStoreAddressButtonLocator = "//div[@class='description']";
    private String searchInputLocator = "//input[@class='search-input']";
    private String catalogButtonLocator = "//a[@class='catalog-link']";
    private String cartButtonLocator = "//a[@class='cart link']";

    public void openHomePage() {
        Singleton.getDriver().get("https://fix-price.by/");
    }

    public void clickLoginButton() {
        WebElement loginButtonElement = Singleton.getDriver().findElement(By.xpath(loginButtonLocator));
        loginButtonElement.click();
    }

    public String getCopyRightText() {
        WebElement copyRightElement = Singleton.getDriver().findElement(By.xpath(copyRightLocator));
        return copyRightElement.getText();
    }

    public void clickAcceptCookieButton() {
        WebElement acceptCookieButtonElement = new WebDriverWait(Singleton.getDriver(), Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(acceptCookieButtonLocator)));
        acceptCookieButtonElement.click();

    }

    public void clickConfirmMinskLocationButton() {
        WebElement confirmMinskLocationButtonElement = new WebDriverWait(Singleton.getDriver(), Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(confirmMinskLocationButtonLocator)));
        confirmMinskLocationButtonElement.click();
    }

    public void clickChooseDeliveryStoreButton() {
        WebElement chooseDeliveryStoreButtonElement = new WebDriverWait(Singleton.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(chooseDeliveryStoreButtonLocator)));
        chooseDeliveryStoreButtonElement.click();
    }

    public void clickCatalogButton() {
        WebElement catalogButtonElement = Singleton.getDriver().findElement(By.xpath(catalogButtonLocator));
        catalogButtonElement.click();
    }

    public void clickCartButton() {
        WebElement cartButtonElement = Singleton.getDriver().findElement(By.xpath(cartButtonLocator));
        cartButtonElement.click();
    }

}
