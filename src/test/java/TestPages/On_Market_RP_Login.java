package TestPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utillity.ExcelUtils;

public class On_Market_RP_Login {

	WebDriver driver;
	WebDriverWait Wait;
	static String path = "C:\\Users\\eclipse\\Desktop\\Automation-Testing-2025\\Eclipse\\Automation\\Data\\PlageData.xlsx";
	static String sheet = "DPlageRequest";
	static int dataRow = 1; // second row of data
	static ExcelUtils excel = new ExcelUtils(path, sheet);
	
	
	int pledge_Cls_Confrim_Req_No = excel.getpledge_Cls_Confrim_Req_No(dataRow);
	int pledge_value = excel.getpledge_value_d(dataRow);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public On_Market_RP_Login(WebDriver driver, WebDriverWait Wait) {
		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);
	}

	// --------------for Request for Depledge_Request creation process-------------
	@FindBy(xpath = "//span[normalize-space()='Transactions']")
	WebElement Transaction_Btn;
	
	public void On_Market() {
		
		
		
	}
	
}
