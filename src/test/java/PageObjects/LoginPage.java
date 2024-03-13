package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    public WebDriver driver;
    @FindBy(
            xpath = "//*[contains(@id, 'username_input')]"
    )
    private static WebElement loginField;
    @FindBy(
            xpath = "//*[contains(@id, 'accept-cookie-btn')]"
    )
    private static WebElement acceptCookies;
    @FindBy(
            xpath = "//*[contains(@id, 'login-button')]"
    )
    private static WebElement loginBtn;
    @FindBy(
            xpath = "//*[contains(@id, 'password_input')]"
    )
    private static WebElement passwdField;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static void clickCookiesBtn() {
        acceptCookies.click();
    }

    public static void inputLogin(String login) {
        loginField.sendKeys(new CharSequence[]{login});
    }

    public static void inputPasswd(String password)  {
        passwdField.sendKeys(new CharSequence[]{password});
    }

    public static void clickLoginBtn() {
        loginBtn.click();
    }
}
