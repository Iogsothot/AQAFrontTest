import io.github.bonigarcia.wdm.WebDriverManager;


import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HMVTest {
    public static LoginPage loginPage;
    public static HighlightsConfig_qaPage highlights;
    public static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void main() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        loginPage = new LoginPage(driver);
        highlights = new HighlightsConfig_qaPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.get(ConfProperties.getProperty("loginpage"));
        HighlightsConfig_qaPageSteps.logInStep();
    }

    @AfterAll
    public static void destroy() {
        driver.quit();
    }

   // @Test
    public void loginTest() throws InterruptedException {
        Thread.sleep(1000l);
        LoginPage.clickCookiesBtn();
        LoginPage.inputLogin(ConfProperties.getProperty("login"));
        LoginPage.inputPasswd(ConfProperties.getProperty("password"));
        LoginPage.clickLoginBtn();
    }

   // @Test
    public void addSportTest1() throws InterruptedException {
        HighlightsConfig_qaPage.clickSelectLanguage();
        HighlightsConfig_qaPage.clickAddSportButton();
        HighlightsConfig_qaPage.clickSelectSportButton();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickApplySportAdd();
        HighlightsConfig_qaPage.clickSaveConfig();
        Thread.sleep(10000L);
        String sport = highlights.assertTextWhatAddSport();
        Assertions.assertEquals("Archery", sport);
        HighlightsConfig_qaPage.clickDisableFourSport();
        HighlightsConfig_qaPage.clickDeleteDisableFourSport();
        Thread.sleep(10000L);
        HighlightsConfig_qaPage.clickSaveConfig();
    }
     @Test
    public void addSportTest() throws InterruptedException {
        HighlightsConfig_qaPageSteps.addSportStep();
         HighlightsConfig_qaPageSteps.deleteAddSportStep();
     }
    //@Test
    public void addEventTest1() throws InterruptedException {
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickToDate();
        HighlightsConfig_qaPage.inputToDate(ConfProperties.getProperty("to"));
        HighlightsConfig_qaPage.clickFromDate();
        HighlightsConfig_qaPage.inputFromDate(ConfProperties.getProperty("from"));
        HighlightsConfig_qaPage.inputEvent(ConfProperties.getProperty("team"));
        HighlightsConfig_qaPage.clickSearchEventButton();
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickAddEvent();
        HighlightsConfig_qaPage.clickAddEvent();
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
    @Test
    public void addEventTest() throws InterruptedException {
        HighlightsConfig_qaPageSteps.searchEventStep();
        HighlightsConfig_qaPageSteps.addEventStep();
        HighlightsConfig_qaPageSteps.checkTagEventStep();
    }

    //@Test
    public void deleteEventTest1() throws InterruptedException {
        HighlightsConfig_qaPage.clickDeleteEvent();
        HighlightsConfig_qaPage.clickDeleteEvent();
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickSaveConfig();
    }
    @Test
    public void deleteEventTest() throws InterruptedException {
        HighlightsConfig_qaPageSteps.deleteEventStep();
    }
    //@Test
    public void addLanguageCustom1() throws InterruptedException {
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
    @Test
    public void addLanguageCustom() throws InterruptedException {
        HighlightsConfig_qaPageSteps.addCustomLanguageStep();
        HighlightsConfig_qaPageSteps.deleteCustomLanguageStep();
    }

}
