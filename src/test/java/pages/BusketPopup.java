package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusketPopup extends TestBase {

    @FindBy(xpath = "//a[contains(text(),'Оформить заказ')]")
    WebElement checkoutButton;

    public BusketPopup () {
        PageFactory.initElements(driver, this);
    }

    public void checkout(){
        busketPopup.checkoutButton.click();
    }
}
