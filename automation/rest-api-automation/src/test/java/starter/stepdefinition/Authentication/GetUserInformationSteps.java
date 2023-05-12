package starter.stepdefinition.Authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Authentication.GetUserInformationPage;

public class GetUserInformationSteps {
    @Steps
    GetUserInformationPage getUserInformation;
    @Given("I set api endpoint auth")
    public void iSetApiEndpointAuth() {
        getUserInformation.iSetApiEndpointAuth();
    }

    @And("I send endpoint auth")
    public void iSendEndpointAuth() {
        getUserInformation.iSetApiEndpointAuth();
    }

    @When("I set api endpoint get user information")
    public void iSetApiEndpointGetUserInformation() {
        getUserInformation.iSetApiEndpointGetUserInformation();
    }

    @And("I send HTTP request")
    public void iSendHTTPRequest() {
        getUserInformation.iSendHTTPRequest();
    }

    @Then("I receive response code 200")
    public void iReceiveResponseCode() {
        getUserInformation.iReceiveResponseCode();
    }

    @And("I validate response body get user information")
    public void iValidateResponseBodyGetUserInformation() {
        getUserInformation.iValidateResponseBodyGetUserInformation();
    }
}
