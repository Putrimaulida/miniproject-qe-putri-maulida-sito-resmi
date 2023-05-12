package starter.pages.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class GetAllCategoriesPage {
    public static String endpoint = "https://altashop-api.fly.dev/api/";
    @Step("I set GET api endpoint get all categories")
    public String iSetGETApiEndpointGetAllCategories() {
        return endpoint + "categories";
    }

    @Step("I send request body get all categories")
    public void iSendRequestBodyGetAllCategories() {
        SerenityRest.given().get(iSetGETApiEndpointGetAllCategories());
    }

    @Step("I validate response get all categories")
    public void iValidateResponseGetAllCategories() {
        restAssuredThat(response -> response.body("data[0].ID", equalTo(14241)));
    }
}
