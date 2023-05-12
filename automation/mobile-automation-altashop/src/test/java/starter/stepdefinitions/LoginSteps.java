package starter.stepdefinitions;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.screen.LoginScreen;

public class LoginSteps {
    @Steps
    LoginScreen login;
    @And("user input valid email field")
    public void userInputValidEmailField() {
        login.inputEmailLogin("putrimaulida123@gmail.com");
    }
    @And("user input valid password")
    public void userInputValidPassword() {
        login.inputPasswordLogin("putri123");
    }

    @And("user click login button")
    public void userClickLoginButton() {
        login.clickLoginBtn();
    }


}
