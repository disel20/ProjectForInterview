package demoguru99;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;
import java.util.UUID;

public class TestUtils {

    public static void scroll(WebDriver driver, WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView();", element);
    }

    public static String getUUID() {
        return UUID.randomUUID().toString();
    }

    public static String getAlphanumeric(int stringLength) {
        return RandomStringUtils.randomAlphanumeric(stringLength);
    }

    public static String getEmail() {
        return getAlphanumeric(8).concat("@guru99.com");
    }

    public static Integer getInteger(int maxValue) {
        Random r = new Random();
        return r.nextInt(maxValue);
    }
}
