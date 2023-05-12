package starter.pages.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class DeleterProductPage {
    protected static String endpoint = "https://altashop-api.fly.dev/api/";

    @Step("I set DELETE api endpoints")
    public String iSetDELETEApiEndpoints() {
        return endpoint + "products/33137";
    }

    @Step("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() {
        SerenityRest.given().delete(iSetDELETEApiEndpoints());
    }
}
