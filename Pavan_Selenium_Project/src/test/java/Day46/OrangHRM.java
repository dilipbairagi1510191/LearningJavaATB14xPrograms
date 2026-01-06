package Day46;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.time.Duration;



@Listeners(Day46.MyListner.class)
public class OrangHRM {
    WebDriver driver;


    @BeforeClass
    void setup() throws InterruptedException {
        driver=new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    @Test(priority = 1)
    void testLogo()
    {
        boolean status=driver.findElement(By.xpath("(//img[@alt='company-branding'])[1]")).isDisplayed();
        Assert.assertEquals(status,true);
    }

    @Test(priority = 2)
    void testAppUrl()
    {
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/");
    }

    @Test(priority = 3, dependsOnMethods = {"testAppUrl"})
    void testHomePageTitle()
    {
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

   @AfterClass
    void TearDown()
    {
      driver.quit();
    }




}
