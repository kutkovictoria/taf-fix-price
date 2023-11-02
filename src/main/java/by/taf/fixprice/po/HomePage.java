package by.taf.fixprice.po;

import by.taf.fixprice.webdriver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private String loginButtonLocator = "//button[@class='log-in link']";
    private String copyRightLocator = "//p[@class='copyright copyright-desktop']";
    private String acceptCookieButtonLocator = "//button[text() = 'Принять все файлы cookie']";
    private String confirmMinskLocationButtonLocator = "//button[@class='button normal']";
    private String chooseDeliveryStoreButtonLocator = "//div[@class='title'][text() = 'Самовывоз']";
    private String deliveryStoreAddressButtonLocator = "//div[@class='description']";
    private String searchInputLocator = "//input[@class='search-input']";
    private String catalogButtonLocator = "//a[@class='catalog-link']";
    private String cartButtonLocator = "//a[@class='cart link']";

    public HomePage() {
        this.driver = Singleton.getDriver();
    }

    public void openHomePage() {
        driver.get("https://fix-price.by/");
    }

    public void clickLoginButton() {
        WebElement loginButtonElement = driver.findElement(By.xpath(loginButtonLocator));
        loginButtonElement.click();
    }

    public void getCopyRightText() {
        WebElement copyRightElement = driver.findElement(By.xpath(copyRightLocator));
        copyRightElement.getText();
    }

    public void clickAcceptCookieButton() {
        WebElement acceptCookieButtonElement = driver.findElement(By.xpath(acceptCookieButtonLocator));
        acceptCookieButtonElement.click();
    }

    public void clickConfirmMinskLocationButton() {
        WebElement confirmMinskLocationButtonElement = driver.findElement(By.xpath(confirmMinskLocationButtonLocator));
        confirmMinskLocationButtonElement.click();
    }

    public void clickChooseDeliveryStoreButton() {
        WebElement chooseDeliveryStoreButtonElement = driver.findElement(By.xpath(chooseDeliveryStoreButtonLocator));
        chooseDeliveryStoreButtonElement.click();
    }

    public void clickCatalogButton() {
        WebElement catalogButtonElement = driver.findElement(By.xpath(catalogButtonLocator));
        catalogButtonElement.click();
    }

    public void clickCartButton() {
        WebElement cartButtonElement = driver.findElement(By.xpath(cartButtonLocator));
        cartButtonElement.click();
    }

}
