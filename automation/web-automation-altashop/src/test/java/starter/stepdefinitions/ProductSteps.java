package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ProductPage;

public class ProductSteps {
    @Steps
    ProductPage productPage;
    // ============ @TC01-PositiveSelectProduct =============
    @And("user click buy button")
    public void userClickBuyButton() {
        productPage.userClickBuyButton();
    }

    @Then("user success to add product to cart")
    public void userSuccessToAddProductToCart() {
        productPage.userSuccessToAddProductToCart();
    }

    // ============ @TC02-PositiveDetailProduct =============
    @And("user click detail button")
    public void userClickDetailButton() {
        productPage.userClickDetailButton();
    }

    @Then("user can see detail products")
    public void userCanSeeDetailProducts() {
        productPage.userCanSeeDetailProducts();
    }

    // ============ @TC03-PositiveProductRating =============
    @And("user fills on product rating")
    public void userFillsOnProductRating() {
        productPage.addProductRating();
    }

    @Then("user successfully product rating")
    public void userSuccessfullyProductRating() {
        productPage.userSuccessfullyProductRating();
    }

    // ============ @TC04-PositiveSelectCategory =============
    @And("user click dropdown select category")
    public void userClickDropdownSelectCategory() {
        productPage.userClickDropdownSelectCategory();
    }

    @And("user click one of the categories")
    public void userClickOneOfTheCategories() {
        productPage.userClickOneOfTheCategories();
    }

    @Then("user can see message {string}")
    public void userCanSeeMessage(String message) {
        productPage.userCanSeeMessage(message);
    }
}
