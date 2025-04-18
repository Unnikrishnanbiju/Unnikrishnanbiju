package Practice_01;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium05 {


        ChromeDriver driver = new  ChromeDriver();
        @BeforeClass
        public void OpenBrowser () {
            driver = new ChromeDriver();
            driver.get("https://app.vwo.com/#/login");
        }

        @Owner("Biju")
        @Test
        public void testNegative () {
            driver.manage().window().maximize();
            WebElement username = driver.findElement(By.name("username"));
            username.sendKeys("abc@gmail.com");

            WebElement password = driver.findElement(By.id("login-password"));
            password.sendKeys("123");

            WebElement button_sub = driver.findElement(By.xpath("//*[@id=\"js-login-btn\"]"));
            button_sub.click();

            WebElement error_message = driver.findElement(By.id("js-notification-box-msg"));
            System.out.println(error_message.getText());

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement error_messages = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box-msg")));
            System.out.println(error_messages.getText());


//            Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");
        }


@AfterClass
public void closeBrowser() {
    // Close the browser after the test is completed
    if (driver != null) {
        driver.quit();
    }
}
}

