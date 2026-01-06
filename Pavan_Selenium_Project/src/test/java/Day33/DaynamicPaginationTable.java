package Day33;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DaynamicPaginationTable {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.get("https://blazedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }
}
