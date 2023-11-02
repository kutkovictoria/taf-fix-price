package by.taf.fixprice.testing.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;

public class BaseUrlTest {
    final String BASE_URL = "https://fix-price.by/";

    @Test
    public void get200ok() {
        when().get(BASE_URL).
                then().statusCode(200);
    }
}
