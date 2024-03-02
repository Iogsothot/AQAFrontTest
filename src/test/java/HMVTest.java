import io.github.bonigarcia.wdm.WebDriverManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class HMVTest {
    public static LoginPage loginPage;
    public static HighlightsConfig_qaPage highlights;
    public static WebDriver driver = new ChromeDriver();
    private static final Logger logger = LoggerFactory.getLogger(HMVTest.class);
    @BeforeAll
    public static void main() {
        WebDriverManager.chromedriver().setup();
        loginPage = new LoginPage(driver);
        highlights = new HighlightsConfig_qaPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));
    }

   @AfterAll
    public static void destroy() {
        driver.quit();
    }

    @Test
    public void loginTest() throws InterruptedException {
        Thread.sleep(1000l);
        LoginPage.clickCookiesBtn();
        LoginPage.inputLogin(ConfProperties.getProperty("login"));
        LoginPage.inputPasswd(ConfProperties.getProperty("password"));
        LoginPage.clickLoginBtn();
        logger.info("Авторизация по данным проведена");
    }

    @Test
    public void addSportTest() throws InterruptedException {
        Thread.sleep(1000l);
        int sportNumber = HighlightsConfig_qaPage.checkSportList();
        HighlightsConfig_qaPage.clickSelectLanguage();
        HighlightsConfig_qaPage.clickAddSportButton();
        HighlightsConfig_qaPage.clickSelectSportButton();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickApplySportAdd();
        logger.info("Добавлен спорт Archery");
        HighlightsConfig_qaPage.clickSaveConfig();
        logger.info("Изменения сохранены");
        Thread.sleep(10000L);
        String sport = highlights.assertTextWhatAddSport();
        assertEquals("Archery", sport);
        int sportNumber2 = HighlightsConfig_qaPage.checkSportList();
        assertEquals(sportNumber + 1,sportNumber2);
        HighlightsConfig_qaPage.clickDisableFourSport();
        HighlightsConfig_qaPage.clickDeleteDisableFourSport();
        logger.info("Удален спорт Archery");
        Thread.sleep(10000L);
        HighlightsConfig_qaPage.clickSaveConfig();
        assertEquals(sportNumber ,sportNumber2 - 1);
        logger.info("Изменения сохранены");
    }

    @Test
    public void addEventTest() throws InterruptedException {
        String numberOfSportEvent1 = highlights.checkNumberOfEventInSport();
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickToDate();
        HighlightsConfig_qaPage.inputToDate(ConfProperties.getProperty("to"));
        HighlightsConfig_qaPage.clickFromDate();
        HighlightsConfig_qaPage.inputFromDate(ConfProperties.getProperty("from"));
        logger.info("Изменения даты произведены");
        String numberOfSportEvent2 = highlights.checkNumberOfEventInSport();
        assertNotEquals(numberOfSportEvent1,numberOfSportEvent2);
        logger.info("Количество ивентов пересчитанно");
        HighlightsConfig_qaPage.inputEvent(ConfProperties.getProperty("team"));
        HighlightsConfig_qaPage.clickSearchEventButton();
        logger.info("Выведены ивенты выбранной команды");
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickAddEvent();
        HighlightsConfig_qaPage.clickAddEvent();
        String checkTextEvent = highlights.checkTextEvent();
        assertEquals("Soccer", checkTextEvent);
        int eventNumber1 = HighlightsConfig_qaPage.checkEventList();
        assertEquals(2 ,eventNumber1);
        HighlightsConfig_qaPage.clickAddIsPromo1();
        HighlightsConfig_qaPage.clickAddIsPromo2();
        Thread.sleep(10000L);
        HighlightsConfig_qaPage.clickSaveConfig();
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickDeleatIsPromo2();
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickAddIsSafe2();
        Thread.sleep(10000L);
        HighlightsConfig_qaPage.clickSaveConfig();
        logger.info("Проведены операции с тэгами");
    }
    @Test
    public void deleteEventTest() throws InterruptedException {
        HighlightsConfig_qaPage.clickDeleteEvent();
        HighlightsConfig_qaPage.clickDeleteEvent();
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickSaveConfig();
        int eventNumber1 = HighlightsConfig_qaPage.checkEventList();
        assertEquals(0 ,eventNumber1);
        logger.info("Список ивентов пуст");
    }

    @Test
    public void addLanguageCustom() throws InterruptedException {
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
        String languageAdded = highlights.assertTextWhatAddLanguage();
        assertEquals("ALBANIAN", languageAdded);
        logger.info("Добавлен новые языки");
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickEditeLanguageCustom();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickDeleteLanguageCustom();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickSelectLanguageCustomDelete1();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickDeleteButtonLanguageCustom();
        HighlightsConfig_qaPage.clickSaveLanguageCustom();
        String languageDelete = highlights.assertTextWhatDeleteLanguage();
        assertEquals("ALBANIAN", languageDelete);
        logger.info("Удаленн один из новых язык");
    }

    @Test
    public void copyEvent() {
        HighlightsConfig_qaPage.clickSelectLanguageDefault();
        int eventNumber1 = HighlightsConfig_qaPage.checkEventList();
        HighlightsConfig_qaPage.clickSelectLanguage();
        HighlightsConfig_qaPage.clickCopyEventFromDefault();
        int eventNumber2 = HighlightsConfig_qaPage.checkEventList();
        assertEquals(eventNumber1 ,eventNumber2);
        String checkTextEvent = highlights.checkTextEvent();
        assertEquals("Soccer", checkTextEvent);
        logger.info("Список ивентов азербайджанского  совпадает с дефолтным");
    }

}
