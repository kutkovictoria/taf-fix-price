package by.taf.fixprice.webdriver;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.Duration;


public class Singleton {
    private static WebDriver driver;
    public static final Logger logger = LogManager.getLogger();

    private Singleton() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        }
        return driver;
    }


    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static void clickWebElement(String xpath) {
        try {
            WebElement webElement = new WebDriverWait(Singleton.getDriver(), Duration.ofSeconds(1))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            webElement.click();
        } catch (Exception e) {
            logger.info("Error message: TimeoutException!");
        }
    }

    public static void findWebElementAndClickEnter(String xpath) {
        try {
            WebElement webElement = new WebDriverWait(Singleton.getDriver(), Duration.ofSeconds(1))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            webElement.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            logger.info("Error message: TimeoutException!");
        }
    }

    public static String getTextFromWebElement(String xpath) {
        WebElement webElement = new WebDriverWait(Singleton.getDriver(), Duration.ofSeconds(2))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        return webElement.getText();
    }

    public static void findWebElementAndSendKeys(String xpath, String sendKeys) {
        try {
            WebElement webElement = new WebDriverWait(Singleton.getDriver(), Duration.ofSeconds(1))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            webElement.sendKeys(sendKeys);
        } catch (TimeoutException e) {
            logger.info("Error message: TimeoutException!");
        }
    }

    public static void waitForWebElementAndClick(String xpath) {
        try {
            Wait<WebDriver> wait =
                    new FluentWait<>(Singleton.getDriver())
                            .withTimeout(Duration.ofSeconds(2))
                            .pollingEvery(Duration.ofMillis(300))
                            .ignoring(ElementNotInteractableException.class);

            wait.until(
                    d -> {
                        Singleton.getDriver().findElement(By.xpath(xpath)).click();
                        return true;
                    });
        } catch (TimeoutException e) {
            System.out.println("TimeoutException!");
        }
    }

    public static void waitForWebElementAndSendKeys(String xpath, String sendKeys) {
        try {
            Wait<WebDriver> wait =
                    new FluentWait<>(Singleton.getDriver())
                            .withTimeout(Duration.ofSeconds(2))
                            .pollingEvery(Duration.ofMillis(300))
                            .ignoring(ElementNotInteractableException.class);

            wait.until(
                    d -> {
                        Singleton.getDriver().findElement(By.xpath(xpath)).sendKeys(sendKeys);
                        return true;
                    });
        } catch (TimeoutException e) {
            System.out.println("TimeoutException!");
        }
    }

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
