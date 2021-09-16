package phptravels.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseModel {

    @FindBy(xpath = "//a[(@class='theme-btn theme-btn-small theme-btn-transparent ml-1 waves-effect')]")
    private WebElement loginButton;

    @FindBy(xpath = "//a[(text()='Hotels')]")
    private WebElement buttonHotels;

    @FindBy(xpath = "//a/strong[contains(text(),'PHPTRAVELS')]")
    private WebElement poweredBy;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickLoginButton() {
        loginButton.click();

        return new LoginPage(getDriver());
    }

    public HotelsPage clickHotelsButton() {
        buttonHotels.click();

        return new HotelsPage(getDriver());
    }

    public WebElement getPoweredBy() {
        return poweredBy;
    }
}
