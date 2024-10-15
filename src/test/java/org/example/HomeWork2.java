package org.example;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.apache.http.HttpStatus;
import org.example.api.UnicormRequests;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.Locale;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasKey;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class HomeWork2 {
    @BeforeAll
    public static   void setupTest(){
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        baseURI = "https://crudcrud.com/api/b6fd70ae9a624a528a5558c163ad7b60";

    }

    @Test
    public void userShouldBeAbleCreateUnicorm() {
        //создание единорога
        Faker faker = new Faker(new Locale("ru"));
        String fakerColor = String.valueOf(faker.color().name());
        String fakerName = String.valueOf(faker.name().name());

        String id = UnicormRequests.createUnicorm("{\n" +
                "  \"name\" : \""+  fakerName +"\" ,\n" +
                "  \"color\" : \"" + fakerColor +"\"\n" +
                "}");

    }
    @Test
    public void userShouldBeAbleDeleteExistingUnicorm(){

        //шаг 1 создание единорога
        //создание единорога
        Faker faker = new Faker(new Locale("ru"));
        String fakerColor = String.valueOf(faker.color().name());
        String fakerName = String.valueOf(faker.name().name());

        String id = UnicormRequests.createUnicorm("{\n" +
                "  \"name\" : \""+  fakerName +"\" ,\n" +
                "  \"color\" : \"" + fakerColor +"\"\n" +
                "}");

        // шаг 2 удаление студента
        UnicormRequests.deleteUnicorm(id);

        // шаг 3 проверить что единорог не существует
        given()
                .get(baseURI +"/unicorm/"+ id)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_NOT_FOUND);
    }

    @Test
    public void updateColorTailUnicorm(){
        //шаг 1 создание единорога
        //создание единорога
        Faker faker = new Faker(new Locale("ru"));
        String fakerColor = String.valueOf(faker.color().name());
        String fakerName = String.valueOf(faker.name().name());
        String fakerColor2 = String.valueOf(faker.color().name());

        String id = UnicormRequests.createUnicorm("{\n" +
                "  \"name\" : \""+  fakerName +"\" ,\n" +
                "  \"color\" : \"" + fakerColor +"\"\n" +
                "}");
        //шаг 2 обновление единорога
        String body = "{\n" +
                "  \"name\" : \""+  fakerName +"\" ,\n" +
                "  \"color\" : \"" + fakerColor2 +"\"\n" +
                "}";

        UnicormRequests.updateUnicorm(id,body);
        //шаг 3 проверяем что данные обновились
        String colorResponse = given()
                .get(baseURI +"/unicorm/"+ id)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .body("$", hasKey("_id"))
                .extract()
                .path("color");

        assertEquals(colorResponse,fakerColor2);


    }

}
