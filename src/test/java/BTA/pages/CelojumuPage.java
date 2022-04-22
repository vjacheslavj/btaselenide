package BTA.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class CelojumuPage {
    private final SelenideElement CELOJUMA_GALAMERKIS_FIELD = $x(".//button[@id = 'regionalSelectorRegion-open']/span[2]");
    private final SelenideElement IZVELIES_VALSTI_BTN = $("#regionalSelectorCountry");
    private final SelenideElement PIEVIENOT_VALSTI_BTN = $x(".//span[@class = 'text add-text']");
    private final SelenideElement SEARCH_FIELD = $x(".//div[@class = 'field']/div[1]/input");
    private final SelenideElement INDIJA = $x(".//button[@data-value = 'Indija']");
    private final SelenideElement PIELIETOT_BTN = $("#regionalSelectorCountry-applyButton");
    private final SelenideElement AKTIVITATES_FIELD = $("#travelActivities-open");
    private final SelenideElement SPORTS_PAGE = $("#travelActivities-popup-select-option-3");
    private final SelenideElement SANEMT_PIEDAVAJUMU_BTN = $x(".//button[@data-button = 'submit']");
    private final SelenideElement SELECTED_COUNTRY = $x(".//div[@class = 'selected-countries']/button[1]");
    private final SelenideElement SELECTED_AKTIVITATE = $("#travelActivities-open");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());


    public void scrollDownCelojumaPage() {
        LOGGER.info("Scrolling down the page");

        executeJavaScript("window.scrollBy(0, 400)");
        sleep(3000);
    }

    public void lookingForIzvelValstiBtnPopupWindow() {
        LOGGER.info("Looking for Izvelietis valsti button to click on it");

        IZVELIES_VALSTI_BTN.click();

    }

    public void lookingForCelojumaGalamerkisField() {
        LOGGER.info("Looking for Celojuma Galamerkis field to click on it");

        CELOJUMA_GALAMERKIS_FIELD.click();
    }


    public void clickEnterText() {
        LOGGER.info("Typing Indija and clicking on the found");

        PIEVIENOT_VALSTI_BTN.click();
        SEARCH_FIELD.setValue("Indija");
    }

    public void clickOnIndija() {
        LOGGER.info("Looking for the found country and clicking on it");

        INDIJA.click();
    }

    public void clickOnPielietotBtn() {
        LOGGER.info("Looking for the Pielietot button to click on it");

        PIELIETOT_BTN.click();
    }

    public void lookingForAktivitatesField() {
        LOGGER.info("Looking for Aktivitates field to click on it");

        AKTIVITATES_FIELD.click();
    }

    public void lookingForSportsBtn() {
        LOGGER.info("Looking for Aktivitates field to click on it");

        SPORTS_PAGE.click();
    }

    public void loogingForSanemtPiedavajumuBtn() {
        LOGGER.info("Looking for Sanemt Piedavajumu button to click on it");

        SANEMT_PIEDAVAJUMU_BTN.click();
    }

    public String getSelectedCountryText() {
        LOGGER.info("Looking for the Selected Country");

        return SELECTED_COUNTRY.getText();
    }

    public String getSelectedAktivitateText() {
        LOGGER.info("Looking for the Selected Aktivitate");

        return SELECTED_AKTIVITATE.getText();
    }
}



