package Day32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v141.page.model.WebAppManifest;

import java.time.Duration;

public class Static_Table {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        //find total nomber of row in table
        int row=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("Number of row::"+row);

        //find total number of column in row
        int colums=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Number of colums::"+colums);

        //Capture 5th row 1st column data which is "Master In Selenium"
        //String BookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        //System.out.println(BookName);
/*
        //Read all data from all rows and column
        for(int r=2; r<=row; r++)
        {
            for(int c=1; c<=colums; c++)
            {
                                                                   //dirctly in x path we cant pass the value so using "+r+" and "+c+"
                String value= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(value+"\t");
            }
            System.out.println();
        }

 */
     /*     //Print book name whos authore is mukesh
        for(int r=2; r<=row; r++)
        {
            String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();

            if(authorName.equals("Mukesh"))
            {
                String BookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                System.out.println(BookName+"\t"+authorName);
            }
        }

    */
        //Find total price of all book
        int total=0;
        for(int r=2; r<=row; r++)
        {
            String Price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            total=total+Integer.parseInt(Price);
        }
        System.out.println("Total price of the Book:"+total);

    }
}
