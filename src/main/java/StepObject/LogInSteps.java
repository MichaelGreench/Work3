package StepObject;

import PageObject.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(logInButton));
        loginBtn.click();
        driver.findElement(logInButton).click();
    }
}
