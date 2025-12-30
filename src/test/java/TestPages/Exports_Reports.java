package TestPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utillity.ExcelUtils;

public class Exports_Reports {

	
	
	WebDriver driver;
	WebDriverWait Wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	static String path = "C:\\Users\\abhishekyt\\git\\repository\\Automation\\Data\\Margin_Depledge.xlsx";
	static String sheet = "CC Depledge Request";
	static int dataRow = 2; // second row of data
	static ExcelUtils excel = new ExcelUtils(path, sheet);

	long CC_Client_Id_DePledge = excel.getCC_Client_Id_DePledge(dataRow); // 180000110000033L;
	public static  int Pledge_Sequence_No = excel.getPledge_Sequence_No_DePledge(dataRow);
	static String CC_DePledge_Request_No = excel.getCC_DePledge_Request_No(dataRow);
	long ENWR_DePledge = excel.getCC_ENWR_DePledge(dataRow);

	public Exports_Reports(WebDriver driver, WebDriverWait Wait) {

		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='Exports']")
	WebElement Exports_btn;
	
	@FindBy(xpath = "//span[@class='title ng-binding'][normalize-space()='CM Payout Transfer']")
	WebElement CM_Payout_Transfer_btn;
	
	@FindBy(xpath = "//button[normalize-space()='New']")
	WebElement New_btn;
	
	@FindBy(xpath="//button[@title='NOTHING SELECTED']")
	WebElement Exchange_ID_btn;
	
	@FindBy(xpath="(//input[@type='text'])[1])")
	WebElement Exchange_ID_txt;
			
	

	public void CR246_TestCase1() throws InterruptedException {
		
		
		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();
		
		Wait.until(ExpectedConditions.elementToBeClickable(CM_Payout_Transfer_btn)).click();
		
		Thread.sleep(1000);
		//Wait.until(ExpectedConditions.elementToBeClickable(New_btn)).click();
		New_btn.click();
		
		Exchange_ID_btn.click();
		Thread.sleep(1000);
		Wait.until(ExpectedConditions.elementToBeClickable(Exchange_ID_txt)).sendKeys("11 - MCX");
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
	}

	public void CR246_TestCase2() {
	
		
	}

	public void CR246_TestCase3() {
		
		
	}

	public void CR246_TestCase4() {
		
		
	}

	public void CR246_TestCase5() {
		
		
	}

	public void CR246_TestCase6() {
		
		
	}

	public void CR246_TestCase7() {
		
		
	}
	
	
	
	
}
