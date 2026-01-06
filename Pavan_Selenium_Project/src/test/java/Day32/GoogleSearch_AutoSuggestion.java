package Day32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class GoogleSearch_AutoSuggestion {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.findElement(By.id("APjFqb")).sendKeys("Selenium");

        List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
        System.out.println("Count of list:"+list.size());

        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i).getText());
            if(list.get(i).getText().equals("selenium rich foods"))
            {
                list.get(i).click();
                break;
            }
        }



    }
}
