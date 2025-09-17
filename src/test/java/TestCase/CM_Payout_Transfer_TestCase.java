package TestCase;

import java.io.IOException;
import java.time.Duration;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import TestPages.BaseClass;
import TestPages.LoginPages;

public class CM_Payout_Transfer_TestCase extends BaseClass {

	ExtentReports Report = new ExtentReports(
			"C:\\Users\\abhishekyt\\git\\repository\\Automation\\Reports\\ExtentReport"
					+ System.currentTimeMillis() + ".html",
			true);
	ExtentTest test = Report.startTest("Pledge_Creation Report");

	//@Test
	void Pledge_Creation() throws IOException {
		try {
			test.log(LogStatus.INFO, "Login for Pledge_Creation start");
			LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("rp-Abhishek", "user51", "121@test");
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)));
			test.log(LogStatus.INFO, "Pledge_Creation creation  start");
			TestPages.Pledge_Creation Pledge = new TestPages.Pledge_Creation(driver, Wait);
			Pledge.Pledge_Creation_Request();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "Pledge_Creation is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			test.log(LogStatus.INFO, "LogOut for Pledge_Creation Authorized Start");
			TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			Log.Logout();
			test.log(LogStatus.INFO, "LogOut for Pledge_Creation Authorized END");
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "Pledge_Creation Test failed");
		}
		Report.endTest(test);
		Report.flush();
	}

}
