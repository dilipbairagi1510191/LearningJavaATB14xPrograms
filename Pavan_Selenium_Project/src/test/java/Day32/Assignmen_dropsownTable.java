package Day32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignmen_dropsownTable {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://blazedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//option[@value='Boston']")).click();
        driver.findElement(By.xpath("//select[@name='toPort']//option[@value='London']")).click();
        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

        //find total row in table
        int row=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
        System.out.println("Total row::"+row);

        // Store all prices in list

        List<Double> priceList=new ArrayList<>();

        for(int r=2; r<=row; r++)
        {
            String priceText=driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();

            //removed from int value doller $ and covert in int from string becuase to apply sorting .
            double price =Double.parseDouble(priceText.replace("$",""));
            priceList.add(price);
        }
        System.out.println("All Prices: " + priceList);

        // find minimum price
        double minprice=Collections.min(priceList);
        System.out.println("Minimum Price:"+minprice);

        // Find row number of minimum price
        driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[3]")).click();

        // Now fill the passenger form
        driver.findElement(By.id("inputName")).sendKeys("Dilip");
        driver.findElement(By.id("address")).sendKeys("Test Address");
        driver.findElement(By.id("city")).sendKeys("Mumbai");
        driver.findElement(By.id("state")).sendKeys("MH");
        driver.findElement(By.id("zipCode")).sendKeys("400001");
        driver.findElement(By.id("creditCardNumber")).sendKeys("123456789");
        driver.findElement(By.id("creditCardMonth")).clear();
        driver.findElement(By.id("creditCardMonth")).sendKeys("12");
        driver.findElement(By.id("creditCardYear")).clear();
        driver.findElement(By.id("creditCardYear")).sendKeys("2030");
        driver.findElement(By.id("nameOnCard")).sendKeys("Dilip Card");
        driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();

            //verify thank you msg
            String expected = "Thank you for your purchase today!";
            String actual=driver.findElement(By.xpath("//h1")).getText();

            if(actual.equals(expected))
            {
                System.out.println("Msg matched");
            }
            else {
                System.out.println("Msg not matched");
                System.out.println("Actual text: " + actual);
            }

           // Thread.sleep(3000);
            //driver.close();



    }
}
