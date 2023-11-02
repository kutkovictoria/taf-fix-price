package by.taf.fixprice.testing.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class LoginTest {
    final String URL_API = "https://api.fix-price.by/buyer/v2/auth/login";

    @Test
    public void loginAnyLoginAnyPassword() {
        String body = "{\n" +
                "    \"password\": \"qawse8d\",\n" +
                "    \"email\": \"cat7888@gmail.com\",\n" +
                "    \"phone\": null\n" +
                "}";

        given().
                header("Content-Type", "application/json").
                header("x-city", "14").
                header("x-key", "259d1827f3b8f41b6d123d3ebace9759").
                body(body).
                when().post(URL_API).
                then().log().all();
    }
}
