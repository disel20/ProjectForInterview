package demoguru99.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseModel {

    @FindBy(xpath = "//a[@class='logo']")
    private WebElement logo;

    @FindBy(xpath = "//section[@id='one']//a[text()='Add Customer']")
    private WebElement addCustomer;

    @FindBy(xpath = "//section[@id='one']//a[text()='Add Tariff Plan to Customer']")
    private WebElement addTariffPlanToCustomer;

    @FindBy(xpath = "//section[@id='one']//a[text()='Add Tariff Plan']")
    private WebElement addTariffPlan;

    public WebElement getLogo() {
        return logo;
    }

    public AddCustomerPage clickAddCustomer() {
        addCustomer.click();
        return new AddCustomerPage(getDriver());
    }

    public AddTariffPlanToCustomerPage clickAddTariffPlanToCustomer() {
        addTariffPlanToCustomer.click();
        return new AddTariffPlanToCustomerPage(getDriver());
    }

    public AddTariffPlanPage clickAddTariffPlan() {
        addTariffPlan.click();
        return new AddTariffPlanPage(getDriver());
    }

    public MainPage(WebDriver driver) {
        super(driver);
    }
}
