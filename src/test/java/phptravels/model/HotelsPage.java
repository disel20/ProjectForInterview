package phptravels.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelsPage extends BaseModel {

    @FindBy(xpath = "//div/h2[text()='Featured Hotels']")
    private WebElement textFeaturedHotels;

    public HotelsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTextFeaturedHotels() {
        return textFeaturedHotels;
    }
}
