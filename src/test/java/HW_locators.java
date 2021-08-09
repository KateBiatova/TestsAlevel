import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HW_locators {

    @Test
    public void Buy_promotional_goods() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        driver.get("https://rozetka.com.ua/");

        Actions action = new Actions(driver);

        WebElement promotionalGoods = driver.findElement(By.xpath("//goods-section/ul/li/app-tile/div/div/a"));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        action.moveToElement(promotionalGoods).click().build().perform();

        action.moveByOffset(140, 140).release().perform();

        WebElement buyButton = driver.findElement(By.xpath("//app-product-buy-btn/app-buy-button/button"));
        action.moveToElement(buyButton).build().perform();
        buyButton.click();

        WebElement checkoutButton = driver.findElement(By.xpath("//a[contains(text(),'Оформить заказ')]"));
        action.moveToElement(checkoutButton).click().build().perform();

        driver.close();
    }

    @Test
    public void Switch_language() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rozetka.com.ua/");

        Actions action = new Actions(driver);

        WebElement uaLanguage = driver.findElement(By.xpath("//a[contains(text(), 'UA')] "));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MICROSECONDS);
        action.moveToElement(uaLanguage).click().build().perform();

        driver.close();
    }

    @Test
    public void Find_the_goods() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rozetka.com.ua/");

        Actions action = new Actions(driver);

        WebElement searchField = driver.findElement(By.cssSelector("[placeholder='Я ищу...']"));
        action.moveToElement(searchField).click().sendKeys("Платье");

        WebElement findButton = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'Найти')]")));
        action.moveToElement(findButton).click().build().perform();

        driver.close();
    }

    @Test
    public void Help_to_buy_gift_sertificat() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rozetka.com.ua/");

        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement servicesGiftSertificatLink = driver.findElement(By.xpath("//a[contains(text(),' Подарочные сертификаты ')]"));
        action.moveToElement(servicesGiftSertificatLink).click().build().perform();

        WebElement scretchGiftSertificatLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath
                ("//div[contains(text(),'Подарочный скретч-сертификат')]/../div[3]/a[contains(text(),'Как приобрести')][1]")));
        action.moveToElement(scretchGiftSertificatLink).click().build().perform();
        driver.close();
    }

    @Test
    public void Go_to_help_desk() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Actions action = new Actions(driver);

        driver.get("https://rozetka.com.ua/");

        WebElement contactsLink = driver.findElement(By.xpath("//a[contains(text(),' Контакты ')]"));
        action.moveToElement(contactsLink).click().build().perform();

        WebElement goButton = driver.findElement(By.xpath("//a[contains(text(),' Перейти ')]"));
        action.moveToElement(goButton).click().build().perform();

        driver.close();
    }

    @Test
    public void To_buy_tire() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Actions action = new Actions(driver);

        driver.get("https://rozetka.com.ua/");
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement toolsAndAutoGoods = driver.findElement(By.xpath("//sidebar-fat-menu/div/ul/li[6]/a"));
        wait.until(ExpectedConditions.visibilityOf(toolsAndAutoGoods));

        action.moveToElement(toolsAndAutoGoods);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        action.click().build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement tiresAndWheels = driver.findElement(By.xpath("//a[contains(text(),'Автошины и диски')]"));
        action.moveToElement(tiresAndWheels).click().build().perform();

        WebElement tire = driver.findElement(By.xpath("//rz-grid/ul/li[1]/app-goods-tile-default/div/div[2]/a"));
        action.moveToElement(tire).click().build().perform();

        driver.close();
    }

    @Test
    public void Enter_name_CapsLock() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rozetka.com.ua/");

        Actions action = new Actions(driver);

        WebElement searchField = driver.findElement(By.cssSelector("[placeholder='Я ищу...']"));
        action.moveToElement(searchField).click().build().perform();
        action.keyDown(Keys.SHIFT).sendKeys("палатка").keyUp(Keys.SHIFT).build().perform();

        driver.close();
    }
}
