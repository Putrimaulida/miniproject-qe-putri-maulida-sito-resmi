package starter.stepdefinition.ProductCategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ProductCategories.GetCategoryIdPage;

public class GetCategoryIdSteps {
    @Steps
    GetCategoryIdPage getCategoryId;
    @Given("I set GET api endpoint get category id")
    public void iSetGETApiEndpointGetCategoryId() {
        getCategoryId.iSetGETApiEndpointGetCategoryId();
    }

    @When("I send request body get category id")
    public void iSendRequestBodyGetCategoryId() {
        getCategoryId.iSendRequestBodyGetCategoryId();
    }

    @And("I validate response get category id")
    public void iValidateResponseGetCategoryId() {
        getCategoryId.iValidateResponseGetCategoryId();
    }
}
