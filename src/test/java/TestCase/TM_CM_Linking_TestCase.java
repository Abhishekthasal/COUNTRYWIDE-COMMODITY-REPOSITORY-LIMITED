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
			test.log(LogStatus.INFO, "CM_Master_File_Upload start");
		  LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("cc8880013", "user1", "121@test");
			CM_Master_File_Upload CM = new CM_Master_File_Upload(driver,Wait);
			CM.CM_Master_File_Upload_CC();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "CM_Master_File_Upload is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			/*
			 * TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			 * Log.Logout();
			 */
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))+ ":CM_Master_File_Upload Test failed" +e.getMessage());
		}
		Report.endTest(test);
		Report.flush();
	}
	
	//@Test
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
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))+ ":TM_CM_Master_File_Upload Test failed"+e.getMessage());
		}
		Report.endTest(test);
		Report.flush();
	}

	//@Test
	  void Account_opening_for_CM() throws IOException {
		try {
			test.log(LogStatus.INFO, "Account_opening_for_CM start");
		  LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("cc8880013", "user1", "121@test");
			TestPages.Client_Account_opening_For_RP CM = new TestPages.Client_Account_opening_For_RP(driver,Wait);
			CM.Account_opening_for_CM();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "Account_opening_for_CM is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			/*
			 * TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			 * Log.Logout();
			 */
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) +e.getMessage() +"Account_opening_for_CM Test failed" );
		}
		Report.endTest(test);
		Report.flush();
	}
	
	//@Test
	  void Account_opening_for_TM () throws IOException {
		try {
			test.log(LogStatus.INFO, "Account_opening_for_TM start");
		  LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("cc8880013", "user1", "121@test");
			TestPages.Client_Account_opening_For_RP CM = new TestPages.Client_Account_opening_For_RP(driver,Wait);
			CM.Account_opening_for_TM();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "Account_opening_for_TM is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			/*
			 * TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			 * Log.Logout();
			 */
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))+e.getMessage() + "Account_opening_for_TM Test failed");
		}
		Report.endTest(test);
		Report.flush();
	}
	
	//@Test
	  void TM_CM_Linking_RP () throws IOException {
		try {
			test.log(LogStatus.INFO, "TM_CM_Linking_RP start");
		  LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("cc8880013", "user1", "121@test");
			TestPages.TM_CM_Linking_RP CM = new TestPages.TM_CM_Linking_RP(driver,Wait);
			CM.TM_CM_Linking();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "TM_CM_Linking_RP is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			/*
			 * TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			 * Log.Logout();
			 */
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) +e.getMessage()+ "TM_CM_Linking_RP Test failed");
		}
		Report.endTest(test);
		Report.flush();
	}
	
	//@Test
	  void ClientCmLinking_RP () throws IOException {
		try {
			test.log(LogStatus.INFO, "ClientCmLinking_RP start");
		  LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("cc8880013", "user1", "121@test");
			TestPages.ClientCmLinking_RP CM = new TestPages.ClientCmLinking_RP(driver,Wait);
			CM.Client_Cm_Linking();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "ClientCmLinking_RP is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			/*
			 * TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			 * Log.Logout();
			 */
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))+e.getMessage() + "ClientCmLinking_RP Test failed");
		}
		Report.endTest(test);
		Report.flush();
	}
	
//	@Test
	  void ClientCmLinking_Verfication () throws IOException {
		try {
			test.log(LogStatus.INFO, "ClientCmLinking_Verfication start");
		  LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("cc8880013", "user1", "121@test");
			TestPages.ClientCmLinking_Verfication CM = new TestPages.ClientCmLinking_Verfication(driver,Wait);
			CM.Client_CM_Linking_Verfication();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "ClientCmLinking_Verfication is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			/*
			 * TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			 * Log.Logout();
			 */
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) +e.getMessage()+ "ClientCmLinking_Verfication Test failed");
		}
		Report.endTest(test);
		Report.flush();
	}
	
	
}
