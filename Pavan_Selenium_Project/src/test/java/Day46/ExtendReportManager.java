package Day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportManager implements ITestListener
{
    public ExtentSparkReporter sparkReporter;   // UI of the report
    public ExtentReports extent;                // Common info for report
    public ExtentTest test;                     // Test case entries

    @Override
    public void onStart(ITestContext context)
    {
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/MyReport.html");

        sparkReporter.config().setDocumentTitle("Automation Report");   // Title of report
        sparkReporter.config().setReportName("Functional Testing");    // Name of report
        sparkReporter.config().setTheme(Theme.DARK);                   // Theme

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("Machine", "Laptop");
        extent.setSystemInfo("OS", "Windows 10");
        extent.setSystemInfo("Browser", "Chrome");
        extent.setSystemInfo("User", "Dilip");
    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
        test = extent.createTest(result.getName());      // Create entry
        test.log(Status.PASS, "Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        test = extent.createTest(result.getName());
        test.log(Status.FAIL, "Test Failed: " + result.getName());
        test.log(Status.FAIL, result.getThrowable());    // Log error
    }

    @Override
    public void onTestSkipped(ITestResult result)
    {
        test = extent.createTest(result.getName());
        test.log(Status.SKIP, "Test Skipped: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context)
    {
        extent.flush();   // Very important → generate report
    }
}
