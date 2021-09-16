package demoguru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseForTest {

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
    public void goToWebsiteTelecom() {
        getDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/telecom/index.html");
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
