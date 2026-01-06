package Day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandelBrowerWindow {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();


        Set<String> windowIds=driver.getWindowHandles();  //converted set collection into listcollection

       /*
        //Approch 1
        List<String> windowList=new ArrayList(windowIds);
        String parentId=windowList.get(0);
        String childId=windowList.get(1);

        //Swich window
        driver.switchTo().window(childId);
        System.out.println(driver.getTitle());

        //swich to parenwindo
        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle());
        */

        //Approch 2

        for(String winid:windowIds)
        {
            String title=driver.switchTo().window(winid).getTitle();
            if(title.equals("OrangeHRM")){

                System.out.println(driver.getCurrentUrl());
            }
        }


    }
}
