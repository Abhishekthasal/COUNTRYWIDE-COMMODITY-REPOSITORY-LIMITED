package TestPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utillity.ExcelUtils;

public class CM_RePledge_Request {
	
	WebDriver driver;
	WebDriverWait Wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	static String path = "C:\\Users\\abhishekyt\\git\\repository\\Automation\\Data\\Margin_Pledge.xlsx";
	static String sheet = "Margin_Pledge_Request";
	static int dataRow = 1; // second row of data
	static ExcelUtils excel = new ExcelUtils(path, sheet);

	// public int ce_cc_id_Release = excel.getce_cc_id_Pay_Out_Release(dataRow); //


	long Client_Id = 100673000019391L;


//100673000019391
	public CM_RePledge_Request(WebDriver driver, WebDriverWait Wait) {

		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);
	}

	// --------------for Request for Margin_Pledge_Request creation
	// process-------------

	@FindBy(xpath = "//span[normalize-space()='Margin Pledge']")
	WebElement Margin_Pledge_Btn;

	@FindBy(xpath = "//span[@class='title ng-binding'][normalize-space()='TM Re-Pledge Request Confirm']")
	WebElement TM_RePledge_Request_Confirm_Btn;


	public void CM_RePledge_Request_Maker() {
		// TODO Auto-generated method stub
		
	}


}
