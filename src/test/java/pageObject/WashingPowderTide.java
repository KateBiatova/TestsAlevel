package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WashingPowderTide {
    public WashingPowderTide (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//app-product-buy-btn/app-buy-button/button")
    WebElement buyButton;
}
