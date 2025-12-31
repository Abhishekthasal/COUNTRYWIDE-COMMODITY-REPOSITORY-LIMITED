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

public class CR246_TestCase extends BaseClass {

	ExtentReports Report = new ExtentReports("C:\\Users\\abhishekyt\\git\\repository\\Automation\\Reports\\ExtentReport_CR246_"
			+ System.currentTimeMillis() + ".html", true);
	ExtentTest test = Report.startTest("CR246");

	@Test
	void Test_Case1() throws IOException {
		try {
			test.log(LogStatus.INFO, "Test_Case1 is  start");
			LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("", "admin", "121@test");
			Exports_Reports Test_Case1 = new Exports_Reports(driver, Wait);
			Test_Case1.CR246_TestCase1();
			test.log(LogStatus.PASS,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "CR246_TestCase1 is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			Log.Logout();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "Test failed :"
					+ e.getMessage());
		}
		Report.endTest(test);
		Report.flush();
	}

	//@Test
	void Test_Case2() throws IOException {
		try {
			test.log(LogStatus.INFO, "Test_Case2 is start");
			LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("rp-Abhishek", "user51", "121@test");
			Exports_Reports Test_Case2 = new Exports_Reports(driver, Wait);
			Test_Case2.CR246_TestCase2();
			test.log(LogStatus.PASS,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "Test_Case2 is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			Log.Logout();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "Test failed"
					+ e.getMessage());
		}
		Report.endTest(test);
		Report.flush();
	}

	//@Test
	void Test_Case3() throws IOException {
		try {
			test.log(LogStatus.INFO, "Client Account Opening for REPOSITORY start");
			LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("rp-Abhishek", "user51", "121@test");
			Exports_Reports Test_Case3 = new Exports_Reports(driver, Wait);
			Test_Case3.CR246_TestCase3();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "Client Account Opening for REPOSITORY is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			Log.Logout();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "Test failed"
					+ e.getMessage());
		}
		Report.endTest(test);
		Report.flush();
	}

	//@Test
	void Test_Case4() throws IOException {
		try {
			test.log(LogStatus.INFO, "Client Account Opening for REPOSITORY start");
			LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("rp-Abhishek", "user51", "121@test");
			Exports_Reports Test_Case4 = new Exports_Reports(driver, Wait);
			Test_Case4.CR246_TestCase4();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "Client Account Opening for REPOSITORY is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			Log.Logout();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "Test failed"
					+ e.getMessage());
		}
		Report.endTest(test);
		Report.flush();
	}

	//@Test
	void Test_Case5() throws IOException {
		try {
			test.log(LogStatus.INFO, "Client Account Opening for REPOSITORY start");
			LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("rp-Abhishek", "user51", "121@test");
			Exports_Reports Test_Case5 = new Exports_Reports(driver, Wait);
			Test_Case5.CR246_TestCase5();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "Client Account Opening for REPOSITORY is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			Log.Logout();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "Test failed"
					+ e.getMessage());
		}
		Report.endTest(test);
		Report.flush();
	}

	//@Test
	void Test_Case6() throws IOException {
		try {
			test.log(LogStatus.INFO, "Client Account Opening for REPOSITORY start");
			LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("rp-Abhishek", "user51", "121@test");
			Exports_Reports Test_Case6 = new Exports_Reports(driver, Wait);
			Test_Case6.CR246_TestCase6();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "Client Account Opening for REPOSITORY is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			Log.Logout();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "Test failed"
					+ e.getMessage());
		}
		Report.endTest(test);
		Report.flush();
	}

	//@Test
	void Test_Case7() throws IOException {
		try {
			test.log(LogStatus.INFO, "Client Account Opening for REPOSITORY start");
			LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("rp-Abhishek", "user51", "121@test");
			Exports_Reports Test_Case7 = new Exports_Reports(driver, Wait);
			Test_Case7.CR246_TestCase7();
			test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					+ "Client Account Opening for REPOSITORY is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			Log.Logout();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + "Test failed"
					+ e.getMessage());
		}
		Report.endTest(test);
		Report.flush();
	}

}
