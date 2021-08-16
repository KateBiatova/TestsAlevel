package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WashingPowderTide extends TestBase {

    @FindBy(xpath = "//app-product-buy-btn/app-buy-button/button")
    WebElement buyButton;

    public WashingPowderTide() {
        PageFactory.initElements(driver, this);
    }

    public void moveFocusOnPage() {
        Actions action = new Actions(driver);
        action.moveByOffset(140, 140).release().perform();
    }

    public void buyWashingPowder() {
        washingPowderTide.buyButton.click();
    }
}
