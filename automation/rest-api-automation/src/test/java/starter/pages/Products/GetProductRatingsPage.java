package starter.pages.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetProductRatingsPage {
    protected static String endpoint = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoint get product rating")
    public String iSetPOSTApiEndpointGetProductRating() {
        return endpoint + "products/60779/ratings";
    }

    @Step("I send request body get product rating")
    public void iSendRequestBodyGetProductRating() {
        SerenityRest.given().get(iSetPOSTApiEndpointGetProductRating());
    }

    @Step("I validate response get product rating")
    public void iValidateResponseGetProductRating() {
        //restAssuredThat(response -> response.body("data[0].Ratings", equalTo(4)));
    }
}
