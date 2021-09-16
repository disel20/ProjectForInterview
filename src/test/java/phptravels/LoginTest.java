package phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import phptravels.model.DashboardPage;
import phptravels.model.LoginPage;
import phptravels.model.MainPage;

public class LoginTest extends BaseTest {

    private static final String FIELD_WALLET_BALANCE = "Wallet Balance";

    @Test
    public void loginPageTest() {

        DashboardPage dashboardPage = new MainPage(getDriver())
                .clickLoginButton()
                .login(getDriver(), LoginPage.getUserName(), LoginPage.getUserPass());

        Assert.assertEquals(dashboardPage.getInfoWalletBalance().getText(), FIELD_WALLET_BALANCE);
    }
}
