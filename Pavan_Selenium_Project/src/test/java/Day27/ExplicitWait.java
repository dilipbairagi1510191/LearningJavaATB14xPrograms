package Day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   Implicity wait

        driver.manage().window().maximize();

        WebElement textusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        textusername.sendKeys("admin");

        WebElement textpassword=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        textpassword.sendKeys("admin123");

        WebElement loginbutton=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        loginbutton.click();

        //driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        //driver.close();
    }
}
