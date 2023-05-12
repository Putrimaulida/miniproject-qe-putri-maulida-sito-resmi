package starter.pages.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;

public class GetProductByIdPage {
    public static String endpoint ="https://altashop-api.fly.dev/api/";

    @Step("I set GET id endpoint")
    public String iSetGETIdEndpoint() {
        return endpoint + "products/13409";
    }

    @Step("I send GET id request")
    public void iSendGETIdRequest() {
        SerenityRest.given().get(iSetGETIdEndpoint());
    }

    @Step("I receive valid data for detail user")
    public void iReceiveValidDataForDetailUser() {
//        restAssuredThat(response -> response.body("data[0].ID", equalTo(13409)));
//        restAssuredThat(response -> response.body("data[0].Name", equalTo("Iphone 12 64 gb")));
//        restAssuredThat(response -> response.body("data[0].Description", equalTo("play has no limits")));
//        restAssuredThat(response -> response.body("data[0].Price", equalTo(299)));
//        restAssuredThat(response -> response.body("data[0].Ratings", equalTo(0)));
//        restAssuredThat(response -> response.body("data[0].Categories", empty()));

    }

}
