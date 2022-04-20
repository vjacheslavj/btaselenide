package BTA.pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class TestBta {

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    @Test
    public void btaTest() {
        LOGGER.info("This test is doing some actions with Travel insurance and do some checks");

        open("https://www.bta.lv");

        MainPage mainPage = new MainPage();
        mainPage.lookingForAcceptCoockieBtn();
        mainPage.lookingForCelojumiBtn();

        CelojumuPage celojumuPage = new CelojumuPage();
        celojumuPage.scrollDownCelojumaPage();
        celojumuPage.lookingForCelojumaGalamerkisField();
        celojumuPage.lookingForIzvelValstiBtnPopupWindow();
        celojumuPage.clickEnterText();
        celojumuPage.clickOnIndija();
    }
}
