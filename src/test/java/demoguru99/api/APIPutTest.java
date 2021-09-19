package demoguru99.api;

import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class APIPutTest {

    private static final String API_URL = "https://reqres.in/api/users/2";

    @Test
    public void test2() {

        JSONObject request = new JSONObject();
        request.put("name", "Eugene");
        request.put("job", "QA Engineer");
        System.out.println(request);

        given().
                body(request.toJSONString()).
                when().
                put(API_URL).
                then().statusCode(200);
    }
}
