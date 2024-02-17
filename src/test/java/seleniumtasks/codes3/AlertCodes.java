package seleniumtasks.codes3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AlertCodes {
    public static <Alert> void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        //confirmation alert
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        //prompt alaert
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(3000);
        org.openqa.selenium.Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.sendKeys("testtt");
        Thread.sleep(3000);
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
        driver.quit();


    }
}
