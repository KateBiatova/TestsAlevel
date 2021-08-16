package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TiresPage extends TestBase {

    @FindBy(xpath = "//rz-grid/ul/li[1]/app-goods-tile-default/div/div[2]/a")
    WebElement firstTire;

    public TiresPage () {
        PageFactory.initElements(driver, this);
    }
}
