package demoguru99.tests;

import demoguru99.BaseForTest;
import demoguru99.model.MainPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTest extends BaseForTest {

    private static final String LOGO_TEXT = "Guru99 telecom";

    @Test
    public void checkLogoText() {

        WebElement logo = new MainPage(getDriver())
                .getLogo();

        Assert.assertEquals(logo.getText(), LOGO_TEXT);
    }
}
