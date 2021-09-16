package demoguru99.model;

import demoguru99.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddTariffPlanToCustomerPage extends BaseModel {

    @FindBy(xpath = "//input[@id='customer_id']")
    private WebElement inputCustomerID;

    @FindBy(xpath = "//form//td[1]")
    private WebElement selectTariffPlan;

    @FindBy(xpath = "//h2[contains(text(), 'Congratulation')]")
    private WebElement assignedNotification;

    public AddTariffPlanToCustomerPage inputCustomerId(String customerId) {
        inputCustomerID.sendKeys(customerId);
        return new AddTariffPlanToCustomerPage(getDriver());
    }

    public WebElement checkCustomerBeforeAddTariffPlan(String customerName) {
        WebElement helloMessage = getDriver()
                .findElement(By.xpath(String.format("//h3[contains(text(),'%s')]", customerName)));
        return helloMessage;
    }

    public AddTariffPlanToCustomerPage selectTariffPlan() {
        /*Actions builder = new Actions(getDriver());
        builder.keyDown(Keys.CONTROL)
                .moveByOffset( -3, -3 )
                .clickAndHold(selectTariffPlan)
                .build().perform();*/
        selectTariffPlan.click();
        return new AddTariffPlanToCustomerPage(getDriver());
    }

    public WebElement getAssignedNotification() {
        return assignedNotification;
    }

    public AddTariffPlanToCustomerPage(WebDriver driver) {
        super(driver);
    }
}
