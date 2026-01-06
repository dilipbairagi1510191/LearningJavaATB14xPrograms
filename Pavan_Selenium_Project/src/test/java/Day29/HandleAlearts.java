package Day29;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class HandleAlearts {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.hackerearth.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

/*
        //(1)Normal aleart with ok button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(5000);
        Alert myaleart=driver.switchTo().alert();
        System.out.println(myaleart.getText());
        myaleart.accept();
 */


  /*      //(2) Confirmation aleart -> Ok and cancel
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(5000);

        driver.switchTo().alert().accept();   //close aleart using ok button
        //driver.switchTo().alert().dismiss();      //close aleart using cancelled button
*/


        //03) promt aleart
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(3000);
        Alert myalert=driver.switchTo().alert();
        myalert.sendKeys("Welcome");
        myalert.accept();


    }
}
