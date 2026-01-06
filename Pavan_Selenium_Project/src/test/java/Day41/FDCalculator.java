package Day41;

import Day41.ExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;
import java.time.Duration;

public class FDCalculator {
    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
        driver.manage().window().maximize();

        String filePath = System.getProperty("user.dir") + "\\testData\\CalData.xlsx";

        int row = ExcelUtil.getRowCount(filePath, "Sheet1");

        for (int i = 1; i <= row; i++)
        {
            // Read Data
            String pric = ExcelUtil.getCellData(filePath, "Sheet1", i, 0);
            String rateofinterest = ExcelUtil.getCellData(filePath, "Sheet1", i, 1);
            String per1 = ExcelUtil.getCellData(filePath, "Sheet1", i, 2);
            String per2 = ExcelUtil.getCellData(filePath, "Sheet1", i, 3);
            String fre = ExcelUtil.getCellData(filePath, "Sheet1", i, 4);
            String exp_mvalue = ExcelUtil.getCellData(filePath, "Sheet1", i, 5);

            // Clear previous values and enter new data
            driver.findElement(By.id("principal")).clear();
            driver.findElement(By.id("principal")).sendKeys(pric);

            driver.findElement(By.id("interest")).clear();
            driver.findElement(By.id("interest")).sendKeys(rateofinterest);

            driver.findElement(By.id("tenure")).clear();
            driver.findElement(By.id("tenure")).sendKeys(per1);

            // Dropdowns
            Select perdrp = new Select(driver.findElement(By.id("tenurePeriod")));
            perdrp.selectByVisibleText(per2);

            Select fredrp = new Select(driver.findElement(By.id("frequency")));
            fredrp.selectByVisibleText(fre);

            // Close popup if appears
            try {
                driver.findElement(By.id("wzrk-cancel")).click();
                Thread.sleep(1000);
            } catch (Exception e) {}

            // ---- SAFE MATURITY VALUE FETCH ----
            WebElement actValueEl = driver.findElement(By.xpath("//span[@id='resp_matval']//strong"));

            String act_mvalue = actValueEl.getText().trim();

            // Retry until actual value appears
            int retry = 0;
            while (act_mvalue.isEmpty() && retry < 10) {
                Thread.sleep(500);
                act_mvalue = actValueEl.getText().trim();
                retry++;
            }

            // Validation
            if (act_mvalue.isEmpty()) {
                System.out.println("Maturity value not found → Test Failed");
                ExcelUtil.setCellData(filePath, "Sheet1", i, 7, "Failed");
            } else {

                double exp = Double.parseDouble(exp_mvalue);
                double act = Double.parseDouble(act_mvalue);

                if (exp == act) {
                    System.out.println("Test Passed");
                    ExcelUtil.setCellData(filePath, "Sheet1", i, 7, "Passed");
                } else {
                    System.out.println("Test Failed");
                    ExcelUtil.setCellData(filePath, "Sheet1", i, 7, "Failed");
                }
            }

            Thread.sleep(2000);
            driver.findElement(By.xpath("//img[@class='PL5']")).click();
        }

        driver.close();
    }
}
