package Day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class HandelCheckBoxes {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        //1)select specific element
        //driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //2 select all the checkboxes
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox'] "));

        /*
        for(int i=0; i<checkboxes.size();i++){

            checkboxes.get(i).click();
        */
        /*
        //inhance for loop
        for(WebElement checkbox:checkboxes){

            checkbox.click();
        }
        */

        //How to select last three checkboxes
        //formula-> total no. of check boxes - howmany checkboxes want to select = starting index
        //7-3= 4 (Starting index)

        /*
        for(int i=4; i<checkboxes.size(); i++){

            checkboxes.get(i).click();
        }
      */

        //selected fist three check boxes

        for(int i=0; i<3; i++){
            checkboxes.get(i).click();
        }



        //Unslect checkboxes if they are selected
        for(int i=0; i<3; i++){

            if(checkboxes.get(i).isSelected()){

                checkboxes.get(i).click();
            }







    }
}}
