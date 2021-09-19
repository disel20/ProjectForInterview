package demoguru99.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.ConnectException;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class APIGetTest {

    private static final String API_URL = "https://reqres.in/api/users?page=2";

    @Test
    public void test() {

        Response response = RestAssured.get(API_URL);
        System.out.println(response.statusCode());
        System.out.println(response.getBody().asString());
        System.out.println(response.statusLine());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

    }

    @Test
    public void getUserAs____() {

        get(API_URL, 200).then().statusCode(201).body("data.id[0]", equalTo(7));
    }

    private Response get(String url, int expectedStatus) {
        Response response = null;
            try {
                response = given().get(url);
            } catch (Exception e) {
                String message = String.format("can't connection to %s", url);
                Assert.fail(message, e);
            }

            return response;

    }

    @Test
    public void test2() {

        given().get(API_URL).then().
                statusCode(200).
                body("data.id[1]", equalTo(8)).
                body("data.first_name", hasItems("Michael","Lindsay")).
                log().all();

    }
}
