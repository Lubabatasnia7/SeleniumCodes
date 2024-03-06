package seleniumtasks.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

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
    public void getTitle(){
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }
}
