package by.taf.fixprice.testing.ui;

import by.taf.fixprice.po.CatalogPage;
import by.taf.fixprice.po.HomePage;
import by.taf.fixprice.po.SearchResultsPage;

import by.taf.fixprice.webdriver.Singleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


public class SearchTest extends BaseTest {
    @Test
    public void searchTest() {
        HomePage homePage = new HomePage();
        homePage.clickCatalogButton();

        CatalogPage catalogPage = new CatalogPage();
        catalogPage.clickOfficeSuppliesLink();

        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.clickBerlingoCheckBox();
        searchResultsPage.clickPrice3BYN();
    }
    @Test
    public void checkSearchResults(){
        HomePage homePage = new HomePage();
        homePage.enterSearchQuery();
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        List<String> actualResult = searchResultsPage.getResultTitleList();
        String expectedResult = "Пенал";
        Assertions.assertTrue(actualResult.stream().allMatch(item -> item.contains(expectedResult)), "Not all titles have results found");
    }
}
