package seleniumtasks.codes4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class NewWindowTabCodes {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println(driver.findElement(By.className("text-center")).getText());

        Thread.sleep(2000);
        String mainWindow = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/sample");
        Thread.sleep(4000);

        System.out.println("Tab heading : " + driver.findElement(By.id("sampleHeading")).getText());

        driver.close();

        driver.switchTo().window(mainWindow);

        Thread.sleep(3000);

        String mainWindow2 = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://demoqa.com/sample");
        Thread.sleep(4000);

        System.out.println("Window new: "+ driver.findElement(By.id("sampleHeading")).getText());
        driver.close();

        driver.switchTo().window(mainWindow2);

        Thread.sleep(3000);

        driver.close();
        driver.quit();
    }
}
