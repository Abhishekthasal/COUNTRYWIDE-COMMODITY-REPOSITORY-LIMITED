package TestCase;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import TestPages.BaseClass;
import TestPages.LoginPages;

public class Margin_Pledge_TestCase extends BaseClass {

	ExtentReports Report = new ExtentReports(
			"C:\\Users\\abhishekyt\\git\\repository\\Automation\\Reports\\ExtentReport"+ System.currentTimeMillis()+".html",
			true);
	ExtentTest test = Report.startTest("Margin_Pledge_TestCase Report");

	@Test
	void Margin_Pledge() throws IOException {
		try {
			test.log(LogStatus.INFO, "Login for Margin_Pledge start");
			LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("rp-xyz", "user1", "121@test");
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)));
			test.log(LogStatus.INFO, "Margin_Pledge creation  start");
			TestPages.Margin_Pledge_Request Margin = new TestPages.Margin_Pledge_Request(driver, Wait);
			Margin.Margin_Pledge_Request_Maker();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "Margin_Pledge is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			test.log(LogStatus.INFO, "LogOut for Margin_Pledge  Start");
			TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			Log.Logout();
			test.log(LogStatus.INFO, "LogOut for Margin_Pledge  END");
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "Margin_Pledge Test failed");
		}
		Report.endTest(test);
		Report.flush();
	}
}  
