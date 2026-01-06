package Day38;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

public class capturescreenShot {
    public static void main(String[] args) throws IOException {

        WebDriver driver=new ChromeDriver();
        //ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //full page screenshot
        TakesScreenshot ts=(TakesScreenshot)driver;
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);

        //File targetFile=new File("C:\\Users\\dilip\\IdeaProjects\\LearningJavaATB14xPrograms\\Pavan_Selenium_Project\\src\\test\\screenshots\\fullpage.png");
        //File targetFile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
        File targetFile = new File(System.getProperty("user.dir") + "\\screenshots\\fullpage.png");


        sourceFile.renameTo(targetFile);  //Copy source frile to target file
        //Files.copy(sourceFile.toPath(), targetFile.toPath());

    }
}


// TakeScreenshot tc=(TakeScreenshot)driver;
//tc.getScreenshotAs(OutputType.FILE);

