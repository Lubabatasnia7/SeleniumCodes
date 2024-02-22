package seleniumtasks.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassAnnotationCodes extends BaseClassCodes{
    @Test (priority = 1)
    public void loginIsSuccessful() throws InterruptedException {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(3000);
        String login = driver.findElement(By.id("logout_sidebar_link")).getText().trim();
        Assert.assertEquals(login, "Logout");

    }

    @Test (priority = 0)
    public void checkFirstProductHeading() throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);
        String productHeading = driver.findElement(By.className("inventory_item_name")).getText().trim();
        Assert.assertEquals(productHeading, "Sauce Labs Backpack");

    }

    @Test (priority = 2)
    public void getTitle(){
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }
}
