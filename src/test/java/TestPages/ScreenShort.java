package TestPages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShort extends BaseClass {


	public static  String CaptureScreen(WebDriver driver) throws IOException {

		   /* String screenshotDir = System.getProperty("user.dir")
		            + "/test-output/screenshots/";

		    , String testName
		    new File(screenshotDir).mkdirs();

		    String screenshotPath = screenshotDir + testName + ".png";

		    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    File dest = new File(screenshotPath);
		    FileUtils.copyFile(src, dest);
 
		    // 🔥 RETURN RELATIVE PATH
		    return "screenshots/" + testName + ".png";
		}*/
		
		/*
		 * String screenshotDir = System.getProperty("user.dir") +
		 * "/test-output/screenshots/";
		 * 
		 * new File(screenshotDir).mkdirs();
		 * 
		 * String screenshotPath = screenshotDir + testName + ".png";
		 * 
		 */
		
		  File srcfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  File Destinationfile =new
		  File("C:\\Users\\abhishekyt\\git\\repository\\Automation\\ScreenShort\\image"
		  +System.currentTimeMillis()+".png");
		  
		  String absolutepath_Screen = Destinationfile.getAbsolutePath();
		  
		  FileUtils.copyFile(srcfile, Destinationfile);
		  
		  return absolutepath_Screen;
		 
	}

	/*
	 * public static String CaptureScreen(WebDriver driver, String methodName)
	 * throws IOException { File srcfile
	 * =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 * 
	 * File Destinationfile =new
	 * File("C:\\Users\\abhishekyt\\git\\repository\\Automation\\ScreenShort\\image"
	 * +System.currentTimeMillis()+".png");
	 * 
	 * String absolutepath_Screen = Destinationfile.getAbsolutePath();
	 * 
	 * FileUtils.copyFile(srcfile, Destinationfile);
	 * 
	 * return absolutepath_Screen; }
	 */
}
