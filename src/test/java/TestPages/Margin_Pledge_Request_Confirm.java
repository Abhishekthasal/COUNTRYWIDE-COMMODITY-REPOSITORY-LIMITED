package TestPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utillity.ExcelUtils;

public class Margin_Pledge_Request_Confirm {

	WebDriver driver;
	WebDriverWait Wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	static String path = "C:\\Users\\abhishekyt\\git\\repository\\Automation\\Data\\PayIn_PayOut.xlsx";
	static String sheet = "Pay_In_Release";
	static int dataRow = 1; // second row of data
	static ExcelUtils excel = new ExcelUtils(path, sheet);

	public int ce_cc_id_Release = excel.getce_cc_id_Pay_Out_Release(dataRow); // 11;
	

	public Margin_Pledge_Request_Confirm(WebDriver driver, WebDriverWait Wait) {
		
		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);
	}

	// --------------for Request for Margin_Pledge_Request_Confirm creation process-------------
	@FindBy(xpath = "//span[normalize-space()='Transactions']")
	WebElement Transactions_Btn;

	@FindBy(xpath = "//span[@class='title ng-binding'][normalize-space()='PayIn Release']")
	WebElement PayIn_Release_Btn;

	@FindBy(xpath = "//button[normalize-space()='New']")
	WebElement New_Btn;
	
	public void Margin_Pledge_Request_Confirm_Maker() {
		
		
		
		
	}
	
}
