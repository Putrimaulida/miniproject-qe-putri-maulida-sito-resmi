package starter.stepdefinition.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Products.GetProductRatingsPage;

public class GetProductRatingsSteps {
    @Steps
    GetProductRatingsPage getProductRatings;
    @Given("I set POST api endpoint get product rating")
    public void iSetPOSTApiEndpointGetProductRating() {
        getProductRatings.iSetPOSTApiEndpointGetProductRating();
    }

    @When("I send request body get product rating")
    public void iSendRequestBodyGetProductRating() {
        getProductRatings.iSendRequestBodyGetProductRating();
    }

    @And("I validate response get product rating")
    public void iValidateResponseGetProductRating() {
        getProductRatings.iValidateResponseGetProductRating();
    }
}
