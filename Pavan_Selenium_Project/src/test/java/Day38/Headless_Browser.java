package Day38;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Browser {
    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless=new");  //setting for headless mode of exicution

        // lauch the browser
        ChromeDriver driver=new ChromeDriver(options);   //pass options on chromeDriver
        //WebDriver driver=new ChromeDriver();

        //Open Url
        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();

        //validate titel
        String act_tile=driver.getTitle();
        System.out.println(act_tile);

    }
}
