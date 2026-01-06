package Day39;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import static javax.swing.text.html.CSS.getAttribute;

/*
1)Steps-> href="https://xyz.com"
2) "https://xyz.com"--->server---> status code
3) status code >=400  broken link
   status code<=400 not broken link
*/
public class BrokenLinks {
    public static void main(String[] args) throws IOException {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        //capture all the links from webside
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total no. of links:"+links.size());

        int noOfBrokenLink=0;

        for(WebElement linksElement:links)
        {
            String hrefattvalue=linksElement.getAttribute("href");

            if(hrefattvalue==null || hrefattvalue.isEmpty())
            {
                System.out.println("href value is empty or null so possible to check");
                continue;
            }

            //hit url on the server
            try {
                URL linkurl = new URL(hrefattvalue);  //converted href value from string to URL formate
                HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection();  //open connection to the server
                conn.connect(); //Connec to the server and sent request


                if (conn.getResponseCode() >= 400) {
                    System.out.println(hrefattvalue+"===>  Broken links");
                    noOfBrokenLink++;

                } else {
                    System.out.println(hrefattvalue+"===>   Not broken links");
                }
            }
            catch(Exception e)
            {

            }

        }
        System.out.println("number of Brokenlinks:"+noOfBrokenLink);

    }
}
