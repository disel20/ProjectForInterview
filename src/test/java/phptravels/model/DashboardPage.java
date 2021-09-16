package phptravels.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BaseModel {

    @FindBy(xpath = "//p[(text()='Wallet Balance')]")
    private WebElement infoWalletBalance;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getInfoWalletBalance() {
        return infoWalletBalance;
    }
}
