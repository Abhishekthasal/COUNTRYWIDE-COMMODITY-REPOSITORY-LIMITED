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

	//@Test
	void Margin_Pledge() throws IOException {
		try {
			test.log(LogStatus.INFO, "Login for Margin_Pledge start");
			LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("rp-Abhishek", "user52", "121@test");
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
	
	
	//@Test
	void Margin_Pledge_Checker() throws IOException {
		try {
			test.log(LogStatus.INFO, "Login for Margin_Pledge_Checker start");
			LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("rp-Abhishek", "user51", "121@test");
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)));
			test.log(LogStatus.INFO, "Margin_Pledge_Checker creation  start");
			TestPages.Margin_Pledge_Checker Margin = new TestPages.Margin_Pledge_Checker(driver, Wait);
			Margin.Margin_Pledge_Request_Checker();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "Margin_Pledge_Checker is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			test.log(LogStatus.INFO, "LogOut for Margin_Pledge_Checker  Start");
			TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			Log.Logout();
			test.log(LogStatus.INFO, "LogOut for Margin_Pledge_Checker  END");
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "Margin_Pledge_Checker Test failed");
		}
		Report.endTest(test);
		Report.flush();
	}
	
	@Test
	void Margin_Pledge_Request_Confirm() throws IOException {
		try {
			test.log(LogStatus.INFO, "Login for Margin_Pledge_Request_Confirm start");
			LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("Wsp9999996", "user71", "121@test");
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)));
			test.log(LogStatus.INFO, "Margin_Pledge_Request_Confirm creation  start");
			TestPages.Margin_Pledge_Request_Confirm Margin = new TestPages.Margin_Pledge_Request_Confirm(driver, Wait);
			Margin.Margin_Pledge_Request_Confirm_Maker();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "Margin_Pledge_Request_Confirm is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			test.log(LogStatus.INFO, "LogOut for Margin_Pledge_Checker  Start");
			TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			Log.Logout();
			test.log(LogStatus.INFO, "LogOut for Margin_Pledge_Request_Confirm  END");
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "Margin_Pledge_Request_Confirm Test failed");
		}
		Report.endTest(test);
		Report.flush();
	}
	
	
}  
