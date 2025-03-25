package Practice_01;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium04 {
ChromeDriver driver;
    @BeforeClass
    public void OpenBrowser(){
        driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
    }

    @Owner("Biju")
    @Test
    public void testNegative(){
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("abc@gmail.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("123");

        WebElement button_sub = driver.findElement(By.xpath("//*[@id=\"js-login-btn\"]"));
        button_sub.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_message = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");
    }


    //2test case
    @Test
    public void testPositive() throws InterruptedException{

        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.name("username"));
        username.clear();
        username.sendKeys("contact+atb5x@thetestingacademy.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.clear();
        password.sendKeys("ATBx@1234");

        WebElement button_sub = driver.findElement(By.xpath("//*[@id=\"js-login-btn\"]"));
        button_sub.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement name_on_dashboard = driver.findElement(By.xpath("//span[@data-qa=\"lufexuloga]"));
        System.out.println(name_on_dashboard.getText());

        Assert.assertEquals(name_on_dashboard.getText(),"aman");
    }




    @AfterClass
    public void closeBrowser(){

        driver.quit();
    }
}
