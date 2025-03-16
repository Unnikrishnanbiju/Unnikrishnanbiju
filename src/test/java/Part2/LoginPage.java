package Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    //constructors
    LoginPage(WebDriver driver)
    {
      this.driver = driver;
    }
//Locator
    By txt_username = By.xpath("input[@placeholder='Username']");
    By txt_password = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
   By btn_login = By.xpath( "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");



// Action




}