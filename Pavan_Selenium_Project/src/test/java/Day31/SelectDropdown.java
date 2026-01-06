package Day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropdown {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
        Select drpCountry=new Select(drpCountryEle);

        //SelectOption from dropdown
        //drpCountry.selectByVisibleText("France");\
        //drpCountry.selectByValue("japan");
       // drpCountry.selectByIndex(2);


        //Captrure options from the dropdown
        List<WebElement> options=drpCountry.getOptions();
        System.out.println("Number of options:"  +options.size());
        /*   //print list of options
        for(int i=0; i<options.size(); i++)
        {
            System.out.println(options.get(i).getText());
        }

        //Inhance for loop
        for(WebElement op:options)
        {
            System.out.println(op.getText());
        }
    */




    }
}
