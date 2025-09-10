package TestCase;

import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import TestPages.BaseClass;
import TestPages.CM_Master_File_Upload;
import TestPages.Client_Account_opening_For_RP;
import TestPages.LoginPages;

public class TM_CM_Linking_TestCase extends BaseClass {
	
	ExtentReports Report = new ExtentReports(
			"C:\\Users\\abhishekyt\\git\\repository\\Automation\\Reports\\ExtentReport"
					+ System.currentTimeMillis() + ".html",
			true);
	ExtentTest test = Report.startTest("TM_CM_Linking");
	
	@Test
	  void CM_Master_File_Upload () throws IOException {
		try {
			test.log(LogStatus.INFO, "TM_CM_Linking start");
		  LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("cc8880013", "user1", "121@test");
			CM_Master_File_Upload CM = new CM_Master_File_Upload(driver,Wait);
			CM.CM_Master_File_Upload_CC();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "TM_CM_Linking is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			/*
			 * TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			 * Log.Logout();
			 */
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "TM_CM_Linking Test failed");
		}
		Report.endTest(test);
		Report.flush();
	}
	
	@Test
	  void TM_CM_Master_File_Upload () throws IOException {
		try {
			test.log(LogStatus.INFO, "TM_CM_Master_File_Upload start");
		  LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("cc8880013", "user1", "121@test");
			TestPages.TM_CM_Master_File_Upload CM = new TestPages.TM_CM_Master_File_Upload(driver,Wait);
			CM.TM_CM_Master_File_Upload_CC();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "TM_CM_Master_File_Upload is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			/*
			 * TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			 * Log.Logout();
			 */
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "TM_CM_Master_File_Upload Test failed");
		}
		Report.endTest(test);
		Report.flush();
	}

}
