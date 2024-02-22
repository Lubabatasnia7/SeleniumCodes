package seleniumtasks.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseClassCodes {
    WebDriver driver;
    @BeforeClass
    public void BrowserLaunch() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

       // Thread.sleep(3000);
        //driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Thread.sleep(3000);
        //driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //Thread.sleep(3000);
        //driver.findElement(By.id("login-button")).click();
        //Thread.sleep(3000);
    }
    @AfterClass
    public void closeBrowser(){

        driver.quit();
    }
}
