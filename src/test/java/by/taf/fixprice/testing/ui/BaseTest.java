package by.taf.fixprice.testing.ui;

import by.taf.fixprice.po.HomePage;
import by.taf.fixprice.webdriver.Singleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    protected static final Logger logger = LogManager.getLogger();
    protected HomePage homePage = new HomePage();

    @BeforeEach
    public void openHomePageAndCloseBanners() {
        homePage.openHomePage();
        logger.info("Open Home page");
        homePage.clickAcceptCookieButton();
        homePage.clickConfirmMinskLocationButton();
        logger.info("Cookies are accepted and Minsk location is confirmed");
    }

    @AfterEach
    public void driverShutDown() {
        Singleton.quitDriver();
    }
}
