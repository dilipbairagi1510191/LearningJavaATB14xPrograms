package Day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NewFileUpload {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("(//input[@id='file-upload'])[1]")).sendKeys("C:\\Users\\dilip\\OneDrive\\Documents\\Pramod Automaiton\\Class ques.");
         driver.findElement(By.xpath("(//input[@id='file-submit'])[1]")).click();

    }
}
