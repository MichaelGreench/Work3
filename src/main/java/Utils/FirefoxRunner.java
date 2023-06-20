package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class FirefoxRunner {
    WebDriver driver = new FirefoxDriver();
    @BeforeTest

    public void openFirefox() {
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @AfterTest

    public void closeFirefox() {
        driver.close();
    }
}
