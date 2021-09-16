package demoguru99.tests;

import demoguru99.BaseForTest;
import demoguru99.TestUtils;
import demoguru99.model.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class CustomersTest extends BaseForTest {

    private static final String FIRST_NAME = RandomStringUtils.randomAlphabetic(0, 10);
    private static final String LAST_NAME = RandomStringUtils.randomAlphabetic(0, 10);
    private static final String EMAIL = TestUtils.getEmail();
    private static final String MESSAGE = RandomStringUtils.randomAlphabetic(0, 10);
    private static final String PHONE_NO = RandomStringUtils.randomNumeric(11);
    private String customerId;
    private static final String ASSIGNED_NOTIFICATION = "Congratulation Tariff Plan assigned";

    @Test
    public void addCustomer() throws InterruptedException {

        BaseModel addCustomerPage = new MainPage(getDriver())
                .clickAddCustomer()
                .chooseDoneInBackgroundCheckField()
                .fillOutForm(FIRST_NAME, LAST_NAME, EMAIL, MESSAGE, PHONE_NO)
                .clickSubmitButton();

        WebElement customerID = new AccessDetailsPage(getDriver())
                .getCustomerID();
        customerId = customerID.getText();

        Assert.assertTrue(customerID.isDisplayed());
    }

    @Test(dependsOnMethods = "addCustomer")
    public void AddTariffPlanToCustomer() throws InterruptedException {

        BaseModel addTariffPlanToCustomer = new MainPage(getDriver())
                .clickAddTariffPlanToCustomer()
                .inputCustomerId(customerId)
                .clickSubmitButton();

        WebElement helloMessage = new AddTariffPlanToCustomerPage(getDriver())
                .checkCustomerBeforeAddTariffPlan(FIRST_NAME);
        Assert.assertTrue(helloMessage.getText().contains(FIRST_NAME));

        BaseModel atptc = new AddTariffPlanToCustomerPage(getDriver())
                .selectTariffPlan()
                .clickSubmitButton();

        WebElement assignedNotification = new AddTariffPlanToCustomerPage(getDriver())
                .getAssignedNotification();
        Assert.assertEquals(assignedNotification.getText(), ASSIGNED_NOTIFICATION);
    }
}
