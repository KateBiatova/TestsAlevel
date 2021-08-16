package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestSelenium {

    @Test
    public void Buy_promotional_goods() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        MainPage mainPage = new MainPage(driver);
        WashingPowderTide washingPowderTide = new WashingPowderTide(driver);
        BusketPopup busketPopup = new BusketPopup(driver);

        driver.get("https://rozetka.com.ua/");
        Actions action = new Actions(driver);

        mainPage.promotionalGoods.isDisplayed();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        mainPage.promotionalGoods.click();

        action.moveByOffset(140, 140).release().perform();

        washingPowderTide.buyButton.click();
        busketPopup.checkoutButton.click();

        driver.close();
    }

    @Test
    public void Switch_language() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        MainPage mainPage = new MainPage(driver);

        driver.get("https://rozetka.com.ua/");

        mainPage.uaLanguage.isDisplayed();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MICROSECONDS);
        mainPage.uaLanguage.click();

        driver.close();
    }

    @Test
    public void Find_the_goods() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        MainPage mainPage = new MainPage(driver);

        driver.get("https://rozetka.com.ua/");

        mainPage.searchField.sendKeys("Платье");
        mainPage.findButton.click();

        driver.close();
    }

    @Test
    public void Help_to_buy_gift_sertificat() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        MainPage mainPage = new MainPage(driver);
        GiftSertificatesPage giftSertificatesPage = new GiftSertificatesPage(driver);

        driver.get("https://rozetka.com.ua/");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        mainPage.servicesGiftSertificatLink.click();

        giftSertificatesPage.scretchGiftSertificatLink = wait.until(ExpectedConditions.elementToBeClickable(giftSertificatesPage.scretchGiftSertificatLink));
        giftSertificatesPage.scretchGiftSertificatLink.click();

        driver.close();
    }

    @Test
    public void To_buy_tire() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        MainPage mainPage = new MainPage(driver);
        ToolsAndAutoGoodsPage toolsAndAutoGoodsPage = new ToolsAndAutoGoodsPage(driver);
        TiresPage tiresPage = new TiresPage(driver);

        driver.get("https://rozetka.com.ua/");
        WebDriverWait wait = new WebDriverWait(driver, 10);

        mainPage.toolsAndAutoGoods = wait.until(ExpectedConditions.visibilityOf(mainPage.toolsAndAutoGoods));
        mainPage.toolsAndAutoGoods.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        toolsAndAutoGoodsPage.tiresAndWheels.click();
        tiresPage.firstTire.click();

        driver.close();
    }
}
