package by.taf.fixprice.testing.ui;

import by.taf.fixprice.po.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomePageTest {
    @Test
    public void openHomePage(){
        HomePage homePage = new HomePage();
        homePage.openHomePage();
        homePage.clickAcceptCookieButton();
        homePage.clickConfirmMinskLocationButton();
        String actualResult = homePage.getCopyRightText();
        String expectedResult = "© Fix Price, 2023";
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
