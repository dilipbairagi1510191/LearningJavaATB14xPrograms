package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import javax.swing.*;
import java.time.Duration;

public class mouseOverAction {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

       WebElement desktop=driver.findElement(By.xpath("//a[contains(text(),'Desktops')]"));
       WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

       //Mouse Hover
       Actions act=new Actions(driver);
        act.moveToElement(desktop).moveToElement(mac).click().build().perform();

    }
}
