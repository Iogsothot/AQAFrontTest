import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class HighlightsConfig_qaPageSteps {

    HighlightsConfig_qaPage highlightsConfigQaPage = new HighlightsConfig_qaPage(HMVTest.driver);



    @Step
    public static void logInStep() throws InterruptedException {
    HMVTest.driver.get(ConfProperties.getProperty("loginpage"));
    Thread.sleep(1000l);
    LoginPage.clickCookiesBtn();
    LoginPage.inputLogin(ConfProperties.getProperty("login"));
    LoginPage.inputPasswd(ConfProperties.getProperty("password"));
    LoginPage.clickLoginBtn();
    }
    @Step
    public static void addSportStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickSelectLanguage();
        HighlightsConfig_qaPage.clickAddSportButton();
        HighlightsConfig_qaPage.clickSelectSportButton();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickApplySportAdd();
        HighlightsConfig_qaPage.clickSaveConfig();
        Thread.sleep(10000L);
        String sport = HighlightsConfig_qaPage.assertTextWhatAddSport();
        Assertions.assertEquals("Archery", sport);
    }
    @Step
    public static void deleteAddSportStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickDisableFourSport();
        HighlightsConfig_qaPage.clickDeleteDisableFourSport();
        Thread.sleep(10000L);
        HighlightsConfig_qaPage.clickSaveConfig();
    }

    @Step
    public static void searchEventStep() throws InterruptedException {
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickToDate();
        HighlightsConfig_qaPage.inputToDate(ConfProperties.getProperty("to"));
        HighlightsConfig_qaPage.clickFromDate();
        HighlightsConfig_qaPage.inputFromDate(ConfProperties.getProperty("from"));
        HighlightsConfig_qaPage.inputEvent(ConfProperties.getProperty("team"));
        HighlightsConfig_qaPage.clickSearchEventButton();
    }
    @Step
    public static void addEventStep() throws InterruptedException {
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickAddEvent();
        HighlightsConfig_qaPage.clickAddEvent();
    }
    @Step
    public static void checkTagEventStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickAddIsPromo1();
        HighlightsConfig_qaPage.clickAddIsPromo2();
        HighlightsConfig_qaPage.clickSaveConfig();
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickDeleatIsPromo2();
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickAddIsSafe2();
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickSaveConfig();
    }
    @Step
    public static void addCustomLanguageStep() throws InterruptedException {
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickEditeLanguageCustom();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickOpenListLanguageCustom();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickSelectLanguageCustom1();
        HighlightsConfig_qaPage.clickSelectLanguageCustom2();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickAddLanguageCustom();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickSaveLanguageCustom();
    }
    @Step
    public static void deleteCustomLanguageStep() throws InterruptedException {
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickEditeLanguageCustom();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickDeleteLanguageCustom();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickSelectLanguageCustomDelete1();
        HighlightsConfig_qaPage.clickSelectLanguageCustomDelete2();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickDeleteButtonLanguageCustom();
        HighlightsConfig_qaPage.clickSaveLanguageCustom();
    }
    @Step
    public static void deleteEventStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickDeleteEvent();
        HighlightsConfig_qaPage.clickDeleteEvent();
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickSaveConfig();
    }
}
