package starter.stepdefinition.Authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Authentication.PostLoginPage;

public class PostLoginSteps {
    @Steps
    PostLoginPage postLogin;
    @Given("I set POST api endpoint login")
    public void iSetPOSTApiEndpointLogin() {
        postLogin.iSetPOSTApiEndpointLogin();
    }

    @When("I send request body post login")
    public void iSendRequestBodyPostLogin() {
        postLogin.iSendRequestBodyPostLogin();
    }

    @And("I receive validate for login")
    public void iReceiveValidateForLogin() {
        postLogin.iReceiveValidateForLogin();
    }
}
