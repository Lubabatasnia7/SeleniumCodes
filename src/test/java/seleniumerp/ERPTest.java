package seleniumerp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ERPTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://erpstaging.brac.net/external");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("122416");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123$");
        Thread.sleep(4000);
        driver.findElement(By.id("kc-login")).click();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.findElement(By.cssSelector("#module-3 > a:nth-child(1) > img:nth-child(1)")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div[1]/div/ul/li[3]/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div[1]/div/ul/li[3]/ul/li[1]/div/span")).click();
        Thread.sleep(3000);

        driver.quit();

    }

}
