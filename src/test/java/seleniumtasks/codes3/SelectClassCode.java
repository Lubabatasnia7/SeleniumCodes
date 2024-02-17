package seleniumtasks.codes3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectClassCode {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php?authuser=0");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        Select select = new Select(driver.findElement(By.name("country")));
        select.selectByIndex(3);
        Thread.sleep(1200);
        select.selectByValue("ANTARCTICA");
        Thread.sleep(1200);
        select.selectByVisibleText("ARMENIA");
        Thread.sleep(1200);

        for (WebElement webElement: select.getOptions()){
            System.out.println(webElement.getText());
        }
        driver.quit();
    }
}
