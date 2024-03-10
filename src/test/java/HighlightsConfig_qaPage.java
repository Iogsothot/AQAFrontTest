import org.apache.commons.io.filefilter.TrueFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HighlightsConfig_qaPage {
    public static WebDriver driver;

    public HighlightsConfig_qaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(
            xpath = "//*[contains(text(), 'Add sport')]/.."
    )
    private static WebElement addSportButton;
    @FindBy(
            xpath = "//*[contains(text(), 'Horse Racing')]/.."
    )
    private static WebElement selectSportButton;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[1]/button"
    )
    private static WebElement saveConfig;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[1]/div[1]/div[2]/div/div/div[3]/button[2]"
    )
    private static WebElement applySportAdd;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div[2]/div/button[3]"
    )
    private static WebElement selectLanguage;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div[2]/div/button[1]"
    )
    private static WebElement selectLanguageDefault;
    @FindBy(
            xpath = "//*[contains(@id, ':rb:')]"
    )
    private static WebElement searchEvent;
    @FindBy(
            xpath = "//*[@id=\":rf:\"]"
    )
    private static WebElement changeTimeFrom;
    @FindBy(
            xpath = "//*[@id=\":ri:\"]"
    )
    private static WebElement changeTimeTo;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[4]/div/div[2]/div[1]/button"
    )
    private static WebElement addEvent;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[4]/div/div[1]/div[1]/div/div/div/div/span/button"
    )
    private static WebElement searchEventButton;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[5]/div/div/div[1]/div/span[1]/button"
    )
    private static WebElement addIsPromo1;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[5]/div/div[2]/div/div/span[1]/button"
    )
    private static WebElement addIsPromo2;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[5]/div/div/div[2]/div/span[1]/button"
    )
    private static WebElement deleteIsPromo2;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[5]/div/div[2]/div/div/span[2]/button"
    )
    private static WebElement addIsSafe2;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[1]/div[2]/div/div[4]/div/div[1]/span/input"
    )
    private static WebElement disableFourSport;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[1]/div[2]/div/div[5]/span/button"
    )
    private static WebElement deleteDisableFourSport;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[5]/div/div[1]/div/div/span[3]/button"
    )
    private static WebElement deleteEvent;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div/div/div[2]/span/button"
    )
    private static WebElement editeLanguageCustom;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div/div/div[2]/div/button[2]"
    )
    private static WebElement openListLanguageCustom;
    @FindBy(
            xpath = "/html/body/div[9]/div[3]/div/div[2]/div[3]/div[1]/div/span"
    )
    private static WebElement selectLanguageCustom1;
    @FindBy(
            xpath = "/html/body/div[9]/div[3]/div/div[2]/div[3]/div[2]/div/span"
    )
    private static WebElement selectLanguageCustom2;
    @FindBy(
            xpath = "/html/body/div[9]/div[3]/div/div[3]/button[2]"
    )
    private static WebElement addLanguageCustom;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div/div/div[2]/div/span/button"
    )
    private static WebElement saveLanguageCustom;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div/div/div[2]/div/button[1]"
    )
    private static WebElement deleteLanguageCustom;
    @FindBy(
            xpath = "/html/body/div[9]/div[3]/div/div[2]/div[3]/div[1]/div/span"
    )
    private static WebElement selectLanguageCustomDelete1;
    @FindBy(
            xpath = "/html/body/div[7]/div[3]/div/div[2]/div[3]/div[2]/div/span"
    )
    private static WebElement selectLanguageCustomDelete2;
    @FindBy(
            xpath = "/html/body/div[9]/div[3]/div/div[3]/button[2]"
    )
    private static WebElement deleteButtonLanguageCustom;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[1]/div[2]/div/div[4]/div/div[1]"
    )
    private static WebElement assertWhatAddSport;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div[2]/div/button[7]"
    )
    private static WebElement assertWhatAddLanguage;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div[2]/div/button[6]"
    )
    private static WebElement assertWhatDeleteLanguage;
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[4]/div/div[2]/div[2]/button"
    )
    private static WebElement copyEventFromDefault;

    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[5]/div/div/div[1]/div/div[5]/div"
    )
    private static WebElement checkEvent;
    @FindBy(
            xpath = "//*[@class='ColumnWrapperstyles__ColumnWrapper-sc-1qm7qn3-0 Nfghw']"
    )
    private static WebElement checkTags;
