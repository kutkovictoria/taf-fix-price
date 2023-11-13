package by.taf.fixprice.testing.ui;

import by.taf.fixprice.po.HomePage;
import by.taf.fixprice.po.SearchResultsPage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SearchTest extends BaseTest {
    @Test
    public void checkSearchResults() {
        HomePage homePage = new HomePage();
        homePage.enterSearchQuery("Пенал");
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.clickCompanyFilter();
        List<String> actualResult = searchResultsPage.getSearchResultTitles();
        String expectedResult = "Пенал";
        Assertions.assertTrue(actualResult.stream().allMatch(item -> item.contains(expectedResult)), "Not all titles contain " + expectedResult);
    }

    @Test
    public void checkCompanyFilterIsApplied() {
        HomePage homePage = new HomePage();
        homePage.enterSearchQuery("Пенал");
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.clickCompanyFilter();
        List<String> actualResult = searchResultsPage.getSearchResultTitles();
        String expectedResult = "Hupper Dupper";
        Assertions.assertTrue(actualResult.stream().allMatch(item -> item.contains(expectedResult)), "Not all titles contain " + expectedResult);
    }

    @Test
    public void checkPriceFilterIsApplied() {
        HomePage homePage = new HomePage();
        homePage.enterSearchQuery("Пенал");
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.clickCompanyFilter();
        searchResultsPage.click6BYNPriceFilter();
        List<String> actualResult = searchResultsPage.getSearchResultPrices();
        String expectedResult = "6 руб";
        Assertions.assertTrue(actualResult.stream().allMatch(item -> item.contains(expectedResult)), "Not all titles contain " + expectedResult);
    }
}
