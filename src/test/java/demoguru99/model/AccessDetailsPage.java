package demoguru99.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccessDetailsPage extends BaseModel {

    @FindBy(xpath = "//table[@class='alt access']//td[2]")
    private WebElement customerID;

    public WebElement getCustomerID() {
        return customerID;
    }

    public AccessDetailsPage(WebDriver driver) {
        super(driver);
    }
}
