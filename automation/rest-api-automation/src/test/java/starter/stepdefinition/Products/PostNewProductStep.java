package starter.stepdefinition.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Products.PostNewProductPage;

public class PostNewProductStep {
    @Steps
    PostNewProductPage postNewProduct;
    @Given("I set POST api endpoint")
    public void iSetPOSTApiEndpoint() {
        postNewProduct.iSetPOSTApiEndpoint();
    }

    @When("I send POST HTTP request body")
    public void iSendPOSTHTTPRequestBody() {
        postNewProduct.iSendPOSTHTTPRequestBody();
    }

    @Then("I receive valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode() {
        postNewProduct.iReceiveValidHTTPResponseCode();
    }

    @And("I receive valid data for new user")
    public void iReceiveValidDataForNewUser() {
        postNewProduct.iReceiveValidDataForNewUser();
    }
}
