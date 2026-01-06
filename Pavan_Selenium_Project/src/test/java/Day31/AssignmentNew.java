package Day31;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class AssignmentNew {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        //Get all count county
        driver.findElement(By.xpath("//select[@id='country-list']"));
        List<WebElement> countrylist=driver.findElements(By.xpath("//select[@id='country-list']//option"));
        System.out.println("Total country count:"+countrylist.size());

        //Print all country name
        for(WebElement ccnmae:countrylist)
        {
            System.out.println(ccnmae.getText());
        }

        //Select one option from list
        WebElement countryList =driver.findElement(By.xpath("//select[@id='country-list']"));
        Select crlist=new Select(countryList);
        crlist.selectByVisibleText("India");
    }
}

