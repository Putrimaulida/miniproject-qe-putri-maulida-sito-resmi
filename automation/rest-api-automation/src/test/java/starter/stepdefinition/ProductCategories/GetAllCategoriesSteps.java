package starter.stepdefinition.ProductCategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ProductCategories.GetAllCategoriesPage;

public class GetAllCategoriesSteps {
    @Steps
    GetAllCategoriesPage getAllCategories;
    @Given("I set GET api endpoint get all categories")
    public void iSetGETApiEndpointGetAllCategories() {
        getAllCategories.iSetGETApiEndpointGetAllCategories();
    }

    @When("I send request body get all categories")
    public void iSendRequestBodyGetAllCategories() {
        getAllCategories.iSendRequestBodyGetAllCategories();
    }

    @And("I validate response get all categories")
    public void iValidateResponseGetAllCategories() {
        getAllCategories.iValidateResponseGetAllCategories();
    }
}
