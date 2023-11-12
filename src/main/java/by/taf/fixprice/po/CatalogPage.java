package by.taf.fixprice.po;

import by.taf.fixprice.webdriver.Singleton;

import static by.taf.fixprice.locators.CatalogLocators.*;

public class CatalogPage {
    public void clickOfficeSuppliesLink(){
        Singleton.clickWebElement(OFFICE_SUPPLIES_LOCATOR);
    }
}
