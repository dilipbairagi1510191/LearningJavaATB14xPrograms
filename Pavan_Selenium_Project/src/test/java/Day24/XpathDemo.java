package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //Xpath with single attribute
        //driver.findElement(By.xpath("//input[@name='q']")).sendKeys("t-shirt");

        //Xpath with multiple attribute
        //driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("t-shirt");

        //xpath with & operator
       // driver.findElement(By.xpath("//input[@name='q' and @placeholder='Search store']")).sendKeys("t-shirt");

        //xpath with or operator
        //driver.findElement(By.xpath("//input[@name='q' or @placeholder='Search storeeee']")).sendKeys("t-shirt"

       //Xpath with text()
        //Boolean displaystatus=driver.findElement(By.xpath("//h2[text()='Featured products']")).isDisplayed();
        //System.out.println(displaystatus);

        //String value=driver.findElement(By.xpath("//h2[text()='Featured products']")).getText();
        //System.out.println(value);

        //xpath with containes with Serarch method
       // driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("t-shirt");

        //xpath with start-with
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("t-shirt");





    }
}
