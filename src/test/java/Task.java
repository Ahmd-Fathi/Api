import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Task {


    @Test
    public void Test_Task_Api() {
        baseURI = "https://www.boredapi.com/api/activity";

        String response =
given()
                        .log().all()
                        .header("Content-Type", "application/json")
                        .body(PayLoad.CallBodyJson())

.when()
                        .get()
.then()

                        .assertThat().statusCode(200).extract().response().asString();
    //    System.out.println(response);
        JsonPath js = new JsonPath(response);


        String type = js.getString("type");
        String activity = js.getString("activity");
        String participants = js.getString("type");
        String price = js.getString("price");
        String link = js.getString("link");
        String key = js.getString("key");
        String accessibility = js.getString("accessibility");

        System.out.println(activity);
        Assert.assertNotEquals(activity, "");
        Assert.assertNotEquals(type, "");
        Assert.assertNotEquals(participants, "");
        Assert.assertNotEquals(price, "");
        Assert.assertNotNull(link);
        Assert.assertNotEquals(key, "");
        Assert.assertNotEquals(accessibility, "");


    }


}
