package org.example;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class SimpleTest {


    @Test
    public void userShouldBeAbleCreateStudent(){
        //given - when -then
        given()
                .body("{\n" +
                        "  \"name\" : \"Вася Пупкин\",\n" +
                        "  \"grade\" : 2\n" +
                        "}")
                .post("https://crudcrud.com/api/3137b1b269f34a319561af1632fdad88/student")
                .then()


    }
}
