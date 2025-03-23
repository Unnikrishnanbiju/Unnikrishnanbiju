package Practice_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOcator_demo {
    public static void main(String[] args) {

        String input = "This is india";
       String [] words = input.split("  ");
        for (int i = words.length -1; i >=0 ; i--) {
            System.out.println(words[i] +" ");

//            String input = "This is india";
//            String[] words = input.split(" ");
//
//            for (int i = words.length -1; i >= 0; i--) {
//                System.out.print(words[i] + " ");
        }

    }
}
