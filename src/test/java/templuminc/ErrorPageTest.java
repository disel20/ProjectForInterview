package templuminc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorPageTest extends BaseTest {

    @Test
    public void testBackToHomeButton() {

            goToErrorPage();
            WebElement buttonGoHome = getDriver().findElement(By.xpath("//div[contains(text(), 'Back to home')]"));
            buttonGoHome.click();

            WebElement logo = getDriver().findElement(By.xpath("//img[@class='template-logo']"));

            Assert.assertTrue(logo.isDisplayed());
    }
}
