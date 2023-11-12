package by.taf.fixprice.po;

import by.taf.fixprice.webdriver.Singleton;

import static by.taf.fixprice.locators.CatalogLocators.*;

public class CatalogPage {
    public void clickOfficeSuppliesLink(){
        Singleton.clickWebElement(OFFICE_SUPPLIES_LOCATOR);
    }
    public void clickBerlingoCheckBox(){
        Singleton.clickWebElement(BERLINGO_CHECKBOX_LOCATOR);
    }
    public void clickPrice3BYN(){
        Singleton.clickWebElement(PRICE_3BYN_LOCATOR);
    }
}
