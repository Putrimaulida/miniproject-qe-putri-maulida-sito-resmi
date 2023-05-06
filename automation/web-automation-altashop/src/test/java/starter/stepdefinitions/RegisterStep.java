package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterPage;

public class RegisterStep {
    @Steps
    RegisterPage registerPage;
    @Given("user on login homepage")
    public void userOnLoginHomepage() {
        registerPage.userOnLoginPage();
    }

    @When("user click register")
    public void userClickRegister() {
        registerPage.userClickRegister();
    }

    @And("user input full name")
    public void userInputFullName() {
        registerPage.userInputFullName("Putri Maulida Sito Resmi");
    }

    @And("user input email")
    public void userInputEmail() {
        registerPage.userInputEmail("putrimaulida368@gmail.com");
    }

    @And("user input password")
    public void userInputPassword() {
        registerPage.userInputPassword("putri25");
    }

    @And("user click register button")
    public void userClickRegisterButton() {
        registerPage.userClickRegisterButton();
    }

    @Then("user see login homepage")
    public void userSeeLoginHomepage() {
        registerPage.seeLoginHomepage();
    }

    // --------pages TC02-Register---------
    @Then("user can see error message")
    public void userCanSeeErrorMessage() {
        registerPage.userCanSeeErrorMessage();
    }


}
