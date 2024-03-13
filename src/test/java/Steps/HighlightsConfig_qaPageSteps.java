package Steps;
import PageObjects.HighlightsConfig_qaPage;
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




    @Step("Select 3d Language step")
    public static void selectLanguage()   {
        HighlightsConfig_qaPage.clickSelectLanguage();
    }
    @Step("Add Archery Sport step")
    public static void addSportStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickAddSportButton();
        HighlightsConfig_qaPage.clickSelectSportButton();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickApplySportAdd();
    }
    @Step("Save config step")
    public static void saveConfigStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickSaveConfig();
        Thread.sleep(10000L);
    }
    @Step("Assert sport name step")
    public static void checkSportStep()  {
        String sport = HighlightsConfig_qaPage.assertTextWhatAddSport();
        Assertions.assertEquals((ConfProperties.getProperty("addsport")) , sport,"Sport Name doesn't match");
    }



    @Step("Delete sport step")
    public static void deleteAddSportStep()   {
        HighlightsConfig_qaPage.clickDisableFourSport();
        HighlightsConfig_qaPage.clickDeleteDisableFourSport();
    }

    @Step("Increasing the filter by date step")
    public static void filterByDate() throws InterruptedException {
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickToDate();
        HighlightsConfig_qaPage.inputToDate(ConfProperties.getProperty("to"));
        HighlightsConfig_qaPage.clickFromDate();
        HighlightsConfig_qaPage.inputFromDate(ConfProperties.getProperty("from"));
    }
    @Step("Searching by football team step")
    public static void searchEventStep()  {
        HighlightsConfig_qaPage.inputEvent(ConfProperties.getProperty("team"));
        HighlightsConfig_qaPage.clickSearchEventButton();
    }
    @Step("Add event step")
    public static void addTwoEventStep() throws InterruptedException {
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickAddEvent();
        HighlightsConfig_qaPage.clickAddEvent();
    }
    @Step("Adding Promo tags to event step")
    public static void addIsPromoTagStep()   {
        HighlightsConfig_qaPage.clickAddIsPromo1();
        HighlightsConfig_qaPage.clickAddIsPromo2();
    }
    @Step("Delete Promo tag and add Safe tags to event step")
    public static void addIsSafeTagStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickDeleatIsPromo2();
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickAddIsSafe2();
    }

    @Step("Open Custom Language menu step")
    public static void openListLanguageCustomStep() throws InterruptedException {
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickEditeLanguageCustom();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickOpenListLanguageCustom();
    }
    @Step("Select Custom Language step")
    public static void selectLanguageCustomStep()   {
        HighlightsConfig_qaPage.clickSelectLanguageCustom1();
        HighlightsConfig_qaPage.clickSelectLanguageCustom2();
    }
    @Step("Add and save Custom Language step")
    public static void saveLanguageCustom() throws InterruptedException {
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickAddLanguageCustom();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickSaveLanguageCustom();
    }


    @Step("Open Delete Custom Language menu step")
    public static void deleteLanguageCustomStep() throws InterruptedException {
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickEditeLanguageCustom();
        Thread.sleep(100L);
        HighlightsConfig_qaPage.clickDeleteLanguageCustom();
    }
    @Step("Select Custom Language for delete step")
    public static void selectLanguageCustomDeleteStep()   {
        HighlightsConfig_qaPage.clickSelectLanguageCustomDelete1();
        HighlightsConfig_qaPage.clickSelectLanguageCustomDelete2();
    }
    @Step("Delete and save Custom Language step")
    public static void saveDeleteLanguageCustomStep() throws InterruptedException {
        HighlightsConfig_qaPage.clickDeleteButtonLanguageCustom();
        Thread.sleep(1000L);
        HighlightsConfig_qaPage.clickSaveLanguageCustom();
    }
    @Step("Delete events step")
    public static void deleteEventStep()   {
        HighlightsConfig_qaPage.clickDeleteEvent();
        HighlightsConfig_qaPage.clickDeleteEvent();
    }

    @Step("Select Default Language step")
    public static void selectLanguageDefaultStep()   {
        HighlightsConfig_qaPage.clickSelectLanguageDefault();
    }

    @Step("Copy events to Azer Lang step")
    public static void copyEventFromDefaultStep()   {
        int eventNumber1 = HighlightsConfig_qaPage.checkEventList();
        HighlightsConfig_qaPage.clickSelectLanguage();
        HighlightsConfig_qaPage.clickCopyEventFromDefault();
        int eventNumber2 = HighlightsConfig_qaPage.checkEventList();
        assertEquals(eventNumber1 ,eventNumber2,"The number of events does not match");
    }  @Step("Check Eveny text step")
    public static void checkTextEventStep()   {

        String checkTextEvent = HighlightsConfig_qaPage.checkTextEvent();
        assertEquals((ConfProperties.getProperty("copyevent")) , checkTextEvent,"Sport type does not match");
    }
}
