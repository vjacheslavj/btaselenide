package BTA.pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class MainPage {
    private final SelenideElement COOCKIE_ACCEPT_BTN = $x(".//div[@class = 'container']/div[2]/button[2]");
    private final SelenideElement CELOJUMI_BTN = $x(".//div[@class = 'list']/a[2]/h4");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    public void lookingForAcceptCoockieBtn() {
        LOGGER.info("Looking for Coockie accept button to click on it");

        COOCKIE_ACCEPT_BTN.click();
    }

    public void lookingForCelojumiBtn() {
        LOGGER.info("Looking for Celojumi button to click on it");

       CELOJUMI_BTN.click();
    }
}