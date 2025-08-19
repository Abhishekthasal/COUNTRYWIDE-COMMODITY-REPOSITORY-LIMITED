package TestCase;

import java.io.IOException;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import TestPages.BaseClass;
import TestPages.LoginPages;


@Listeners(Utillity.TestNGListeners.class)
public class Withdrawal_TestCase extends BaseClass {

	ExtentReports Report = new ExtentReports(
			"C:\\Users\\eclipse\\Desktop\\Automation-Testing-2025\\Eclipse\\Automation\\Reports\\ExtentReport"
					+ System.currentTimeMillis() + ".html",
			true);
	ExtentTest test = Report.startTest("Withdrawal Report");

	
	@Test
	void Withdrawal() throws IOException { 
		try { 
			test.log(LogStatus.INFO, "RP_Exchange_Deposite_Request_Maker start");
			LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("rp-Abhishek", "user51", "121@test");
			try {
			TestPages.Withdrawal_Function WF = new TestPages.Withdrawal_Function(driver, Wait);
			WF.Withdrawal_Request_RP();
			   Assert.assertTrue(false, "Something went wrong");
		} catch (Exception e) {
		    e.printStackTrace();
		    System.out.println("Error occurred while running Exchange_Non_Agriculture_Physical_Multiple_GSL: " + e.getMessage());
		}
			test.log(LogStatus.PASS, "Withdrawal_Request is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			Log.Logout();
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + e.getMessage());
			//test.log(LogStatus.ERROR, "Error fetching console logs: " + e.getMessage());
		}
		Report.endTest(test);
		Report.flush();
	}
	
	//@Test
	void Withdrawal_checker() throws IOException {
		try {
			test.log(LogStatus.INFO, "Withdrawal_checker start");
			LoginPages Login = new LoginPages(driver, Wait);
			Login.PortalLogin("rp-Abhishek", "user52", "121@test");
			TestPages.Withdrawal_Function_Checker WF = new TestPages.Withdrawal_Function_Checker(driver, Wait);
			WF.Withdrawal_Checker();
			test.log(LogStatus.PASS, /*test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
					*/  "Withdrawal_checker is success full");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
			TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
			Log.Logout();
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + e.getMessage());
		}
		Report.endTest(test);
		Report.flush();
	}

	//@Test
		void Withdrawal_Confirm() throws IOException {
			try {
				test.log(LogStatus.INFO, "Withdrawal_checker start");
				LoginPages Login = new LoginPages(driver, Wait);
				Login.PortalLogin("wsp9999996", "user72", "121@test");
				TestPages.Withdrawal_Confirm_WSP_Maker WF = new TestPages.Withdrawal_Confirm_WSP_Maker(driver, Wait);
				WF.Withdrawal_Confirm_WSP();
				test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
						+ "Withdrawal_checker is success full");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
				TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
				Log.Logout();
			} catch (Exception e) {
				test.log(LogStatus.FAIL,
						test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + e.getMessage());
				test.log(LogStatus.ERROR, "Error fetching console logs: " + e.getMessage());
			}
			Report.endTest(test);
			Report.flush();
		}
		
		@Test
		void Withdrawal_Confirm_checker() throws IOException {
			try {
				test.log(LogStatus.INFO, "Withdrawal_checker start");
				LoginPages Login = new LoginPages(driver, Wait);
				Login.PortalLogin("rp-Abhishek", "user52", "121@test");
				TestPages.Withdrawal_Function_Checker WF = new TestPages.Withdrawal_Function_Checker(driver, Wait);
				WF.Withdrawal_Confirm();
				test.log(LogStatus.PASS, test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver))
						+ "Withdrawal_checker is success full");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
				TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
				Log.Logout();
			} catch (Exception e) {
				test.log(LogStatus.FAIL,
						test.addScreenCapture(TestPages.ScreenShort.CaptureScreen(driver)) + e.getMessage());
			}
			Report.endTest(test);
			Report.flush();
		}
}
