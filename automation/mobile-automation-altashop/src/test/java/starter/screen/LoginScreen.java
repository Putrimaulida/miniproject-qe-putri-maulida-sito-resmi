package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {
    private By emailLogin() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By passwordLogin() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    private By loginButton() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    @Step
    public void inputEmailLogin(String emailLogin) {
        onClick(emailLogin());
        onType(emailLogin(), emailLogin);
    }
    @Step
    public void inputPasswordLogin(String passwordLogin) {
        onClick(passwordLogin());
        onType(passwordLogin(), passwordLogin);
    }
    @Step
    public void clickLoginBtn() {
        onClick(loginButton());
    }
}
