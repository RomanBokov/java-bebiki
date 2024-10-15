package org.example.api;

import com.fasterxml.jackson.databind.JsonNode;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasKey;

public class UnicormRequests {
    private static Object ArrayList;

    public static String createUnicorm(String body) {
        return given()
                .body(body)
                .contentType(ContentType.JSON)
                .when()
                .post("/unicorm")
                .then()
                .assertThat()
                .statusCode(201)
                .body("$", hasKey("_id"))
                .extract()
                .path("_id");


    }

    public static void deleteUnicorm(String id) {
        given().delete("https://crudcrud.com/api/b6fd70ae9a624a528a5558c163ad7b60/unicorm/" + id)
                .then()
                .assertThat()
                .statusCode(200);
    }

    public static void updateUnicorm(String id, String body) {
        given().given()
                .body(body)
                .contentType(ContentType.JSON)
                .when()
                .put("https://crudcrud.com/api/b6fd70ae9a624a528a5558c163ad7b60/unicorm/" + id)
                .then()
                .assertThat()
                .statusCode(200);
    }


}
