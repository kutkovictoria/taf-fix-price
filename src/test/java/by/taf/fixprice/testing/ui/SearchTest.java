package by.taf.fixprice.testing.ui;

import by.taf.fixprice.po.HomePage;
import by.taf.fixprice.po.SearchResultsPage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.List;

public class SearchTest extends BaseTest {

    @Test
    public void checkSearchResults() {
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
