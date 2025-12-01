package TestCase;

import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import TestPages.BaseClass;
import TestPages.LoginPages;
import TestPages.Pledge_Creation_WareHouse;

public class CR318_Reports_WSPadmin_WH_login_and_Assayer_login_TestCase extends BaseClass {

	ExtentReports Report = new ExtentReports(
			"C:\\Users\\abhishekyt\\git\\repository\\Automation\\Reports\\ExtentReport"
					+ System.currentTimeMillis() + ".html",
			true);
	ExtentTest test = Report.startTest("Client Account Opening for REPOSITORY");
	
	@Test
	  void Pledge_Creation_WareHouse_CR318 () throws IOException {
		try {
			test.log(LogStatus.INFO, "Pledge_Creation_WareHouse for REPOSITORY start");
		  LoginPages Login = new LoginPages(driver, Wait);
			//Login.PortalLogin("rp-Abhishek", "user51", "121@test");
			Login.PortalLogin("WSP9999996", "user71", "121@test");
			Pledge_Creation_WareHouse CR118 = new Pledge_Creation_WareHouse(driver,Wait);
			CR118.Pledge_Creation_WareHouse_Approval_C118();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "Pledge_Creation_WareHouse for REPOSITORY is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			Log.Logout();
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "Test failed for Pledge_Creation_WareHouse"+e.getMessage());
		}
		Report.endTest(test);
		Report.flush();
	} 

}
