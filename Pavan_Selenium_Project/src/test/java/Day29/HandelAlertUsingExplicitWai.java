package Day29;

//Handel alert without using swichTo().alert()
//by using explicit wait

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandelAlertUsingExplicitWai {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); //ExplicitWait

        driver.get("https://the-internet.hackerearth.com/javascript_alerts");
        driver.manage().window().maximize();

        //(1)Normal aleart with ok button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(5000);

        Alert myaleart=mywait.until(ExpectedConditions.alertIsPresent());


        System.out.println(myaleart.getText());
        myaleart.accept();

    }
}
