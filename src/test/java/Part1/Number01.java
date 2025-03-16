package Part1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Number01
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
//        Send key word shirt to the search using its Xpath
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("shirt");
//        driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]/span")).click();
        driver.findElement(By.name("btnK")).click();


// close the browser window
        driver.quit();
    }
}