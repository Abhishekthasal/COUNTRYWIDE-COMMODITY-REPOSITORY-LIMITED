package TestPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utillity.ExcelUtils;

public class DePledge_Confirm_By_Pledgee {

	WebDriver driver;
	WebDriverWait Wait;
	static String path = "C:\\Users\\abhishekyt\\git\\repository\\Automation\\Data\\PlageData.xlsx";
	static String sheet = "DPlageRequest";
	static int dataRow = 1; // second row of data
	static ExcelUtils excel = new ExcelUtils(path, sheet);
	
	
	int pledge_Cls_Confrim_Req_No = excel.getpledge_Cls_Confrim_Req_No(dataRow);
	int pledge_value = excel.getpledge_value_d(dataRow);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public DePledge_Confirm_By_Pledgee(WebDriver driver, WebDriverWait Wait) {
		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);
	}

	// --------------for Request for Depledge_Request creation process-------------
	@FindBy(xpath = "//span[normalize-space()='Transactions']")
	WebElement Transaction_Btn;
	@FindBy(xpath = "//span[@class='title ng-binding'][normalize-space()='Depledge Confirm By Pledgee']")
	WebElement Depledge_Confirm_By_Pledgee_Button;
	@FindBy(xpath="//button[normalize-space()='New']")
	WebElement New_Button;
	@FindBy(xpath = "//input[@name='client_id' and @ng-model='vm.CreatePledgeClosure.client_id']")
	WebElement Pledgor_Client_ID_txt;
	@FindBy(xpath = "//input[@name='pledge_Seq_No']")
	WebElement pledge_Seq_No_txt;
	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement Search_txt;
	@FindBy(xpath = "//button[normalize-space()='Select']")
	WebElement Select;
	@FindBy(xpath="//input[@name='pledge_Cls_Confrim_Req_No']")
	WebElement pledge_Cls_Confrim_Req_No_txt;
	@FindBy(xpath="//input[@name='pledge_value1']")
	WebElement pledge_value_txt;
	@FindBy(xpath="//button[@ng-show='!PledgeClosureForm.$invalid']")
	WebElement verify_button;
	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement save_button;
	
	
	
	
	public void DePledge_Confirm_By_Pledgee_Maker() {
	
		Transaction_Btn.click();
		
		Depledge_Confirm_By_Pledgee_Button.click();
		
		New_Button.click();
		
		Pledgor_Client_ID_txt.sendKeys(String.valueOf(Depledge_Request.Pledgor_Client_ID));
		
		pledge_Seq_No_txt.sendKeys(String.valueOf(Depledge_Request.pledge_Seq_No));
		
		Search_txt.click();
		
		Select.click();
		
		pledge_Cls_Confrim_Req_No_txt.sendKeys(String.valueOf(pledge_Cls_Confrim_Req_No));
		
		pledge_value_txt.sendKeys(String.valueOf(pledge_value));
		
		if(verify_button.isDisplayed()) {
			verify_button.click();
			}else {
				System.out.println("verify_button is not visible");
			}
			
			if(save_button.isDisplayed()) {
			save_button.click();
			}else {
				System.out.println("save_button is not visible");
			}
		
		
	}
	
}
