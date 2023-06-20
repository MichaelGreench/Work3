import StepObject.LogInSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static DataObject.LogInData.*;

import static java.lang.Thread.sleep;

public class LogIn {

    @Test

    public void logInWithIncorrectData() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        LogInSteps step1 = new LogInSteps(driver);
        step1.emailInput(incorrectEmailData);
        step1.passwordInput(incorrectPasswordData);
        step1.logInButton();

        sleep(5000);
        driver.close();
    }

    @Test

    public void logInWithCorrectData() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        LogInSteps step2 = new LogInSteps(driver);
        step2.emailInput(correctEmailData);
        step2.passwordInput(incorrectPasswordData);
        step2.logInButton();

        sleep(5000);
        driver.close();
    }
}
