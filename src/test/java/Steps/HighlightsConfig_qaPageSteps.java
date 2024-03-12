package Steps;

import PageObjects.HighlightsConfig_qaPage;
import PageObjects.LoginPage;
import Utilit.ConfProperties;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighlightsConfig_qaPageSteps {

    public static WebDriver driver;

    public HighlightsConfig_qaPageSteps(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



    @Step("Log in to account")
    public static void logInStep() throws InterruptedException {
    driver.get(ConfProperties.getProperty("loginpage"));
    Thread.sleep(1000l);
    LoginPage.clickCookiesBtn();
    LoginPage.inputLogin(ConfProperties.getProperty("login"));
    LoginPage.inputPasswd(ConfProperties.getProperty("password"));
    LoginPage.clickLoginBtn();
    }
    @Step("Adding sports and checking for compliance")
    public static void selectLanguage() throws InterruptedException {
        HighlightsConfig_qaPage.clickSelectLanguage();
    }
    @Step
    public static void addSportStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickAddSportButton();
        HighlightsConfig_qaPage.clickSelectSportButton();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickApplySportAdd();
    }
    @Step
    public static void saveConfigStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickSaveConfig();
        Thread.sleep(10000L);
    }
    @Step
    public static void checkSportStep() throws InterruptedException {
        String sport = HighlightsConfig_qaPage.assertTextWhatAddSport();
        Assertions.assertEquals((ConfProperties.getProperty("addsport")) , sport);
    }



    @Step("Delete sport")
    public static void deleteAddSportStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickDisableFourSport();
        HighlightsConfig_qaPage.clickDeleteDisableFourSport();
    }

    @Step("Increasing the filter by date and searching by football team")
    public static void filterByDate() throws InterruptedException {
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickToDate();
        HighlightsConfig_qaPage.inputToDate(ConfProperties.getProperty("to"));
        HighlightsConfig_qaPage.clickFromDate();
        HighlightsConfig_qaPage.inputFromDate(ConfProperties.getProperty("from"));
    }
    @Step("Increasing the filter by date and searching by football team")
    public static void searchEventStep() throws InterruptedException {
        HighlightsConfig_qaPage.inputEvent(ConfProperties.getProperty("team"));
        HighlightsConfig_qaPage.clickSearchEventButton();
    }
    @Step("Add event")
    public static void addTwoEventStep() throws InterruptedException {
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickAddEvent();
        HighlightsConfig_qaPage.clickAddEvent();
    }
    @Step("Adding tags to event")
    public static void addIsPromoTagStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickAddIsPromo1();
        HighlightsConfig_qaPage.clickAddIsPromo2();

        HighlightsConfig_qaPage.clickDeleatIsPromo2();
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickAddIsSafe2();
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickSaveConfig();
    }
    @Step("Adding tags to event")
    public static void addIsSafeTagStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickDeleatIsPromo2();
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickAddIsSafe2();
    }

    @Step("Add Custom Language")
    public static void openListLanguageCustomStep() throws InterruptedException {
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickEditeLanguageCustom();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickOpenListLanguageCustom();
    }
    @Step("Add Custom Language")
    public static void selectLanguageCustomStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickSelectLanguageCustom1();
        HighlightsConfig_qaPage.clickSelectLanguageCustom2();
    }
    @Step("Add Custom Language")
    public static void saveLanguageCustom() throws InterruptedException {
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickAddLanguageCustom();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickSaveLanguageCustom();
    }


    @Step("Delete Custom Language")
    public static void deleteLanguageCustomStep() throws InterruptedException {
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickEditeLanguageCustom();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickDeleteLanguageCustom();
    }
    @Step("Delete Custom Language")
    public static void selectLanguageCustomDeleteStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickSelectLanguageCustomDelete1();
        HighlightsConfig_qaPage.clickSelectLanguageCustomDelete2();
    }
    @Step("Delete Custom Language")
    public static void saveDeleteLanguageCustomStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickDeleteButtonLanguageCustom();
        HighlightsConfig_qaPage.clickSaveLanguageCustom();
    }
    @Step("Delete events")
    public static void deleteEventStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickDeleteEvent();
        HighlightsConfig_qaPage.clickDeleteEvent();
    }

    @Step("Copy events")
    public static void selectLanguageDefaultStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickSelectLanguageDefault();
    }

    @Step("Copy events")
    public static void copyEventFromDefaultStep() throws InterruptedException {
        int eventNumber1 = HighlightsConfig_qaPage.checkEventList();
        HighlightsConfig_qaPage.clickSelectLanguage();
        HighlightsConfig_qaPage.clickCopyEventFromDefault();
        int eventNumber2 = HighlightsConfig_qaPage.checkEventList();
        assertEquals(eventNumber1 ,eventNumber2);
    }  @Step("Copy events")
    public static void checkTextEventStep() throws InterruptedException {

        String checkTextEvent = HighlightsConfig_qaPage.checkTextEvent();
        assertEquals((ConfProperties.getProperty("addsport")) , checkTextEvent);
    }
}
