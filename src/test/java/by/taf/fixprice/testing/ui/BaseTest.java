package by.taf.fixprice.testing.ui;

import by.taf.fixprice.webdriver.Singleton;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {

    @AfterEach
    public void driverShutDown() {
        Singleton.quitDriver();
    }

}
