package by.taf.fixprice.po;

import by.taf.fixprice.webdriver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static by.taf.fixprice.locators.SearchResultsPageLocators.BERLINGO_CHECKBOX_LOCATOR;
import static by.taf.fixprice.locators.SearchResultsPageLocators.PRICE_3BYN_LOCATOR;

public class SearchResultsPage {
    //private JavascriptExecutor js = (JavascriptExecutor) Singleton.getDriver();
    public void clickBerlingoCheckBox(){
        //Singleton.waitForWebElementAndClick(BERLINGO_CHECKBOX_LOCATOR);
        Singleton.submitWebElement(BERLINGO_CHECKBOX_LOCATOR);
        //js.executeScript("document.querySelector(document.querySelector('#price_110000300').click();");
    }
    public void clickPrice3BYN(){
        Singleton.waitForWebElementAndClick(PRICE_3BYN_LOCATOR);
        //js.executeScript("document.querySelector(document.querySelector('#brand_136').click();");
    }
    public List<String> getResultTitleList() {
        List<String> sketchbookTitles = new ArrayList<>();
        int numberOfElements = 8;

        for (int i = 0; i < numberOfElements; i++) {
            WebElement element = new WebDriverWait(Singleton.getDriver(), Duration.ofSeconds(1))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='title]'")));
            sketchbookTitles.add(element.getText());
        }
        return sketchbookTitles;
    }
}
