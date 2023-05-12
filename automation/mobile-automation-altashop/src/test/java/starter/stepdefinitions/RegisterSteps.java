package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.screen.RegisterScreen;

public class RegisterSteps {
    @Steps
    RegisterScreen register;
    // ========== @TC01-Register ==========
    @Given("user on login homepage")
    public void userOnLoginHomePage() {
        register.onHomePage();
    }
    @When("user click widget button")
    public void userClickWidgetButton() {
        register.clickWidgetIcon();
    }
    @And("user click register")
    public void userClickRegister() {
        register.registerClick();
    }
    @And("user input full name")
    public void userInputFullName() {
        register.inputFullName("Putri Maulida Sito Resmi");
    }
    @And("user input valid email")
    public void userInputValidEmail() {
        register.inputEmail("putrimaulida123@gmail.com");
    }
    @And("user input password")
    public void userInputPassword() {
        register.inputPassword("putri123");
    }
    @And("user click register button")
    public void userClickRegisterButton() {
        register.clickRegisterBtn();
    }
    @Then("user on the products page")
    public void userOnTheProductsPage() {
        register.onProductPage();
    }

    // ========== @TC02-Register ==========
//    @And("user input new full name")
//    public void userInputNewFullName() {
//        register.newFullNameField("Tiara Andini");
//    }
//    @Then("user see error message")
//    public void userSeeErrorMessage() {
//        register.errorMessage();
//    }

}
