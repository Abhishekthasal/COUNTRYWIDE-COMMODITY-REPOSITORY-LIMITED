package TestCase;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import TestPages.BaseClass;
import TestPages.Exports_Reports;
import TestPages.LoginPages;

public class CR212_TestCase extends BaseClass {

	ExtentReports Report = new ExtentReports("C:\\Users\\abhishekyt\\git\\repository\\Automation\\Reports\\ExtentReport_CR246_"
			+ System.currentTimeMillis() + ".html", true);
	ExtentTest test = Report.startTest("CR212");

	@Test
	void Test_Case1() throws IOException {
		try {
			test.log(LogStatus.INFO, "CR212_TestCase is  start");
			LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("wsp9999996", "user72", "121@test");
			//Login.PortalLogin("", "admin", "121@test");
			Exports_Reports Test_Case1 = new Exports_Reports(driver, Wait);
			Test_Case1.CR212_TestCase1();
			test.log(LogStatus.PASS,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "CR212_TestCase is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			Log.Logout();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "CR212_TestCase failed :"
					+ e.getMessage());
		}
		Report.endTest(test);
		Report.flush();
	} 

}
