package Utillity;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener, ISuiteListener {

	//TestNG Listeners are used only in XMl files not for normal class
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("********* Test started : "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("********* Test is sucessful : "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("********* Test failed : "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("********* Test skipped : "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("********* Tests Completed : "+context.getName());

	}

	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub

	}

}