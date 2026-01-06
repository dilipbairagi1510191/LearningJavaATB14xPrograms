package Day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Assignment {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // Step 4: Print link count
        List<WebElement> links=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));
        System.out.println(links.size());
        String parentWindow =driver.getWindowHandle();

        // Step 5: Click each link one by one (safe way)
        for(int i=0; i<links.size(); i++){

            driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"))
                    .get(i).click();


            // switch to new window
            Set<String> windows = driver.getWindowHandles();
            for (String win : windows) {
                if (!win.equals(parentWindow)) {
                    driver.switchTo().window(win);
                    //driver.close(); // close child tab
                }
            }

            // switch back to parent window
            driver.switchTo().window(parentWindow);
        }










    }
}
