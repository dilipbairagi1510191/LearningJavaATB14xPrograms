package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.sql.Driver;
import java.time.Duration;

public class drageAndDrope {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        Actions act=new Actions(driver);

        WebElement bank=driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
        WebElement DrAccount=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

        act.dragAndDrop(bank,DrAccount).perform();

        WebElement Debitamount=driver.findElement(By.xpath("(//a[@class='button button-orange'][normalize-space()='5000'])[1]"));
        WebElement DrAmount2=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

        act.dragAndDrop(Debitamount,DrAmount2).perform();


    }
}
