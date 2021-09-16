package phptravels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    private WebDriver driver = new ChromeDriver();
    private WebDriverWait wait;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void setUp() throws Exception {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void goToWebsite() {
        getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/");
    }

    @AfterTest
    public void quitBrowser() {
        driver.quit();
    }

    protected WebDriverWait getWait() {
        if (wait == null) {
            wait = new WebDriverWait(driver, 10);
        }
        return wait;
    }
}
