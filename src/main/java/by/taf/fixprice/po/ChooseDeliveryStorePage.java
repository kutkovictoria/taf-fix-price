package by.taf.fixprice.po;

import by.taf.fixprice.webdriver.Singleton;
import org.openqa.selenium.WebDriver;

public class ChooseDeliveryStorePage {
    private WebDriver driver;
    private String searchInputLocator = "//input[@class='search-text']";
    private String storeAddressLocator = "//div[@class='address']";

    public ChooseDeliveryStorePage() {
        this.driver = Singleton.getDriver();
    }
}
