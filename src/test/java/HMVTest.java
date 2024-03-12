import PageObjects.HighlightsConfig_qaPage;
import PageObjects.LoginPage;
import Steps.HighlightsConfig_qaPageSteps;
import io.github.bonigarcia.wdm.WebDriverManager;



import org.junit.jupiter.api.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HMVTest {
    public static LoginPage loginPage;
    public static HighlightsConfig_qaPage highlights;
    public static HighlightsConfig_qaPageSteps steps;
    public static WebDriver driver = new ChromeDriver();
    private static final Logger logger = LoggerFactory.getLogger(HMVTest.class);
    @BeforeAll
    public static void presteps() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        loginPage = new LoginPage(driver);
        highlights = new HighlightsConfig_qaPage(driver);
        steps = new HighlightsConfig_qaPageSteps(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        HighlightsConfig_qaPageSteps.logInStep();
    }

   @AfterAll
    public static void destroy() {
        driver.quit();
    }

    @DisplayName("Adding and Delete Archery Sports")
    @Test
    @Order(1)
    public void addSportTest() throws InterruptedException {
        HighlightsConfig_qaPageSteps.selectLanguage();
        HighlightsConfig_qaPageSteps.addSportStep();
        HighlightsConfig_qaPageSteps.saveConfigStep();
        HighlightsConfig_qaPageSteps.checkSportStep();
        HighlightsConfig_qaPageSteps.deleteAddSportStep();
     }

    @DisplayName("Adding football events and verifying the operation of tags")
    @Test
    @Order(2)
    public void addEventTest() throws InterruptedException {
        HighlightsConfig_qaPageSteps.filterByDate();
        HighlightsConfig_qaPageSteps.searchEventStep();
        HighlightsConfig_qaPageSteps.addTwoEventStep();
        HighlightsConfig_qaPageSteps.addIsPromoTagStep();
        HighlightsConfig_qaPageSteps.addIsSafeTagStep();

    }


    @DisplayName("Adding and Delete Custom Language")
    @Test
    @Order(3)
    public void addLanguageCustom() throws InterruptedException {
        HighlightsConfig_qaPageSteps.openListLanguageCustomStep();
        HighlightsConfig_qaPageSteps.selectLanguageCustomStep();
        HighlightsConfig_qaPageSteps.saveLanguageCustom();
    }


    @DisplayName("Checking for copying events from the Default Language")
    @Test
    @Order(5)
    public void copyEvent() throws InterruptedException {
        HighlightsConfig_qaPageSteps.selectLanguageDefaultStep();
        HighlightsConfig_qaPageSteps.copyEventFromDefaultStep();
        HighlightsConfig_qaPageSteps.checkTextEventStep();
        HighlightsConfig_qaPageSteps.deleteEventStep();
        HighlightsConfig_qaPageSteps.saveLanguageCustom();

    }
    @DisplayName("Delete Custom Language")
    @Test
    @Order(4)
    public void deleteLanguageCustom() throws InterruptedException {
        HighlightsConfig_qaPageSteps.deleteLanguageCustomStep();
        HighlightsConfig_qaPageSteps.selectLanguageCustomDeleteStep();
        HighlightsConfig_qaPageSteps.saveDeleteLanguageCustomStep();
    }
}
