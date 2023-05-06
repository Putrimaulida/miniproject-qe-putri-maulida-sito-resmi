package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    //======================== Locator ====================
    private By loginBtn() {
        return By.xpath("//span[text()='Login']");
    }
    private By clickRegister() {
        return By.xpath("//a[@href='/auth/register']");
    }
    private By fullNameField() {
        return By.xpath("//label[text()='Nama Lengkap']//following-sibling::input");
    }
    private By emailField() {
        return By.xpath("//label[text()='Email']//following-sibling::input");
    }
    private By passwordField() {
        return By.xpath("//label[text()='Password']//following-sibling::input");
    }
    private By registerBtn() {
        return By.xpath("//span[text()='Register']");
    }
    private By loginPage() {
        return By.xpath("//h3[text()='AltaShop']");
    }
    // --------pages TC02-Register---------
    private By errorMessage() {
        return By.xpath("//div[@role='alert']");
    }

    //======================== Functional ==================
    // --------pages TC01-Register---------
    @Step
    public void userOnLoginPage() {
        open();
        $(loginBtn()).shouldBeVisible();
    }
    @Step
    public void userClickRegister() {
        $(clickRegister()).click();
    }
    @Step
    public void userInputFullName(String fullName) {
        $(fullNameField()).type(fullName);
    }
    @Step
    public void userInputEmail(String email) {
        $(emailField()).type(email);
    }
    @Step
    public void userInputPassword(String password) {
        $(passwordField()).type(password);
    }
    @Step
    public void userClickRegisterButton() {
        $(registerBtn()).click();
    }
    @Step
    public boolean seeLoginHomepage() {
        return $(loginPage()).isDisplayed();
    }

    // --------pages TC02-Register---------
    @Step
    public void userCanSeeErrorMessage() {
        $(errorMessage()).isDisplayed();
    }

}
