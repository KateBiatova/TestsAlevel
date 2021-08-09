package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//goods-section/ul/li/app-tile/div/div/a")
    WebElement promotionalGoods;

    @FindBy(xpath = "//a[contains(text(), 'UA')] ")
    WebElement uaLanguage;

    @FindBy(css = "[placeholder='Я ищу...']")
    WebElement searchField;

    @FindBy(xpath = "//a[contains(text(),' Подарочные сертификаты ')]")
    WebElement servicesGiftSertificatLink;

    @FindBy(xpath = "//a[contains(text(),' Контакты ')]")
    WebElement contactsLink;

    @FindBy(xpath = "//sidebar-fat-menu/div/ul/li[6]/a")
    WebElement toolsAndAutoGoods;

    @FindBy(xpath = "//button[contains(text(),'Найти')]")
    WebElement findButton;



}
