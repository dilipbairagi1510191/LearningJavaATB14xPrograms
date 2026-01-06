package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LocatersDemo {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");

         driver.manage().window().maximize();




        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



        //name element
        //driver.findElement(By.name("search")).sendKeys("Mac");

         //id
        //Boolean logoDisplayed =driver.findElement(By.id("logo")).isDisplayed();
       //System.out.println(logoDisplayed);

        //linktext
        //driver.findElement(By.linkText("Tablets")).click();
        //driver.findElement(By.partialLinkText("Tab")).click();

        //List<WebElement> header_Links=driver.findElements(By.className("list-inline"));
        //System.out.println("Total links:"+header_Links.size());


/*      Class name
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        List<WebElement> headerLinks = wait.until(
                ExpectedConditions.numberOfElementsToBeMoreThan(
                        By.cssSelector("#top-links li"), 5));

        System.out.println("Total links: " + headerLinks.size());

        for (WebElement link : headerLinks) {
            System.out.println(link.getText());
*/

        //Tagename
        //List<WebElement> links=driver.findElements(By.tagName("a"));
        //System.out.println(links.size());

        List<WebElement> image=driver.findElements(By.tagName("img"));
        System.out.println("Total image:" +image.size());




    }
}

