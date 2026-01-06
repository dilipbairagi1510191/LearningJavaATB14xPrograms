package Day1;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class HttpsRequest {

    @Test
    public void GetUser(){

                when()
                        .get("https://jsonplaceholder.typicode.com/posts")
                .then()
                        .statusCode(200)
                        .log().all();
    }

    @Test
    public void creatUser(){

        given()
                .when()

                .then();
    }

}
