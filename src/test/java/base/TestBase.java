package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties properties;
    protected static MainPage mainPage;
    protected static BusketPopup busketPopup;
    protected static GiftSertificatesPage giftSertificatesPage;
    protected static TiresPage tiresPage;
    protected static ToolsAndAutoGoodsPage toolsAndAutoGoodsPage;
    protected static WashingPowderTide washingPowderTide;

    public void initialization() {
        try {
            properties = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/test/config/config.properties");
            properties.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.setProperty("webdriver.chrome.driver", properties.getProperty("driverPath_chrome"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rozetka.com.ua/");
    }

    public void initObjects(){
        mainPage = new MainPage();
        busketPopup = new BusketPopup();
        giftSertificatesPage = new GiftSertificatesPage();
        tiresPage = new TiresPage();
        toolsAndAutoGoodsPage = new ToolsAndAutoGoodsPage();
        washingPowderTide = new WashingPowderTide();
    }
}
