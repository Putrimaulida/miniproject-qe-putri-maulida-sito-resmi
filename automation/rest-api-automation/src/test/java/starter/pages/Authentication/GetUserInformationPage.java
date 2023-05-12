package starter.pages.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetUserInformationPage {
    protected String email = "putrimaulida55@mail.com";
    protected String password = "123123";
    protected static String endpoint = "https://altashop-api.fly.dev/api/";
    public String token = "";

    @Step("I set api endpoint auth")
    public String iSetApiEndpointAuth() {
        return endpoint + "auth/login";
    }

    @Step("I send endpoint auth")
    public void iSendEndpointAuth() {
        String body = "{\n"     +
                "         \"email\":" + email +",\n " +
                "         \"password\":" + password +",\n " +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type","application/json").body(reqBody.toString()).post(iSetApiEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data");
    }

    @Step("I set api endpoint get user information")
    public String iSetApiEndpointGetUserInformation() {
        return endpoint + "/info";
    }

    @Step("I send HTTP request")
    public void iSendHTTPRequest() {
        SerenityRest.given().header("Authorization","Bearer " + token).get(iSetApiEndpointGetUserInformation());
    }

    @Step("I receive response code {int}")
    public void iReceiveResponseCode() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I validate response body get user information")
    public void iValidateResponseBodyGetUserInformation() {
        restAssuredThat(response -> response.body("data.ID", equalTo(21443)));
        restAssuredThat(response -> response.body("data.Fullname", equalTo("Putri Maulida Sito Resmi")));
        restAssuredThat(response -> response.body("data.Email", equalTo("putrimaulida55@mail.com")));
        restAssuredThat(response -> response.body("data.Password", equalTo("123123")));
    }
}
