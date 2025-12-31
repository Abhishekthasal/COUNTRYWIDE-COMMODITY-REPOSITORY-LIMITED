package TestPages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
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
	public static int Pledge_Sequence_No = excel.getPledge_Sequence_No_DePledge(dataRow);
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

	@FindBy(xpath = "//button[@title='NOTHING SELECTED']")
	WebElement Exchange_ID_btn;

	@FindBy(xpath = "(//input[@type='text'])[1])")
	WebElement Exchange_ID_txt;
	
	@FindBy(xpath = "//button[@data-id='settle_selection_box']//span[@class='filter-option pull-left'][normalize-space()='Nothing selected']")
	WebElement settle_selection_box_btn;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement settle_selection_box_txt;
	
	@FindBy(xpath = "//button[@data-id='comm_selection_box']//span[@class='filter-option pull-left'][normalize-space()='Nothing selected']")
			WebElement comm_selection_box_btn;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement comm_selection_box_txt;
	
	@FindBy(xpath="//button[@data-id='client_selection_box']")
	WebElement client_selection_box_btn;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement client_selection_box_txt;
	
	@FindBy(xpath="//input[@id='from_date']")
	WebElement from_date_btn;
	
	@FindBy(xpath="//input[@id='to_date']")
	WebElement to_date_btn;
	
	@FindBy(xpath="//span[normalize-space()='Export']")
	WebElement Export_btn;
	
	

	public void CR246_TestCase1() throws InterruptedException {

		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();
		
		
		try {
		//	if(CM_Payout_Transfer_btn.isDisplayed()) {
			Wait.until(ExpectedConditions.elementToBeClickable(CM_Payout_Transfer_btn)).click();
			//}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript CM_Payout_Transfer_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", CM_Payout_Transfer_btn);
		} catch (NoSuchElementException e) {
			System.out.println("CM_Payout_Transfer_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error CM_Payout_Transfer_btn: " + e.getMessage());
		}

		Thread.sleep(1000);
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(New_btn)).click();

		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript New_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", New_btn);
		} catch (NoSuchElementException e) {
			System.out.println("New_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error New_btn: " + e.getMessage());
		}
		// New_btn.click();

		Exchange_ID_btn.click();
		//Thread.sleep(1000);
		Wait.until(ExpectedConditions.elementToBeClickable(Exchange_ID_txt)).sendKeys("11 - MCX");
		//Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);
		
		settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys("21082018256");
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		
		comm_selection_box_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		
		from_date_btn.click();
		
		to_date_btn.click();
		
		Export_btn.click();
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
