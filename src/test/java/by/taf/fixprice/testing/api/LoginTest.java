package by.taf.fixprice.testing.api;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {
    final String URL_API = "https://api.fix-price.by/buyer/v2/auth/login";

    @Test
    public void loginAnyEmailAndAnyPassword() {
        String body = "{\n" +
                "    \"password\": \"qaw8s587d\",\n" +
                "    \"email\": \"catrin75a8@gmail.com\",\n" +
                "    \"phone\": null\n" +
                "}";

        given().
                header("Content-Type", "application/json").
                header("x-city", "14").
                header("x-key", "259d1827f3b8f41b6d123d3ebace9759").
                body(body).
                when().post(URL_API).
                then().statusCode(400).
                body("name", equalTo("Bad Request")).
                body("message", equalTo("Неверный логин или пароль. Проверьте введённые данные и попробуйте снова. Осталось попыток: 4"));
    }

    @Test
    public void loginEmptyEmailAndAnyPassword() {
        String body = "{\n" +
                "    \"password\": \"qaw55sff8d\",\n" +
                "    \"email\": \"\",\n" +
                "    \"phone\": null\n" +
                "}";
        given().
                header("Content-Type", "application/json").
                header("x-city", "14").
                header("x-key", "259d1827f3b8f41b6d123d3ebace9759").
                body(body).
                when().post(URL_API).
                then().statusCode(400).
                body("name", equalTo("Bad Request")).
                body("message", equalTo("Ошибка валидации")).
                body("extra.email[0]", equalTo("Требуется указать email"));

    }

    @Test
    public void loginAnyEmailAndEmptyPassword() {
        String body = "{\n" +
                "    \"password\": \"\",\n" +
                "    \"email\": \"ca4875888@gmail.com\",\n" +
                "    \"phone\": null\n" +
                "}";

        given().
                header("Content-Type", "application/json").
                header("x-city", "14").
                header("x-key", "259d1827f3b8f41b6d123d3ebace9759").
                body(body).
                when().post(URL_API).
                then().statusCode(400).
                body("name", equalTo("Bad Request")).
                body("message", equalTo("Ошибка валидации")).
                body("extra.phone[0]", equalTo("Неверный логин или пароль"));
    }

    @Test
    public void loginEmptyEmailAndEmptyPassword() {
        String body = "{\n" +
                "    \"password\": \"\",\n" +
                "    \"email\": \"\",\n" +
                "    \"phone\": null\n" +
                "}";

        given().
                header("Content-Type", "application/json").
                header("x-city", "14").
                header("x-key", "259d1827f3b8f41b6d123d3ebace9759").
                body(body).
                when().post(URL_API).
                then().statusCode(400).
                body("name", equalTo("Bad Request")).
                body("message", equalTo("Ошибка валидации")).
                body("extra.email[0]", equalTo("Требуется указать email"));
    }

    @Test
    public void loginIncorrectEmailAndAnyPassword() {
        String body = "{\n" +
                "    \"password\": \"qwe4rt3\",\n" +
                "    \"email\": \"test.com\",\n" +
                "    \"phone\": null\n" +
                "}";

        given().
                header("Content-Type", "application/json").
                header("x-city", "14").
                header("x-key", "259d1827f3b8f41b6d123d3ebace9759").
                body(body).
                when().post(URL_API).
                then().statusCode(400).
                body("name", equalTo("Bad Request")).
                body("message", equalTo("Ошибка валидации")).
                body("extra.email[0]", equalTo("Укажите корректный email"));
    }

    @Test
    public void loginAnyPhoneNumberAndAnyPassword() {
        String body = "{\n" +
                "    \"password\": \"q5aws578d\",\n" +
                "    \"email\": null,\n" +
                "    \"phone\": \"+375257255765\" \n" +
                "}";

        given().
                header("Content-Type", "application/json").
                header("x-city", "14").
                header("x-key", "259d1827f3b8f41b6d123d3ebace9759").
                body(body).
                when().post(URL_API).
                then().statusCode(400).
                body("name", equalTo("Bad Request")).
                body("message", equalTo("Неверный логин или пароль. Проверьте введённые данные и попробуйте снова. Осталось попыток: 4"));

    }

    @Test
    public void loginWithIncorrectPhoneNumberAndAnyPassword() {
        String body = "{\n" +
                "    \"password\": \"qaw5s8d\",\n" +
                "    \"email\": null,\n" +
                "    \"phone\": \"29525084065\" \n" +
                "}";

        given().
                header("Content-Type", "application/json").
                header("x-city", "14").
                header("x-key", "259d1827f3b8f41b6d123d3ebace9759").
                body(body).
                when().post(URL_API).
                then().statusCode(400).
                body("name", equalTo("Bad Request")).
                body("message", equalTo("Ошибка валидации")).
                body("extra.phone[0]", equalTo("Укажите корректный номер телефона"));
    }

    @Test
    public void loginAnyPhoneNumberAndEmptyPassword() {
        String body = "{\n" +
                "    \"password\": \"\",\n" +
                "    \"email\": null,\n" +
                "    \"phone\": \"+375297855767\" \n" +
                "}";

        given().
                header("Content-Type", "application/json").
                header("x-city", "14").
                header("x-key", "259d1827f3b8f41b6d123d3ebace9759").
                body(body).
                when().post(URL_API).
                then().statusCode(400).
                body("name", equalTo("Bad Request")).
                body("message", equalTo("Ошибка валидации")).
                body("extra.phone[0]", equalTo("Неверный логин или пароль"));

    }

    @Test
    public void loginEmptyPhoneNumberAndEmptyPassword() {
        String body = "{\n" +
                "    \"password\": \"\",\n" +
                "    \"email\": null,\n" +
                "    \"phone\": \"\" \n" +
                "}";

        given().
                header("Content-Type", "application/json").
                header("x-city", "14").
                header("x-key", "259d1827f3b8f41b6d123d3ebace9759").
                body(body).
                when().post(URL_API).
                then().statusCode(400).
                body("name", equalTo("Bad Request")).
                body("message", equalTo("Ошибка валидации")).
                body("extra.phone[0]", equalTo("Требуется указать телефон"));

    }
}
