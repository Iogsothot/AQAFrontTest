import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighlightsConfig_qaPageSteps {

    HighlightsConfig_qaPage highlightsConfigQaPage = new HighlightsConfig_qaPage(HMVTest.driver);



    @Step("Вход в аккаунт")
    public static void logInStep() throws InterruptedException {
    HMVTest.driver.get(ConfProperties.getProperty("loginpage"));
    Thread.sleep(1000l);
    LoginPage.clickCookiesBtn();
    LoginPage.inputLogin(ConfProperties.getProperty("login"));
    LoginPage.inputPasswd(ConfProperties.getProperty("password"));
    LoginPage.clickLoginBtn();
    }
    @Step("Добавление спорта и проверка на соответствие")
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
    @Step("Удаление спорта")
    public static void deleteAddSportStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickDisableFourSport();
        HighlightsConfig_qaPage.clickDeleteDisableFourSport();
        Thread.sleep(10000L);
        HighlightsConfig_qaPage.clickSaveConfig();
    }

    @Step("Увелечение филбтра по дате и поиск по футбольной каманде")
    public static void searchEventStep() throws InterruptedException {
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickToDate();
        HighlightsConfig_qaPage.inputToDate(ConfProperties.getProperty("to"));
        HighlightsConfig_qaPage.clickFromDate();
        HighlightsConfig_qaPage.inputFromDate(ConfProperties.getProperty("from"));
        HighlightsConfig_qaPage.inputEvent(ConfProperties.getProperty("team"));
        HighlightsConfig_qaPage.clickSearchEventButton();
    }
    @Step("Добавление ивентов")
    public static void addEventStep() throws InterruptedException {
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickAddEvent();
        HighlightsConfig_qaPage.clickAddEvent();
    }
    @Step("Добавление тэгов в ивенты ивентов")
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
    @Step("Добавление Custom Language")
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
    @Step("Удаление Custom Language")
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
    @Step("Удаление ивентов")
    public static void deleteEventStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickDeleteEvent();
        HighlightsConfig_qaPage.clickDeleteEvent();
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickSaveConfig();
    }

    @Step("Копирование ивентов")
    public static void copyEventStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickSelectLanguageDefault();
        int eventNumber1 = HighlightsConfig_qaPage.checkEventList();
        HighlightsConfig_qaPage.clickSelectLanguage();
        HighlightsConfig_qaPage.clickCopyEventFromDefault();
        int eventNumber2 = HighlightsConfig_qaPage.checkEventList();
        assertEquals(eventNumber1 ,eventNumber2);
        String checkTextEvent = HMVTest.highlights.checkTextEvent();
        assertEquals("Soccer", checkTextEvent);

    }
}
