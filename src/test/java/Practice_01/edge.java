package Practice_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class edge {

    @Test
            public void negativeTC(){


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");


        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("login-username"));
        username.sendKeys("abc@gmail.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("123");

        WebElement submit = driver.findElement(By.id("js-login-btn"));
        submit.click();
        // Bad practice
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(error_msg.getText());


        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");
        driver.quit();
    }
}
