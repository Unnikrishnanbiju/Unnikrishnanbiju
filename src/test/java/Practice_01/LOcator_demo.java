package Practice_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOcator_demo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Ipad");


    }
}
