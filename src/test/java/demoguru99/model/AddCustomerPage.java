package demoguru99.model;

import demoguru99.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends BaseModel {

    @FindBy(xpath = "//label[@for='done']")
    private WebElement checkBoxDone;

    @FindBy(xpath = "//input[@id='fname']")
    private WebElement inputFirstName;

    @FindBy(xpath = "//input[@id='lname']")
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//textarea[@id='message']")
    private WebElement inputMessage;

    @FindBy(xpath = "//input[@id='telephoneno']")
    private WebElement inputTelePhoneNo;

    public AddCustomerPage chooseDoneInBackgroundCheckField() {
        checkBoxDone.click();
        return new AddCustomerPage(getDriver());
    }

    public AddCustomerPage fillOutForm(String firstName, String lastName, String email,
                                       String message, String telePhone) throws InterruptedException {
        inputFirstName.sendKeys(firstName);
        Thread.sleep(500);
        inputLastName.sendKeys(lastName);
        inputEmail.sendKeys(email);
        inputMessage.sendKeys(message);
        Thread.sleep(500);
        inputTelePhoneNo.sendKeys(telePhone);

        return new AddCustomerPage(getDriver());
    }

    public AddCustomerPage(WebDriver driver) {
        super(driver);
    }
}
