package demoguru99.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseModel {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement clickSubmit;

    protected WebDriver getDriver() {
        return driver;
    }

    protected WebDriverWait getWait() {
        if (wait == null) {
            wait = new WebDriverWait(driver, 10);
        }
        return wait;
    }

    public BaseModel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(getDriver(), this);
    }

    public BaseModel clickSubmitButton() {
        clickSubmit.click();
        return new BaseModel(getDriver());
    }
}
