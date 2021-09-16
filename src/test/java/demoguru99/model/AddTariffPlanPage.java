package demoguru99.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddTariffPlanPage extends BaseModel {

    @FindBy(xpath = "//input[@id='rental1']")
    private WebElement monthlyRent;

    @FindBy(xpath = "//input[@id='local_minutes']")
    private WebElement freeLocalMinutes;

    @FindBy(xpath = "//input[@id='inter_minutes']")
    private WebElement freeInternationalMinutes;

    @FindBy(xpath = "//input[@id='sms_pack']")
    private WebElement freeSmsPack;

    @FindBy(xpath = "//input[@id='minutes_charges']")
    private WebElement localPerMinutesCharges;

    @FindBy(xpath = "//input[@id='inter_charges']")
    private WebElement internationalPerMinutesCharges;

    @FindBy(xpath = "//input[@id='sms_charges']")
    private WebElement smsPerCharges;

    @FindBy(xpath = "//h2[contains(text(), 'Congratulation')]")
    private WebElement congratsNotification;

    public AddTariffPlanPage fillOutFormForTariff(String inputMonthlyRent, String inputFreeLocMin,
                                                  String inputFreeIntMin, String inputFreeSms,
                                                  String inputLocPerMinCharg, String inputIntPerMinCharg,
                                                  String inputSmsPerCharg) {
        monthlyRent.sendKeys(inputMonthlyRent);
        freeLocalMinutes.sendKeys(inputFreeLocMin);
        freeInternationalMinutes.sendKeys(inputFreeIntMin);
        freeSmsPack.sendKeys(inputFreeSms);
        localPerMinutesCharges.sendKeys(inputLocPerMinCharg);
        internationalPerMinutesCharges.sendKeys(inputIntPerMinCharg);
        smsPerCharges.sendKeys(inputSmsPerCharg);

        return new AddTariffPlanPage(getDriver());
    }

    public WebElement getCongratsNotification() {
        return congratsNotification;
    }

    public AddTariffPlanPage(WebDriver driver) {
        super(driver);
    }
}
