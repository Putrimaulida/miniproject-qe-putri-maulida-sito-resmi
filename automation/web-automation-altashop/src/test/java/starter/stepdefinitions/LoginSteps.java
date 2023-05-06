package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;
    // ============ @TC01-PositiveLogin =============
    @Given("user on login page")
    public void userOnLoginPage() {
        loginPage.onLoginPage();
    }

    @When("user input valid email")
    public void userInputValidEmail() {
        loginPage.inputEmailField("putrimaulida368@gmail.com");
    }

    @And("user input valid password")
    public void userInputValidPassword() {
        loginPage.inputPasswordField("putri25");
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("user on products page")
    public void userOnProductsPage() {
        loginPage.userOnProductsPage();
    }
    //========== @TC02-NegativeLogin ============
    @When("user input invalid email")
    public void userInputInvalidEmail() {
        loginPage.inputEmailField("putrimaulida369@gmail.com");
    }

    @Then("user see error message {string}")
    public void userSeeErrorMessage(String message) {
        loginPage.userSeeErrorMessage();
        loginPage.validateEqualErrorMessage(message);
    }
    //========== @TC03-NegativeLogin ============
    @And("user input invalid password")
    public void userInputInvalidPassword() {
        loginPage.inputPasswordField("putri55");
    }
}
