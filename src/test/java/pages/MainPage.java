package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends TestBase {

    @FindBy(xpath = "//goods-section/ul/li/app-tile/div/div/a")
    WebElement promotionalGoods;

    @FindBy(xpath = "//a[contains(text(), 'UA')]")
    WebElement uaLanguage;

    @FindBy(css = "[placeholder='Я ищу...']")
    WebElement searchField;

    @FindBy(xpath = "//a[contains(text(),' Подарочные сертификаты ')]")
    WebElement servicesGiftSertificatLink;

    @FindBy(xpath = "//sidebar-fat-menu/div/ul/li[6]/a")
    WebElement toolsAndAutoGoods;

    @FindBy(xpath = "//button[contains(text(),'Найти')]")
    WebElement findButton;

    public MainPage () {
        PageFactory.initElements(driver, this);
    }

    public void switchLanguageToUa(){
        mainPage.uaLanguage.isDisplayed();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MICROSECONDS);
        mainPage.uaLanguage.click();
    }

    public void findGoodsWithSearchField(String searchWorld){
        mainPage.searchField.sendKeys(searchWorld);
        mainPage.findButton.click();
    }

    public void goToToolsAndAutoGoodsPage(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        mainPage.toolsAndAutoGoods = wait.until(ExpectedConditions.visibilityOf(mainPage.toolsAndAutoGoods));
        mainPage.toolsAndAutoGoods.click();
    }

    public void goToTiresAndWheelsPage() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        toolsAndAutoGoodsPage.tiresAndWheels.click();
    }

    public void openFirstTireOnPage(){
        tiresPage.firstTire.click();
    }

    public void openFirstPromotionalGoods(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        mainPage.promotionalGoods.isDisplayed();
        mainPage.promotionalGoods.click();
    }
}
