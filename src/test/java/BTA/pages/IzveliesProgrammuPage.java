package BTA.pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class IzveliesProgrammuPage {
    private final SelenideElement OPTIMALA_PLUSS_BTN = $x(".//button[@datatype = 'selectPolicyPlanOPP']");
    private final SelenideElement KAS_IR_APDROS_BTN = $x(".//section[@id = 'form-travel-policy']/section/div[2]/button/span[2]");
    private final SelenideElement POPUP_WINDOW_CLOSE_BTN = $x(".//button[@class = 'popup-close close']");
    private final SelenideElement TURPINAT_BTN = $x(".//footer/div/button");
    private final SelenideElement POPUP_WINDOW = $x(".//aside[@class = 'single-popup covered-travel']/div");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());


    public void scrollDownCelojumaPage() {
        LOGGER.info("Scrolling down the page");

        executeJavaScript("window.scrollBy(0, 2000)");
        sleep(3000);
    }
    public void lookingForOptimalPlussBtn() {
        LOGGER.info("Looking for Optimal pluss button to click on it");

        OPTIMALA_PLUSS_BTN.click();
    }

    public void lookingForKasIrApdrosBtn() {
        LOGGER.info("Looking for Apskati, kas ir aprosinats button to click on it");

        KAS_IR_APDROS_BTN.click();
    }

    public boolean isPopupWindowDisplayed() {
        LOGGER.info("Looking for Popup window that it is displayed");

        return POPUP_WINDOW.isDisplayed();
    }

    public void lookingForCloseBtn() {
        LOGGER.info("Looking for Popup window close button to click on it");

        POPUP_WINDOW_CLOSE_BTN.click();
    }

    public void lookingForTurpinatBtn() {
        LOGGER.info("Looking for Turpinat button to click on it");

        TURPINAT_BTN.click();
    }
}
