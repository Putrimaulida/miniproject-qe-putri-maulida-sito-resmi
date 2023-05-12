package starter.stepdefinition.ProductCategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ProductCategories.PostCategoryPage;

public class PostCategorySteps {
    @Steps
    PostCategoryPage postCategory;
    @Given("I set POST api endpoint create category")
    public void iSetPOSTApiEndpointCreateCategory() {
        postCategory.iSetPOSTApiEndpointCreateCategory();
    }

    @When("I send request body create category")
    public void iSendRequestBodyCreateCategory() {
        postCategory.iSendRequestBodyCreateCategory();
    }

    @And("I validate response create category")
    public void iValidateResponseCreateCategory() {
        postCategory.iValidateResponseCreateCategory();
    }
}
