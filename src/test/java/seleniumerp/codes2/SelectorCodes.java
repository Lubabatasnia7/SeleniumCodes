package seleniumerp.codes2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class SelectorCodes {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));

        //xpath
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("lubaba");
        Thread.sleep(3000);

        //css selector
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("lubaba07");
        Thread.sleep(3000);

        //linktext
        driver.findElement(By.linkText("Forgot login info?")).click();
        Thread.sleep(3000);

        //partial link text
        driver.findElement(By.partialLinkText("Regi")).click();
        Thread.sleep(3000);

        //name
        driver.findElement(By.name("customer.firstName")).sendKeys("Lubaba");
        Thread.sleep(3000);

        //tag name
        List < WebElement> webElements = driver.findElements(By.tagName("a"));
        for (WebElement webElement : webElements) {
            System.out.println(webElement.getText() +" " +webElement.getAttribute("href"));
        }

        driver.quit();
    }
}
