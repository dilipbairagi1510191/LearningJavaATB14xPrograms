package TheTestingAcademy.ex_02_RA_Concept;

import io.restassured.RestAssured;

public class Api_Testing_Lab05 {
    public static void main(String[] args) {

        String pincode="110048";
        RestAssured
                .given()
                   .baseUri("https://api.zippopotam.us")
                   .basePath("/IN/"+pincode)
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);
    }
}
