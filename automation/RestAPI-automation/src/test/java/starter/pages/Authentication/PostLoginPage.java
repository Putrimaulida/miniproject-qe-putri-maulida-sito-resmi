package starter.pages.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class PostLoginPage {
    protected static String endpoint = "https://altashop-api.fly.dev/api/";
    public String token="";

    @Step("I set POST api endpoint login")
    public String iSetPOSTApiEndpointLogin() {
        return endpoint + "auth/login";
    }

    @Step("I send request body post login")
    public void iSendRequestBodyPostLogin() {
        String body = "{\n" +
                "    \"email\":\"putrimaulida55@mail.com\",\n" +
                "    \"password\":\"123123\",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpointLogin());
        token = lastResponse().getBody().jsonPath().get("data");
    }

    @Step("I receive validate for login")
    public void iReceiveValidateForLogin() {
        //restAssuredThat(restponse -> restponse.body("data", equalTo(GetUserInformationPage.token)));
    }
}
