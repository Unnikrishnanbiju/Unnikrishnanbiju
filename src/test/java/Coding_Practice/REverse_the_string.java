package Coding_Practice;

import java.util.Scanner;

public class REverse_the_string {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words to be printed");
        String a = sc.nextLine();
        String[] words =a.split(" ");
        for (int i = words.length - 1 ;  i >= 0; i--) {
            System.out.println(words[i] + " ");

        }
    }
}
