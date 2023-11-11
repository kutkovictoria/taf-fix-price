package by.taf.fixprice.po;

import by.taf.fixprice.webdriver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static by.taf.fixprice.po.HomePageLocators.COPY_RIGHT_LOCATOR;
import static by.taf.fixprice.po.HomePageLocators.LOGIN_BUTTON_LOCATOR;
import static by.taf.fixprice.po.LoginPageLocators.*;

public class LoginPage {
    public void clickEmailTab(){
        WebElement emailTabElement = Singleton.getDriver().findElement(By.xpath(EMAIL_TAB_LOCATOR));
        emailTabElement.click();
    }
    public void enterEmail(String email) {
        WebElement emailInputElement = Singleton.getDriver().findElement(By.xpath(EMAIL_INPUT_LOCATOR));
        emailInputElement.sendKeys(email);
    }
    public void enterPhoneNumber(String phoneNumber) {
        WebElement emailInputElement = Singleton.getDriver().findElement(By.xpath(PHONE_INPUT_LOCATOR));
        emailInputElement.sendKeys(phoneNumber);
    }
    public void enterPassword(String password) {
        WebElement emailInputElement = Singleton.getDriver().findElement(By.xpath(PASSWORD_INPUT_LOCATOR));
        emailInputElement.sendKeys(password);
    }
    public void clickEnterButton() {
        WebElement enterButtonElement = Singleton.getDriver().findElement(By.xpath(ENTER_LOCATOR));
        enterButtonElement.click();
    }
    public String getErrorText() {
        WebElement errorTextElement = Singleton.getDriver().findElement(By.xpath(ERROR_LOCATOR));
        return errorTextElement.getText();
    }
}
