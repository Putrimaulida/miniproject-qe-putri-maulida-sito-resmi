package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.CartPage;

public class CartSteps {
    @Steps
    CartPage cartPage;
    // ============= @TC01-PositiveCart ==============
    @And("user click the cart")
    public void userClickTheCart() {
        cartPage.clickCart();
    }

    @And("user click plus button")
    public void userClickPlusButton() {
        cartPage.clickPlusButton();
    }

    @Then("user can see the number of products increases")
    public void userCanSeeTheNumberOfProductsIncreases() {
        cartPage.userCanSeeTheNumberOfProductsIncreases();
    }

    // ============= @TC02-PositiveCart ==============
    @And("user double click buy button")
    public void userDoubleClickBuyButton() {
        cartPage.doubleClickBuyButton();
    }

    @And("user click min button")
    public void userClickMinButton() {
        cartPage.clickMinButton();
    }

    @Then("user success reduce quantity product")
    public void userSuccessReduceQuantityProduct() {
        cartPage.userSuccessReduceQuantityProduct();
    }

    // ============= @TC03-NegativeCart ==============
    @And("user can not see the number of products in the cart symbol")
    public void userCanNotSeeTheNumberOfProductsInTheCartSymbol() {
        cartPage.userCanNotSeeTheNumberOfProductsInTheCartSymbol();
    }

    @Then("user can see alert {string}")
    public void userCanSeeAlert(String alert) {
        cartPage.userCanSeeAlert(alert);
    }

    // ============= @TC04-PositiveCart ==============
    @And("user click button Bayar")
    public void userClickButtonBayar() {
        cartPage.userClickButtonBayar();
    }

    @Then("user can see transaction page")
    public void userCanSeeTransactionPage() {
        cartPage.userCanSeeTransactionPage();
    }
}
