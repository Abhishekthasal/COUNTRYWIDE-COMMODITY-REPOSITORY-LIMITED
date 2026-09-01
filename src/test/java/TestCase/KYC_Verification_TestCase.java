package TestCase;

import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import TestPages.BaseClass;
import TestPages.KYC_Verification;
import TestPages.LoginPages;

public class KYC_Verification_TestCase extends BaseClass {

	ExtentReports Report = new ExtentReports(
			"C:\\Users\\abhishekyt\\git\\repository\\Automation\\Reports\\ExtentReport_CR0425_TestCase_"
					+ System.currentTimeMillis() + ".html",
			true);
	ExtentTest test = Report.startTest("CR0425_TestCase");

	 @Test
	void CR0425_TestCase1() throws IOException {
		try {
			test.log(LogStatus.INFO, "CR0425_TestCase1 is  start");
			LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("wsp9999996", "user72", "121@test");
			// Login.PortalLogin("", "admin", "121@test");
			KYC_Verification Test_Case1 = new KYC_Verification(driver, Wait);
			Test_Case1.KYC_Verification_Process();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "Pledge_Creation_Test_Case1 is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			Log.Logout();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "Pledge_Creation_Test_Case1 failed :" + e.getMessage());
		}
		Report.endTest(test);
		Report.flush();
	}

}
