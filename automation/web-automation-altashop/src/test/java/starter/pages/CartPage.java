package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class CartPage extends PageObject {
    //=================== Locator ====================
    //============== @TC01-PositiveCart ==============
    private By theCart() {
        return By.xpath("//span[@class='v-badge v-badge--bottom v-badge--left v-badge--overlap theme--dark']");
    }
    private By plusBtn() {
        return By.xpath("//span[text()='+']");
    }
    private By totalQty() {
        return By.id("label-total-quantity");
    }

    // ============= @TC02-PositiveCart ==============
    private By doubleClickBuy() {
        return By.xpath("//span[text()='Beli']");
    }
    private By minBtn() {
        return By.xpath("//span[text()='-']");
    }
    private By totalQtyReduce() {
        return By.id("label-total-quantity");
    }

    // ============= @TC03-NegativeCart ==============
    private By emptyOrder() {
        return By.xpath("//button[@class='v-btn v-btn--icon v-btn--round theme--dark v-size--default']");
    }
    private By alertMessage() {
        return By.xpath("//div[@class='v-alert__content']");
    }

    // ============= @TC04-PositiveCart ==============
    private By bayarBtn() {
        return By.xpath("//span[text()=' Bayar ']");
    }
    private By canSeeTransactionPage() {
        return By.xpath("//div[@class='v-application--wrap']");
    }

    //======================== Functional ==================
    //============== @TC01-PositiveCart ==============
    @Step
    public void clickCart() {
        $(theCart()).click();
    }
    @Step
    public void clickPlusButton() {
        $(plusBtn()).click();
    }
    @Step
    public boolean userCanSeeTheNumberOfProductsIncreases() {
        return $(totalQty()).isDisplayed();
    }

    // ============= @TC02-PositiveCart ==============
    @Step
    public void doubleClickBuyButton() {
        $(doubleClickBuy()).click();
        $(doubleClickBuy()).click();
    }
    @Step
    public void clickMinButton() {
        $(minBtn()).click();
    }
    @Step
    public void userSuccessReduceQuantityProduct() {
        $(totalQtyReduce()).isDisplayed();
    }

    // ============= @TC03-NegativeCart ==============
    @Step
    public boolean userCanNotSeeTheNumberOfProductsInTheCartSymbol() {
        return $(emptyOrder()).isDisplayed();
    }
    @Step
    public boolean userCanSeeAlert(String arg0){
        return $(alertMessage()).isDisplayed();
    }

    // ============= @TC04-PositiveCart ==============
    @Step
    public void userClickButtonBayar() {
        $(bayarBtn()).click();
    }
    @Step
    public boolean userCanSeeTransactionPage() {
        return $(canSeeTransactionPage()).isDisplayed();
    }
}
