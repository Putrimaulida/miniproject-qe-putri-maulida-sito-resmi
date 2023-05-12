package starter.stepdefinition.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Products.PostProductRatingPage;

public class PostProductRatingSteps {
    @Steps
    PostProductRatingPage postProductRating;
    @Given("I set POST api endpoint product rating")
    public void iSetPOSTApiEndpointProductRating() {
        postProductRating.iSetPOSTApiEndpointProductRating();
    }

    @When("I send request body post product rating")
    public void iSendRequestBodyPostProductRating() {
        postProductRating.iSendRequestBodyPostProductRating();
    }

    @And("I validate response post product rating")
    public void iValidateResponsePostProductRating() {
        postProductRating.iValidateResponsePostProductRating();
    }
}
