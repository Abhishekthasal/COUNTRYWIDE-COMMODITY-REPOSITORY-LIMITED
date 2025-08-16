package TestPages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShort extends BaseClass {


	public static String CaptureScreen(WebDriver driver) throws IOException {


		File srcfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File Destinationfile =new File("C:\\Users\\eclipse\\Desktop\\Automation-Testing-2025\\Eclipse\\Automation\\ScreenShort\\image"+System.currentTimeMillis()+".png");

		String absolutepath_Screen = Destinationfile.getAbsolutePath();

		FileUtils.copyFile(srcfile, Destinationfile);

		return absolutepath_Screen;
	}
}
