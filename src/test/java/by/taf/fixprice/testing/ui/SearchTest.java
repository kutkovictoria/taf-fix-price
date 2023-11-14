package by.taf.fixprice.testing.ui;

import by.taf.fixprice.po.HomePage;
import by.taf.fixprice.po.SearchResultsPage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class SearchTest extends BaseTest {
    public static final Logger logger = LogManager.getLogger();
    @Test
    public void checkSearchResults() {
        HomePage homePage = new HomePage();
        homePage.enterSearchQuery("Пенал");
        logger.info("Search query is entered");
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.clickCompanyFilter();
        logger.info("Company filter is set");
        List<String> actualResult = searchResultsPage.getSearchResultTitles();
        String expectedResult = "Пенал";
        Assertions.assertTrue(actualResult.stream().allMatch(item -> item.contains(expectedResult)), "Not all titles contain " + expectedResult);
        logger.info("The results are shown according to the search query");

    }

    @Test
    public void checkCompanyFilterIsApplied() {
        HomePage homePage = new HomePage();
        homePage.enterSearchQuery("Пенал");
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        logger.info("Search query is entered");
        searchResultsPage.clickCompanyFilter();
        logger.info("Company filter is set");
        List<String> actualResult = searchResultsPage.getSearchResultTitles();
        String expectedResult = "Hupper Dupper";
        Assertions.assertTrue(actualResult.stream().allMatch(item -> item.contains(expectedResult)), "Not all titles contain " + expectedResult);
        logger.info("The results are shown according to the company filter");
    }

    @Test
    public void checkPriceFilterIsApplied() {
        HomePage homePage = new HomePage();
        homePage.enterSearchQuery("Пенал");
        logger.info("Search query is entered");
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.clickCompanyFilter();
        logger.info("Company filter is set");
        searchResultsPage.click6BYNPriceFilter();
        logger.info("Price filter is set");
        List<String> actualResult = searchResultsPage.getSearchResultPrices();
        String expectedResult = "6 руб";
        Assertions.assertTrue(actualResult.stream().allMatch(item -> item.contains(expectedResult)), "Not all titles contain " + expectedResult);
        logger.info("The results are shown according to the price filter");
    }
}
