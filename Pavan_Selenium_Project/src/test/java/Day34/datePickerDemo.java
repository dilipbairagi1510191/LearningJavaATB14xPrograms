package Day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class datePickerDemo {

    //selecting future data
        static void selectFutureDate(WebDriver driver, String year, String month, String date)
    {
        while (true)
        {
            String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']\n")).getText(); //Actual month
            String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();  //Actual year

            if(currentMonth.equals(month) &&currentYear.equals(year))
            {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  //next

        }
        List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

        for(WebElement dt:allDates)
        {
            if(dt.getText().equals(date))
            {
                dt.click();
                break;
            }
        }
    }

    //selecting past data
    static void selectpastDate(WebDriver driver, String year, String month, String date)
    {
        while (true)
        {
            String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']\n")).getText(); //Actual month
            String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();  //Actual year

            if(currentMonth.equals(month) &&currentYear.equals(year))
            {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();  //privous button

        }
        List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

        for(WebElement dt:allDates)
        {
            if(dt.getText().equals(date))
            {
                dt.click();
                break;
            }
        }
    }


    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        //swich fram
        driver.switchTo().frame(0);

        //Method 1 using send key
       // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("02/04/2026"); //mm/dd/yyyy

        //method using data pickuper
        //Expected data
        String year="2023";
        String month="May";
        String date="20";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        //Select month adn year
        //select data

        //selectFutureDate(driver,year,month,date);
        selectpastDate(driver,year,month,date);


    }
}
