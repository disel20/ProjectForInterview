package phptravels.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import phptravels.TestUtils;

public class LoginPage extends BaseModel {

    private static final String LOGIN = "user@phptravels.com";
    private static final String PASS = "demouser";

    @FindBy(xpath = "//div[(@class='form-group')]/input[@name='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement inputPass;

    @FindBy(xpath = "//button/span[text()='Login']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//button[@id='cookie_stop']")
    private WebElement cookieStopButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public DashboardPage login(WebDriver driver, String login, String pass) {
        inputEmail.sendKeys(login);
        inputPass.sendKeys(pass);
        try {
            cookieStopButton.click();
        }
        finally {
            TestUtils.scroll(getDriver(), buttonLogin);
        }
        buttonLogin.click();
        return new DashboardPage(getDriver());
    }

    public static String getUserName() {
        return LOGIN;
    }

    public static String getUserPass() {
        return PASS;
    }
}
