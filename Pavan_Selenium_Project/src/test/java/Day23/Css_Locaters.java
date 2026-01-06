package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Css_Locaters {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        //tsg id         tag#id
       // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");    //first way
        // driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");        //second way

        //tag class     tag.class
        //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
       // driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");

        //tag attribute   tag[attribute='value']
        //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
        driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirts");



    }
}
