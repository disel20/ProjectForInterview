package demoguru99.api;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APIPostTest {

    private static final String API_URL = "https://reqres.in/api/users";

    @Test
    public void test() {

        JSONObject request = new JSONObject();
        request.put("name", "Eugene");
        request.put("job", "QA Engineer");

        System.out.println(request);

        given().
                body(request.toJSONString()).
                when().
                post(API_URL).
                then().statusCode(201);
    }

}
