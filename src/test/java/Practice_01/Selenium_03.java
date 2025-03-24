package Practice_01;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium_03 {
    ChromeDriver driver;

    @BeforeTest
    public void OpenBrowser(){
        driver = new ChromeDriver();

    }



    @Owner("Unni")
    @Test
    public void testBrowser(){
driver.get("https://app.vwo.com");
driver.manage().window().maximize();
 driver.getTitle();

        List<WebElement> button_list = driver.findElements(By.tagName("button"));
        System.out.println(button_list);
        for (WebElement button: button_list){
            System.out.println(button.getText());


        }
        WebElement link_text_start_tril = driver.findElement(By.linkText("Start a free trial"));
        link_text_start_tril.click();
    }

    @Test
    public void testBrowser2(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver.get("https://app.vwo.com");
        Assert.assertEquals(driver.getTitle(),"Google");
    }


    @AfterTest
    public void CloseBrowser() {
        try {
            Thread.sleep(Long.parseLong("3000"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}


