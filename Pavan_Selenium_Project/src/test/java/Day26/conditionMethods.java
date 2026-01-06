package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionMethods {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();

       //isDisplayed

        //WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        //System.out.println("Display stauts of logo:"+logo.isDisplayed());

       // boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
       // System.out.println("Status is:"+status);


        //is selected method Male & Female button
       WebElement male_red=driver.findElement(By.xpath("//input[@id='gender-male']"));
       WebElement female_red=driver.findElement(By.xpath("//input[@id='gender-female']"));

        System.out.println("Before selected..........");
        System.out.println(male_red.isSelected());
        System.out.println(female_red.isSelected());

        System.out.println("After selecting male button.......");
        female_red.click();   ///seelct male buttong

        System.out.println(male_red.isSelected());    //true
        System.out.println(female_red.isSelected());    //false





    }
}
