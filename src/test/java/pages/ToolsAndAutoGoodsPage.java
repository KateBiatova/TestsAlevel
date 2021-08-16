package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsAndAutoGoodsPage extends TestBase {

    @FindBy(xpath = "//a[contains(text(),'Автошины и диски')]")
    WebElement tiresAndWheels;

    public ToolsAndAutoGoodsPage () {
        PageFactory.initElements(driver, this);
    }
}
