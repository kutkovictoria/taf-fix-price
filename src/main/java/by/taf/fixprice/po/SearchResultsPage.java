package by.taf.fixprice.po;

import by.taf.fixprice.webdriver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static by.taf.fixprice.locators.SearchResultsPageLocators.*;

public class SearchResultsPage {

    public void click6BYNPriceFilter() {
        Singleton.waitForWebElementAndClick(PRICE_6BYN_LOCATOR);
    }

    public void clickCompanyFilter() {
        Singleton.waitForWebElementAndClick(COMPANY_FILTER_LOCATOR);
    }

    public List<String> getSearchResultTitles() {
        List<String> pencilСaseTitles = new ArrayList<>();
        List<WebElement> elements = new WebDriverWait(Singleton.getDriver(), Duration.ofSeconds(4))
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(RESULT_TITLES_LOCATOR)));
        for (WebElement element : elements) {
            pencilСaseTitles.add(element.getText());
        }
        return pencilСaseTitles;
    }

    public List<String> getSearchResultPrices() {
        List<String> pencilСasePrices = new ArrayList<>();
        List<WebElement> elements = new WebDriverWait(Singleton.getDriver(), Duration.ofSeconds(1))
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(RESULT_PRICES_LOCATOR)));
        for (WebElement element : elements) {
            pencilСasePrices.add(element.getText());
        }
        return pencilСasePrices;
    }
}
