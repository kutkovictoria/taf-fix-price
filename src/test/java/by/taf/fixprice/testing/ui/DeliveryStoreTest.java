package by.taf.fixprice.testing.ui;

import by.taf.fixprice.po.DeliveryStorePage;
import by.taf.fixprice.po.HomePage;
import by.taf.fixprice.webdriver.Singleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeliveryStoreTest extends BaseTest{
    private static final Logger logger = LogManager.getLogger();
    @Test
    public void deliveryStoreIsSet() {
        HomePage homePage = new HomePage();
        logger.info("Open Home page");
        homePage.clickChooseDeliveryStoreButton();
        DeliveryStorePage storePage = new DeliveryStorePage();
        logger.info("open DeliveryStorePage page");
        storePage.clickOnFirstAddressFromTheList();
        storePage.clickSelectStoreButton();
        logger.info("set Delivery Store");
        Singleton.waitFor(2);
        String actualResult = homePage.getDeliveryAddressText();
        String expectedResult = "г.Минск, ул.Алибегова, д.15";
        Assertions.assertEquals(expectedResult, actualResult);
        logger.info("Delivery Store is :" + expectedResult);
    }

}
