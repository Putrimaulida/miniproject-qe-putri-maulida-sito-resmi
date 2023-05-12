package starter.stepdefinition.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Products.GetAllProductsPage;

public class GetAllProductsStep {
    @Steps
    GetAllProductsPage getAllProducts;
    @Given("I set the api GET ALL endpoint")
    public void iSetTheApiGETALLEndpoint() {
        getAllProducts.iSetTheApiGETALLEndpoint();
    }

    @When("I send a HTTP GET ALL request")
    public void iSendAHTTPGETALLRequest() {
        getAllProducts.iSendAHTTPGETALLRequest();
    }

    @Then("I receive valid the HTTP response code 200")
    public void iReceiveValidTheHTTPResponseCode() {
        getAllProducts.iReceiveValidTheHTTPResponseCode();
    }

    @And("I receive any data for all users details")
    public void iReceiveAnyDataForAllUsersDetails() {
        getAllProducts.iReceiveAnyDataForAllUsersDetails();
    }
}
