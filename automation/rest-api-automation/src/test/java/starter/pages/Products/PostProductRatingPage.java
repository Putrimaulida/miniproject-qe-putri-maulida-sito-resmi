package starter.pages.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
public class PostProductRatingPage {
    protected static String endpoint = "https://altashop-api.fly.dev/api/";
    @Step("I set POST api endpoint product rating")
    public String iSetPOSTApiEndpointProductRating() {
        return endpoint + "products/60779/ratings";
    }

    @Step("I send request body post product rating")
    public void iSendRequestBodyPostProductRating() {
        String body = "{\n" +
                "    \"count\":4\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpointProductRating());
    }

    @Step("I validate response post product rating")
    public void iValidateResponsePostProductRating() {
        restAssuredThat(response -> response.body("data[0].ID", equalTo(60779)));
        restAssuredThat(response -> response.body("data[0].Name", equalTo("Sony PS5")));
        restAssuredThat(response -> response.body("data[0].Description", equalTo("play has no limits")));
        restAssuredThat(response -> response.body("data[0].Price", equalTo(299)));
        restAssuredThat(response -> response.body("data[0].Ratings", equalTo(4)));
        restAssuredThat(response -> response.body("data[0].Categories", empty()));
    }
}
