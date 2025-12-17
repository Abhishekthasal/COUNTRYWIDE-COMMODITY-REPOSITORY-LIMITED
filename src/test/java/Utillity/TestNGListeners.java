package Utillity;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import TestPages.BaseClass;
import com.relevantcodes.extentreports.LogStatus;
import TestPages.ScreenShort;

public class TestNGListeners extends BaseClass implements ITestListener, ISuiteListener {

	private static ExtentReports Report = ExtentManager.getExtentReports();
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

	// TestNG Listeners are used only in XMl files not for normal class

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("********* Test started : " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("********* Test is sucessful : " + result.getName());
	}

	/*
	 * @Override public void onTestFailure(ITestResult result) { String
	 * screenshotPath = null; try { screenshotPath =
	 * ScreenShort.CaptureScreen(driver, result.getMethod().getMethodName()); }
	 * catch (IOException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } if (test.get() == null) { ExtentTest extentTest =
	 * Report.startTest(result.getMethod().getMethodName()); test.set(extentTest); }
	 * test.get().log(LogStatus.FAIL, result.getThrowable()); if (screenshotPath !=
	 * null) { test.get().addScreenCapture(screenshotPath); } }
	 */
	@Override public void onTestFailure(ITestResult result) { 
		Object testClass =result.getInstance();
		WebDriver driver = ((BaseClass) testClass).driver; //
	
	  
	  String screenshotPath = null;
	  
	  try {
		  screenshotPath = ScreenShort.CaptureScreen(driver,
	  result.getMethod().getMethodName()); 
	  } 
	  catch (IOException e) { 
		  e.printStackTrace(); 
	  }
	  test.get().log(LogStatus.FAIL, result.getThrowable());
	  
	  if (screenshotPath != null) {
		  
		  test.get().addScreenCapture(screenshotPath); 
		  }
	  System.out.println("********* Test failed : " + result.getName());
	  
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("********* Test skipped : " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("********* Tests TestFailedButWithinSuccessPercentage : " + result.getName());

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("********* Tests started : " + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {

		System.out.println("********* Tests Completed : " + context.getName());
		if (Report != null) {
			Report.flush(); // ✅ SAFE CALL
			Report.close();
		}

	}

	@Override
	public void onStart(ISuite suite) {

		System.out.println("********* Test started : " + suite.getName());

	}

	@Override
	public void onFinish(ISuite suite) {

		System.out.println("********* Test Finished : " + suite.getName());
		if (Report != null) {
			Report.flush(); // ✅ SAFE CALL
			Report.close();
		}

	}

}