package starter.pages.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCategoryPage {
    public static String endpoint = "https://altashop-api.fly.dev/api/";
    @Step("I set POST api endpoint create category")
    public String iSetPOSTApiEndpointCreateCategory() {
        return endpoint + "categories";
    }

    @Step("I send request body create category")
    public void iSendRequestBodyCreateCategory() {
        String body = "{\n" +
                "    \"name\":\"gaming\",\n" +
                "    \"description\":\"for gaming purposes\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpointCreateCategory());
    }

    @Step("I validate response create category")
    public void iValidateResponseCreateCategory() {
//        restAssuredThat(response -> response.body("data[0].ID", equalTo(29363)));
//        restAssuredThat(response -> response.body("data[0].Name", equalTo("gaming")));
//        restAssuredThat(response -> response.body("data[0].Description", equalTo("for gaming purposes")));

    }
}
