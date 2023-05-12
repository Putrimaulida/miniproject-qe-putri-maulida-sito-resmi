package starter.pages.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostNewProductPage {
    protected static String endpoint = "https://altashop-api.fly.dev/api/";
    public String token = "";

    @Step("I set POST api endpoint")
    public String iSetPOSTApiEndpoint() {
        return endpoint + "products";
    }

    @Step("I send POST HTTP request body")
    public void iSendPOSTHTTPRequestBody() {
        String body = "{\n" +
                "    \"name\":\"Sony PS5\",\n" +
                "    \"description\":\"play has no limits\",\n" +
                "    \"price\":299,\n" +
                "    \"categories\":[\n" +
                "        1\n" +
                "    ]\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode() {
        SerenityRest.given().header("Authorization", "Bearer " + token).get(iSetPOSTApiEndpoint());
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for new user")
    public void iReceiveValidDataForNewUser() {
//        restAssuredThat(response -> response.body("data[0].ID", equalTo(14424)));
//        restAssuredThat(response -> response.body("data[0].Name", equalTo("Sony PS5")));
//        restAssuredThat(response -> response.body("data[0].Description", equalTo("play has no limits")));
//        restAssuredThat(response -> response.body("data[0].Price", equalTo(299)));
//        restAssuredThat(response -> response.body("data[0].Ratings", equalTo(0)));
//        restAssuredThat(response -> response.body("data[0].Categories", equalTo("")));
    }
}
