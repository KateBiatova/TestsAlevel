package tests;

import base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSelenium extends TestBase {
    @BeforeMethod
    public void setUp(){
        initialization();
        initObjects();
    }

    @Test
    public void Buy_promotional_goods() {
        mainPage.openFirstPromotionalGoods();
        washingPowderTide.moveFocusOnPage();
        washingPowderTide.buyWashingPowder();
        busketPopup.checkout();
    }

    @Test
    public void Switch_language() {
        mainPage.switchLanguageToUa();
    }

    @Test
    public void Find_the_goods() {
        mainPage.findGoodsWithSearchField("Платье");
    }

    @Test
    public void Help_to_buy_gift_sertificat() {
        giftSertificatesPage.goToCertificatesPage();
        giftSertificatesPage.howToBuyLinkClick();
    }

    @Test
    public void To_buy_tire() {
        mainPage.goToToolsAndAutoGoodsPage();
        mainPage.goToTiresAndWheelsPage();
        mainPage.openFirstTireOnPage();
    }

    @AfterMethod
    public void quite(){
        driver.close();
    }
}
