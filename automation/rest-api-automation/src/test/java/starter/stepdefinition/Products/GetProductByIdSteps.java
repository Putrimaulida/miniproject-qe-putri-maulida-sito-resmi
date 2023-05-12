package starter.stepdefinition.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Products.GetProductByIdPage;

public class GetProductByIdSteps {
    @Steps
    GetProductByIdPage getProductById;
    @Given("I set GET id endpoint")
    public void iSetGETIdEndpoint() {
        getProductById.iSetGETIdEndpoint();
    }

    @When("I send GET id request")
    public void iSendGETIdRequest() {
        getProductById.iSendGETIdRequest();
    }

    @And("I receive valid data for detail user")
    public void iReceiveValidDataForDetailUser() {
        getProductById.iReceiveValidDataForDetailUser();
    }
}
