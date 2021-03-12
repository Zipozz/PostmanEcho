package ru.netology.domain;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class PostmanTest {

    @Test
    void shouldReturnDemoAccounts() {

        given()// Предусловия
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Данные")// отправляемые данные (заголовки и query можно выставлять аналогично)
                .when()// Выполняемые действия
                .post("/post")
                .then()// Проверки
                .statusCode(200)
                .body("data", Matchers.equalTo("Данные"));
    }
}
