package by.taf.fixprice.testing.ui;

import by.taf.fixprice.po.HomePage;
import by.taf.fixprice.webdriver.Singleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaseTest {
    @BeforeEach
    public void openHomePageAndCloseBanners() {
        HomePage homePage = new HomePage();
        homePage.openHomePage();
        homePage.clickAcceptCookieButton();
        homePage.clickConfirmMinskLocationButton();
    }

    @AfterEach
    public void driverShutDown() {
        Singleton.quitDriver();
    }

}
