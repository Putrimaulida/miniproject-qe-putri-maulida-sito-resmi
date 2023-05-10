package starter.pages.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostRegisterPage {
    protected static String endpoint = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoint post register")
    public String iSetPOSTApiEndpointPostRegister() {
        return endpoint + "auth/register";
    }

    @Step("I send request body post register")
    public void iSendRequestBodyPostRegister() {
        String body = "{\n" +
                "    \"email\":\"putrimaulida55@mail.com\",\n" +
                "    \"password\":\"123123\",\n" +
                "    \"fullname\":\"Putri Maulida Sito Resmi\"\n" +
                "}";
        JSONObject regBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(regBody.toString()).post(iSetPOSTApiEndpointPostRegister());
    }

    @Step("I receive valid HTTP response code 200 OK")
    public void iReceiveValidHTTPResponseCode() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive validate for register")
    public void iReceiveValidateForRegister() {
        restAssuredThat(response -> response.body("data[0].fullname", equalTo("Putri Maulida Sito Resmi")));
    }

    // negative register
    @Step("I receive valid HTTP response code 400 OK")
    public void iReceiveValidHTTPResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));
    }
}
