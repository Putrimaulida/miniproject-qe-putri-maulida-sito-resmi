package starter.pages.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllProductsPage {
    protected static String endpoint = "https://altashop-api.fly.dev/api/";

    @Step("I set the api GET ALL endpoint")
    public String iSetTheApiGETALLEndpoint() {
        return endpoint + "products";
    }

    @Step("I send a HTTP GET ALL request")
    public void iSendAHTTPGETALLRequest() {
        SerenityRest.given().header("Content-Type", "application/json").get(iSetTheApiGETALLEndpoint());
    }

    @Step("I receive valid the HTTP response code 200")
    public void iReceiveValidTheHTTPResponseCode() {
        restAssuredThat(response -> response.statusCode(200));

    }

    @Step("I receive any data for all users details")
    public void iReceiveAnyDataForAllUsersDetails(){
        restAssuredThat(response -> response.body("data[0].ID", equalTo(13347)));
    }
}
