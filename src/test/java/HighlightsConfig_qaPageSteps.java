import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HighlightsConfig_qaPageSteps {

    HighlightsConfig_qaPage highlightsConfigQaPage = new HighlightsConfig_qaPage(HMVTest.driver);

@Step
    public void logIn() throws InterruptedException {
    HMVTest.driver.get(ConfProperties.getProperty("loginpage"));
    Thread.sleep(1000l);
    LoginPage.clickCookiesBtn();
    LoginPage.inputLogin(ConfProperties.getProperty("login"));
    LoginPage.inputPasswd(ConfProperties.getProperty("password"));
    LoginPage.clickLoginBtn();
}



}
