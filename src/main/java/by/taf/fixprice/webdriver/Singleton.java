package by.taf.fixprice.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singleton {
    private static WebDriver driver;

    private Singleton() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
