package testNGexample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG001 {

    @BeforeMethod
    void demo1(){
        System.out.println("Befor method ");
    }

    @Test
    void  Test1(){
        System.out.println("test1");
    }

    @Test
    void  Test2(){
        System.out.println("test2");
    }

    @AfterMethod
    void demo3() {
        System.out.println("After method");
    }
}
