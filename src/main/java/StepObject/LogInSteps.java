package StepObject;

import PageObject.LogInPage;
import org.openqa.selenium.WebDriver;


public class LogInSteps extends LogInPage {
    WebDriver driver;

    public LogInSteps(WebDriver driver1) {
        driver = driver1;
    }
    public void emailInput (String s) {
        driver.findElement(emailFields).sendKeys(s);
    }
    public void passwordInput (String s) {
        driver.findElement(passwordFileds).sendKeys(s);
    }
    public void logInButton () {
        driver.findElement(logInButton).click();
    }
}
