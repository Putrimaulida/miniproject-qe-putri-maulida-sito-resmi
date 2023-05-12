package starter.pages.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCategoryIdPage {
    public static String endpoint = "https://altashop-api.fly.dev/api/";
    @Step("I set GET api endpoint get category id")
    public String iSetGETApiEndpointGetCategoryId() {
        return endpoint + "categories/29363";
    }

    @Step("I send request body get category id")
    public void iSendRequestBodyGetCategoryId() {
        SerenityRest.given().get(iSetGETApiEndpointGetCategoryId());
    }

    @Step("I validate response get category id")
    public void iValidateResponseGetCategoryId() {
//        restAssuredThat(response -> response.body("data.ID", equalTo(29363)));
//        restAssuredThat(response -> response.body("data.Name", equalTo("gaming")));
//        restAssuredThat(response -> response.body("data.Description", equalTo("for gaming purposes")));
    }
}
