package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiftSertificatesPage extends TestBase {

    @FindBy(xpath = "//div[contains(text(),'Подарочный скретч-сертификат')]/../div[3]/a[contains(text(),'Как приобрести')][1]")
    WebElement scretchGiftSertificatLink;

    public GiftSertificatesPage () {
        PageFactory.initElements(driver, this);
    }

    public void goToCertificatesPage(){
        mainPage.servicesGiftSertificatLink.click();
    }

    public void howToBuyLinkClick(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        giftSertificatesPage.scretchGiftSertificatLink = wait.until(ExpectedConditions.elementToBeClickable(giftSertificatesPage.scretchGiftSertificatLink));
        giftSertificatesPage.scretchGiftSertificatLink.click();
    }
}
