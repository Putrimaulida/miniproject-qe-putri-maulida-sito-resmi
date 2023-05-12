package starter.stepdefinition.Products;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Products.DeleterProductPage;

public class DeleteProductSteps {
    @Steps
    DeleterProductPage delProduct;
    @Given("I set DELETE api endpoints")
    public void iSetDELETEApiEndpoints() {
        delProduct.iSetDELETEApiEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() {
        delProduct.iSendDELETEHTTPRequest();
    }
}
