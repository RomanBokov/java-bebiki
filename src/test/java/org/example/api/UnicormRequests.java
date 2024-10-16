package org.example.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;


import io.restassured.mapper.ObjectMapperType;
import org.example.api.models.Unicorm;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasKey;

public class UnicormRequests {


    public static Unicorm createUnicorm(Unicorm unicorm)  {

        String unicormJson = null;
        try {
            unicormJson = new ObjectMapper().writeValueAsString(unicorm);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return given()
                .body(unicormJson)
                .contentType(ContentType.JSON)
                .when()
                .post("/unicorm")
                .then()
                .assertThat()
                .statusCode(201)
                .body("$", hasKey("_id"))
                .extract().as(Unicorm.class, ObjectMapperType.GSON);


    }

    public static void deleteUnicorm(String id) {
        given().delete("https://crudcrud.com/api/ec7700a1b55a4f3ebb7002bac5079d5c/unicorm/" + id)
                .then()
                .assertThat()
                .statusCode(200);
    }

    public static void updateUnicorm(String id, Unicorm unicorm) {
        String unicormJson = null;
        try {
            unicormJson = new ObjectMapper().writeValueAsString(unicorm);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        given().given()
                .body(unicormJson)
                .contentType(ContentType.JSON)
                .when()
                .put("https://crudcrud.com/api/ec7700a1b55a4f3ebb7002bac5079d5c/unicorm/" + id)
                .then()
                .assertThat()
                .statusCode(200);
    }





}