//*[@id="root"]/div[1]/div/div[1]/div[2]/div/div[1]/div/div[2]/span
    @FindBy(
            xpath = "//*[@id=\"root\"]/div[1]/div/div[1]/div[2]/div/div[1]/div/div[2]/span']"
    )
    private static WebElement checkNumberOfEvent;

    @FindBy(
            xpath = "//*[@class='SportTreeItemstyles__CountWrapper-sc-5zup7e-1 liwxjR']"
    )
    private static WebElement getNumberOfEventInSport;
    public static void clickAddSportButton() {
        addSportButton.click();
    }

    public static void clickSelectSportButton() {
        selectSportButton.click();
    }

    public static void clickApplySportAdd() {
        applySportAdd.click();
    }

    public static void clickSelectLanguage() {
        selectLanguage.click();
    }
    public static void clickSelectLanguageDefault() {
        selectLanguageDefault.click();
    }
    public static void clickSaveConfig() {
        saveConfig.click();
    }

    public static void inputEvent(String team) {
        searchEvent.sendKeys(new CharSequence[]{team});
    }

    public static void clickFromDate() {
        changeTimeFrom.click();
    }

    public static void clickToDate() {
        changeTimeTo.click();
    }

    public static void inputFromDate(String from) {
        changeTimeFrom.sendKeys(new CharSequence[]{from});
    }

    public static void inputToDate(String to) {
        changeTimeTo.sendKeys(new CharSequence[]{to});
    }

    public static void clickAddEvent() {
        addEvent.click();
    }

    public static void clickAddIsPromo1() {
        addIsPromo1.click();
    }

    public static void clickAddIsPromo2() {
        addIsPromo2.click();
    }

    public static void clickAddIsSafe2() {
        addIsSafe2.click();
    }

    public static void clickSearchEventButton() {
        searchEventButton.click();
    }

    public static void clickDeleatIsPromo2() {
        deleteIsPromo2.click();
    }

    public static void clickDisableFourSport() {
        disableFourSport.click();
    }

    public static void clickDeleteDisableFourSport() {
        deleteDisableFourSport.click();
    }

    public static void clickDeleteEvent() {
        deleteEvent.click();
    }

    public static void clickOpenListLanguageCustom() {
        openListLanguageCustom.click();
    }

    public static void clickEditeLanguageCustom() {
        editeLanguageCustom.click();
    }

    public static void clickSelectLanguageCustom1() {
        selectLanguageCustom1.click();
    }

    public static void clickSelectLanguageCustom2() {
        selectLanguageCustom2.click();
    }

    public static void clickAddLanguageCustom() {
        addLanguageCustom.click();
    }

    public static void clickSaveLanguageCustom() {
        saveLanguageCustom.click();
    }

    public static void clickDeleteLanguageCustom() {
        deleteLanguageCustom.click();
    }

    public static void clickSelectLanguageCustomDelete1() {
        selectLanguageCustomDelete1.click();
    }

    public static void clickSelectLanguageCustomDelete2() {
        selectLanguageCustomDelete2.click();
    }

    public static void clickDeleteButtonLanguageCustom() {
        deleteButtonLanguageCustom.click();
    }

    public static String assertTextWhatAddSport() {
        String sportAdded = assertWhatAddSport.getText();
        return sportAdded;
    }

    public String assertTextWhatAddLanguage() {
        String languageAdded = assertWhatAddLanguage.getText();
        return languageAdded;
    }
    public String checkNumberOfSportEvent() {
        String NumberOfSportEvent = checkNumberOfEvent.getText();
        return NumberOfSportEvent;
    }

    public String assertTextWhatDeleteLanguage() {
        String languageDelete = assertWhatDeleteLanguage.getText();
        return languageDelete;
    }

    public String checkTextEvent() {
        String checkTextEvent = checkEvent.getText();
        return checkTextEvent;
    }

    public static void clickCopyEventFromDefault() {
        copyEventFromDefault.click();
    }

    public String checkNumberOfEventInSport() {
        String checkNumberOfEvent = getNumberOfEventInSport.getText();
        return checkNumberOfEvent;
    }
    public static int checkSportList() {
        List<WebElement> sportColumn = driver.findElements(By.xpath("//*[@class='ColumnWrapperstyles__ColumnWrapper-sc-1qm7qn3-0 Nfghw']"));
        return sportColumn.size();
    }
    public static int checkEventList() {
        List<WebElement> sportColumn = driver.findElements(By.xpath("//*[@class='RowWrapperstyles__RowWrapper-sc-gthg2c-0 bVmYst']"));
        return sportColumn.size();
    }



}
