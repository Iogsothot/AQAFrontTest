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
        HighlightsConfig_qaPageSteps.logInStep();
    }

    @AfterAll
    public static void destroy() {
        driver.quit();
    }


     @Test
    public void addSportTest() throws InterruptedException {
        HighlightsConfig_qaPageSteps.addSportStep();
         HighlightsConfig_qaPageSteps.deleteAddSportStep();
     }

    @Test
    public void addEventTest() throws InterruptedException {
        HighlightsConfig_qaPageSteps.searchEventStep();
        HighlightsConfig_qaPageSteps.addEventStep();
        HighlightsConfig_qaPageSteps.checkTagEventStep();
    }


    @Test
    public void deleteEventTest() throws InterruptedException {
        HighlightsConfig_qaPageSteps.deleteEventStep();
    }

    @Test
    public void addLanguageCustom() throws InterruptedException {
        HighlightsConfig_qaPageSteps.addCustomLanguageStep();
        HighlightsConfig_qaPageSteps.deleteCustomLanguageStep();
    }

}
