import PageObjects.HighlightsConfig_qaPage;
import PageObjects.LoginPage;
import Steps.HighlightsConfig_qaPageSteps;
import Utilit.ConfProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HMVTest {


    public static LoginPage loginPage;
    public static HighlightsConfig_qaPage highlights;
    public static HighlightsConfig_qaPageSteps steps;
    public static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void presteps() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        loginPage = new LoginPage(driver);
        highlights = new HighlightsConfig_qaPage(driver);
        steps = new HighlightsConfig_qaPageSteps(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

   @AfterAll
    public static void destroy() {
        driver.quit();
    }
    @DisplayName("Auth Test")
    @Test
    @Order(1)
    public  void logInTest() throws InterruptedException {
        driver.get(ConfProperties.getProperty("loginpage"));
        Thread.sleep(1000l);
        LoginPage.clickCookiesBtn();
        LoginPage.inputLogin(ConfProperties.getProperty("login"));
        LoginPage.inputPasswd(ConfProperties.getProperty("password"));
        LoginPage.clickLoginBtn();
    }
    @DisplayName("Adding and Delete Archery Sports Test")
    @Test
    @Order(2)
    public void addSportTest() throws InterruptedException {
        HighlightsConfig_qaPageSteps.selectLanguage();
        HighlightsConfig_qaPageSteps.addSportStep();
        HighlightsConfig_qaPageSteps.saveConfigStep();
        HighlightsConfig_qaPageSteps.checkSportStep();
        HighlightsConfig_qaPageSteps.deleteAddSportStep();
     }

    @DisplayName("Adding football events and verifying the operation of tags Test")
    @Test
    @Order(3)
    public void addEventTest() throws InterruptedException {
        HighlightsConfig_qaPageSteps.filterByDate();
        HighlightsConfig_qaPageSteps.searchEventStep();
        HighlightsConfig_qaPageSteps.addTwoEventStep();
        HighlightsConfig_qaPageSteps.addIsPromoTagStep();
        HighlightsConfig_qaPageSteps.addIsSafeTagStep();
        HighlightsConfig_qaPageSteps.saveConfigStep();

    }


    @DisplayName("Adding and Delete Custom Language Test")
    @Test
    @Order(4)
    public void addLanguageCustom() throws InterruptedException {
        HighlightsConfig_qaPageSteps.deleteEventStep();
        HighlightsConfig_qaPageSteps.openListLanguageCustomStep();
        HighlightsConfig_qaPageSteps.selectLanguageCustomStep();
        HighlightsConfig_qaPageSteps.saveLanguageCustom();
    }


    @DisplayName("Checking for copying events from the Default Language Test")
    @Test
    @Order(6)
    public void copyEvent() throws InterruptedException {
        HighlightsConfig_qaPageSteps.selectLanguageDefaultStep();
        HighlightsConfig_qaPageSteps.copyEventFromDefaultStep();
        HighlightsConfig_qaPageSteps.checkTextEventStep();
        HighlightsConfig_qaPageSteps.deleteEventStep();
        HighlightsConfig_qaPageSteps.saveConfigStep();

    }
    @DisplayName("Delete Custom Language Test")
    @Test
    @Order(5)
    public void deleteLanguageCustom() throws InterruptedException {
        HighlightsConfig_qaPageSteps.deleteLanguageCustomStep();
        HighlightsConfig_qaPageSteps.selectLanguageCustomDeleteStep();
        HighlightsConfig_qaPageSteps.saveDeleteLanguageCustomStep();
    }
}
