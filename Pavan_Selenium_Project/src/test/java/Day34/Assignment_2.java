package Day34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assignment_2 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }
}
