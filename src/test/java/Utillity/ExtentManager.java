package Utillity;



import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


	public class ExtentManager {
	    public static ExtentReports Report;
	    public static ExtentTest test;

	    public static ExtentReports getExtentReports() {
	        if (Report == null) {
	        	ExtentReports Report = new ExtentReports("C:\\Users\\eclipse\\Desktop\\Automation-Testing-2025\\Eclipse\\Automation\\Reports\\ExtentReport"+System.currentTimeMillis()+".html", true);
	        	test = Report.startTest("ENWR_Generation");
	        }
	        return Report;
	    }
	}






