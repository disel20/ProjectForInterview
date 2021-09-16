package templuminc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebsiteTest extends BaseTest {

    @Test
    public void testLoadMainPage() throws InterruptedException {

        goToWebsite();
        WebElement aboutUs = getDriver().findElement(By.xpath("//a[contains(text(),'About Us')]"));
        TestUtils.scroll(getDriver(), aboutUs);

        Thread.sleep(1000);
        Assert.assertEquals(aboutUs.getText(), "About Us");
        quitBrowser();
    }
}
