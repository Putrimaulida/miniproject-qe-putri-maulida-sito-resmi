package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {
    //======================== Locator ====================
    // ============ @TC01-PositiveSelectProduct =============
    private By buyBtn() {
        return By.xpath("//span[text()='Beli']");
    }
    private By addCart() {
        return By.xpath("//span[@class='v-badge__wrapper']");
    }

    // ============ @TC02-PositiveDetailProduct =============
    private By detailBtn() {
        return By.xpath("//span[text()='Detail']");
    }
    private By detailProduct() {
        return By.xpath("//div[@class='v-card__text']");
    }

    // ============ @TC03-PositiveProductRating =============
    private By productRat() {
        return By.xpath("//button[@aria-label='Rating 3 of 5']");
    }
    private By seeRatProduct() {
        return By.xpath("//div[@class='v-rating v-rating--dense']");
    }

    // ============ @TC04-PositiveSelectCategory =============
    private By dropdownCategories() {
        return By.xpath("//div[@class='v-select__selections']");
    }
    private By itemCategories() {
        return By.xpath("//div[@class='v-list-item__title']");
    }
    private By messageCategories() {
        return By.xpath("//div[text()=' Products is empty! ']");
    }

    // ======================== Functional ==================
    // ============ @TC01-PositiveSelectProduct =============
    @Step
    public void userClickBuyButton() {
        $(buyBtn()).click();
    }
    @Step
    public void userSuccessToAddProductToCart() {
        $(addCart()).isDisplayed();
    }

    // ============ @TC02-PositiveDetailProduct =============
    @Step
    public void userClickDetailButton() {
        $(detailBtn()).click();
    }
    @Step
    public boolean userCanSeeDetailProducts() {
        return $(detailProduct()).isDisplayed();
    }

    // ============ @TC03-PositiveProductRating =============
    @Step
    public void addProductRating() {
        $(productRat()).click();
    }
    @Step
    public boolean userSuccessfullyProductRating() {
        return $(seeRatProduct()).isDisplayed();
    }

    // ============ @TC04-PositiveSelectCategory =============
    @Step
    public void userClickDropdownSelectCategory() {
        $(dropdownCategories()).click();
    }

    @Step
    public void userClickOneOfTheCategories() {
        $(itemCategories()).click();
    }

    @Step
    public boolean userCanSeeMessage(String arg0) {
        return $(messageCategories()).isDisplayed();
    }
}
