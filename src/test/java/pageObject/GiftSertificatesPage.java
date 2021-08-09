package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftSertificatesPage {
    public GiftSertificatesPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Подарочный скретч-сертификат')]/../div[3]/a[contains(text(),'Как приобрести')][1]")
    WebElement scretchGiftSertificatLink;
}
