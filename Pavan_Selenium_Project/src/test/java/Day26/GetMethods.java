package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);

        //Gettitle
        //System.out.println(driver.getTitle());

        //getCurrentURL
       // System.out.println(driver.getCurrentUrl());


        //getPageSource
        //System.out.println(driver.getPageSource());

        //getWindowHandels
        //String windowid=driver.getWindowHandle();
        //System.out.println("windowID:"+windowid);

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Set<String> windowIDS=driver.getWindowHandles();
        System.out.println(windowIDS);

    }
}
