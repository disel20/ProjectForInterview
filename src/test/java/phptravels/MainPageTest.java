package phptravels;

import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import phptravels.model.HotelsPage;
import phptravels.model.MainPage;

public class MainPageTest extends BaseTest {

    private static final String POWERED_BY = " PHPTRAVELS";
    private static final String FEATURED_HOTELS = "Featured Hotels";

    @Test
    public void loadMainPageTest() {

        Assert.assertEquals(new MainPage(getDriver()).getPoweredBy().getText(), POWERED_BY);
    }

    @Test
    public void checkHotelsButton() {

        HotelsPage hotelsPage = new MainPage(getDriver())
                .clickHotelsButton();

        Assert.assertEquals(hotelsPage.getTextFeaturedHotels().getText(), FEATURED_HOTELS);
    }
}
