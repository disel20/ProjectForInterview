package demoguru99.tests;

import demoguru99.BaseForTest;
import demoguru99.model.AddTariffPlanPage;
import demoguru99.model.BaseModel;
import demoguru99.model.MainPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AddTariffPlansTest extends BaseForTest {

    private static final String MONTHLY_RENT = RandomStringUtils.randomNumeric(10);
    private static final String FREE_LOC_MIN = RandomStringUtils.randomNumeric(10);
    private static final String FREE_INT_MIN = RandomStringUtils.randomNumeric(10);
    private static final String FREE_SMS = RandomStringUtils.randomNumeric(10);
    private static final String LOC_PER_MIN_CHARG = RandomStringUtils.randomNumeric(10);
    private static final String INT_PER_MIN_CHARG = RandomStringUtils.randomNumeric(10);
    private static final String SMS_PER_CHARG = RandomStringUtils.randomNumeric(10);
    private static final String CONGRATS_NOTIFICATION = "Congratulation you add Tariff Plan";

    @Test
    public void addTariffPlans() {

        BaseModel addTariffPlan = new MainPage(getDriver())
                .clickAddTariffPlan()
                .fillOutFormForTariff(MONTHLY_RENT, FREE_LOC_MIN, FREE_INT_MIN, FREE_SMS, LOC_PER_MIN_CHARG,
                        INT_PER_MIN_CHARG, SMS_PER_CHARG)
                .clickSubmitButton();

        WebElement congratsNotification = new AddTariffPlanPage(getDriver())
                .getCongratsNotification();

        Assert.assertEquals(congratsNotification.getText(), CONGRATS_NOTIFICATION);
    }

    @Ignore
    public void doubleCheckCreationTariffPlan() {

    }
}
