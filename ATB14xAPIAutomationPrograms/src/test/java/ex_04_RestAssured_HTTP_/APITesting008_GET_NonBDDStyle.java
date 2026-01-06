package ex_04_RestAssured_HTTP_;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting008_GET_NonBDDStyle {

    RequestSpecification r;          //Given
    Response response;               //when
    ValidatableResponse vr;          //then
    String pincode;



    @Test
    public void test_GET_NON_BDD_STYLE(){

        pincode = "560049";
        //Divide your program into three part


        //Given part 1
        r= RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pincode);

        //when part 2
        response = r.when().log().all().get();
        System.out.println(response.asString());

        //Then part 3
        vr = response.then().log().all();
        vr.statusCode(200);



    }
}
