package starter.stepdefinition.Authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Authentication.PostRegisterPage;

public class PostRegisterSteps {
    @Steps
    PostRegisterPage postRegister;
    @Given("I set POST api endpoint post register")
    public void iSetPOSTApiEndpointPostRegister() {
        postRegister.iSetPOSTApiEndpointPostRegister();
    }

    @When("I send request body post register")
    public void iSendRequestBodyPostRegister() {
        postRegister.iSendRequestBodyPostRegister();
    }

    @Then("I receive valid HTTP response code 200 OK")
    public void iReceiveValidHTTPResponseCode() {
        postRegister.iReceiveValidHTTPResponseCode();
    }

    @And("I receive validate for register")
    public void iReceiveValidateForRegister() {
        //postRegister.iReceiveValidateForRegister();
    }


    // negative register
    @Then("I receive valid HTTP response code 400 OK")
    public void iReceiveValidHTTPResponseCode400() {
        postRegister.iReceiveValidHTTPResponseCode400();
    }
}
