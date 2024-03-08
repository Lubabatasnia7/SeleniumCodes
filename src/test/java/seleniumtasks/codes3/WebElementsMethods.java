package seleniumtasks.codes3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WebElementsMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.id("firstName")).sendKeys("Lubaba");
        Thread.sleep(2000);
        //driver.findElement(By.id("lastName")).sendKeys("Tasnia");
        //Thread.sleep(2000);
        //driver.findElement(By.id("lastName")).clear();
        //Thread.sleep(2000);
        //driver.findElement(By.id("lastName")).sendKeys("Tasnia");

        WebElement webElement = driver.findElement(By.id("lastName"));
        webElement.sendKeys("Tasnia");
        Thread.sleep(3000);
        webElement.clear();
        Thread.sleep(3000);
        webElement.sendKeys("Tasnia");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("userNumber")).sendKeys("1234567891");
        Thread.sleep(2000);
        WebElement checkBox = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
        System.out.println(checkBox.isDisplayed());
        checkBox.click();
        System.out.println(checkBox.isSelected());
        System.out.println("Get tag name : "+checkBox.getTagName());
        System.out.println("Get value :" +checkBox.getRect().height);
        System.out.println("Font value :"+checkBox.getCssValue("font-family"));
        System.out.println("Text : "+checkBox.getText());
        Thread.sleep(3000);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);


        driver.quit();

    }
}
