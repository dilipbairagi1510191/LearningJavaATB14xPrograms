package ex_03_put;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class ApiTesting011_put_NonbodyStyple {

    @Test
    public void test_put_non_bdd(){

        String token="871411981fb203c";
        String bookingid= "4079";

        RequestSpecification r;
        Response response;
        ValidatableResponse vr;



        String payload= "{\n" +
                "    \"firstname\" : \"Dilip\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";


        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" +bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("token", token);
        //r.auth().digest();
        r.body(payload).log().all();


        response= r.when().log().all().put();

        vr=response.then().log().all();
        vr.statusCode(200);
    }

}
