package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TiresPage {
    public TiresPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//rz-grid/ul/li[1]/app-goods-tile-default/div/div[2]/a")
    WebElement firstTire;
}
