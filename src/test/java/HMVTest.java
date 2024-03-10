import io.github.bonigarcia.wdm.WebDriverManager;



import org.junit.jupiter.api.*;

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

    @DisplayName("Добавление и удаление спорта Archery")
    @Test
    public void addSportTest() throws InterruptedException {

        HighlightsConfig_qaPageSteps.addSportStep();
         HighlightsConfig_qaPageSteps.deleteAddSportStep();
     }

    @DisplayName("Добавление ивентов по футболу и прооверка работы тэгов")
    @Test
    public void addEventTest() throws InterruptedException {
        HighlightsConfig_qaPageSteps.searchEventStep();
        HighlightsConfig_qaPageSteps.addEventStep();
        HighlightsConfig_qaPageSteps.checkTagEventStep();
    }

    @DisplayName("Удаление ивентов")
    @Test
    public void deleteEventTest() throws InterruptedException {
        HighlightsConfig_qaPageSteps.deleteEventStep();

    }

    @DisplayName("Добавление и удаление Custom Language")
    @Test
    public void addLanguageCustom() throws InterruptedException {

        HighlightsConfig_qaPageSteps.addCustomLanguageStep();
        HighlightsConfig_qaPageSteps.deleteCustomLanguageStep();
    }

    @DisplayName("Проверка копирования ивентов из Default Language")
    @Test
    public void copyEvent() throws InterruptedException {
        HighlightsConfig_qaPageSteps.copyEventStep();

    }

}
