package by.taf.fixprice.testing.ui;

import by.taf.fixprice.po.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest{
    @Test
    public void homePageIsOpened(){
        HomePage homePage = new HomePage();
        String actualResult = homePage.getCopyRightText();
        String expectedResult = "ООО \"Фикс Прайс Запад\"\n" +
                "УНП 193351144\n" +
                "220004, Минск, Короля, 51, пом. 13, офис 13-14\n" +
                "Телефон: +375(44)-514-19-04";
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
