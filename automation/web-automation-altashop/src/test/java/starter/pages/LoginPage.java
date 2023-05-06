package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
public class LoginPage extends PageObject {
    //======================== Locator ====================
    // ============ @TC01-PositiveLogin =============
    private By emailField() {
        return By.xpath("//label[text()='Email']//following-sibling::input");
    }
    private By passwordField() {
        return By.xpath("//label[text()='Password']//following-sibling::input");
    }
    private By loginBtn() {
        return By.xpath("//span[text()='Login']");
    }
    private By productsPage() {
        return By.xpath("//div[@class='v-main__wrap']");
    }
    // ============ @TC02-NegativeLogin =============
    private By errorMessageLogin() {
        return By.xpath("//div[@class='v-alert__content']");
    }


    //======================== Functional ==================
    // ============ @TC01-PositiveLogin =============
    @Step
    public void onLoginPage() {
        open();
        $(loginBtn()).shouldBeVisible();
    }
    @Step
    public void inputEmailField(String email) {
        $(emailField()).type(email);
    }
    @Step
    public void inputPasswordField(String password) {
        $(passwordField()).type(password);
    }
    @Step
    public void clickLoginBtn() {
        $(loginBtn()).click();
    }
    @Step
    public boolean userOnProductsPage() {
        return $(productsPage()).isDisplayed();
    }

    // ============ @TC02-NegativeLogin =============
    @Step
    public boolean userSeeErrorMessage() {
        return $(errorMessageLogin()).isDisplayed();
    }
    @Step
    public boolean validateEqualErrorMessage(String message) {
        return $(errorMessageLogin()).getText().equalsIgnoreCase(message);
    }

}
