package seleniumerp.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class MethodAnnotationCodes extends BaseMethodCodes{
    @Test
    public void loginIsSuccessful() throws InterruptedException {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(3000);
        String login = driver.findElement(By.id("logout_sidebar_link")).getText().trim();
        Assert.assertEquals(login, "Logout");

    }

    @Test
    public void checkFirstProductHeading() throws InterruptedException {
        String productHeading = driver.findElement(By.className("inventory_item_name")).getText().trim();
        Assert.assertEquals(productHeading, "Sauce Labs Backpack");

    }

    @Test
    public void checkAbout() throws InterruptedException {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("about_sidebar_link")).click();
        String tryButton = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedAccentGreen MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-fullWidth Mui-focusVisible MuiButton-root MuiButton-contained MuiButton-containedAccentGreen MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-fullWidth css-as8hpy']")).getText().trim();
        Assert.assertEquals(tryButton, "Test it all. Free");
        driver.navigate().refresh();

    }
}
