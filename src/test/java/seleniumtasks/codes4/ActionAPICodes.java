package seleniumtasks.codes4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionAPICodes {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        new Actions(driver).dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")))
                .build().perform();
        Thread.sleep(3000);


        // new Actions(driver).contextClick(driver.findElement(By.id("droppableExample-tab-simple")))
        //.build().perform();
        // Thread.sleep(3000);
        //driver.navigate().refresh();
        // Thread.sleep(3000);

        driver.navigate().to("https://demoqa.com/menu#");

        Actions actions = new Actions(driver);

//        actions.moveToElement(driver.findElement(By.linkText("Main Item 2"))).click().build().perform();
//        actions.moveToElement(driver.findElement(By.linkText("SUB SUB LIST »"))).click().build().perform();
//        Thread.sleep(2000);
//        actions.moveToElement(driver.findElement(By.linkText("Sub Sub Item 2")))
//                .click().build().perform();


        actions.moveToElement(driver.findElement(By.linkText("Main Item 2")))
                .moveToElement(driver.findElement(By.linkText("SUB SUB LIST »")))
                .moveToElement(driver.findElement(By.linkText("Sub Sub Item 2")))
                .click().build().perform();
        Thread.sleep(3000);

        driver.quit();
    }
}
