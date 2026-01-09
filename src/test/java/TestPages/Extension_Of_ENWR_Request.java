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

public class Extension_Of_ENWR_Request {

	WebDriver driver;
	WebDriverWait Wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public static String Instr_Slip_No = "9012026A"; 
	public String WSP_ID ="9999996";                //excel.getWspID(dataRow);
	public static String WH_ID ="1000421";    
	public String Client_ID ="100673000000011";            //excel.getClientID(dataRow);//excel.getWhID(dataRow);// "5750013";
	public static String Commodity_Code ="15"; // excel.getCommodityCode(dataRow);
	public String ENWR= "110001018669";

	public Extension_Of_ENWR_Request(WebDriver driver, WebDriverWait Wait) {
		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[normalize-space()='Transactions']")
	WebElement Transactions_Btn;

	@FindBy(xpath = "//span[normalize-space()='Extension Of Validity Request']")
	WebElement Extension_Of_Validity_Request_Btn;

	@FindBy(xpath = "//button[normalize-space()='New']")
	WebElement New_Btn;

	@FindBy(xpath = "//input[@name='Instr_Slip_No']")
	WebElement Instr_Slip_No_Txt;

	@FindBy(xpath = "//input[@id='Request_Date']")
	WebElement Request_Date_Txt;

	@FindBy(xpath = "//td[@class='today active start-date active end-date in-range available']")
	WebElement Todays_Date;

	@FindBy(xpath = "//input[@id='Execution_Date']")
	WebElement Execution_Date_Txt;

	@FindBy(xpath = "(//td[@class='today active start-date active end-date available'])[2]")
	WebElement Execution_Date_value;

	@FindBy(xpath = "//button[@data-id='WspMasterSelectionCombobox']//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED']")
	WebElement WSP_btn;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement WSP_Txt;

	@FindBy(xpath = "//button[@data-id='WhMasterSelectionCombobox']//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED']")
	WebElement WH_Btn;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement WH_Txt;

	@FindBy(xpath = "//span[@class='filter-option pull-left'][normalize-space()='Agricultural']")
	WebElement Agricultural_Btn;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement Agricultural_Txt;

	@FindBy(xpath = "//button[@data-id='CommodityMasterSelectionCombobox']//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED']")
	WebElement CommodityMaster_Btn;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement CommodityMaster_Txt;

	@FindBy(xpath = "//button[@data-id='ClientMasterSelectionCombobox']//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED']")
	WebElement client_Id_Btn;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	WebElement client_Id_Txt;

	@FindBy(xpath = "//button[@id='TransctionStmt']")
	WebElement TransctionStmt_btn;

	@FindBy(xpath = "//div[@class='modal-body']//input[@placeholder='Search...']")
	WebElement Search_Txt;

	@FindBy(xpath = "//button[@ng-click='vm.GetDetails()']")
	WebElement Search_Btn;

	@FindBy(xpath = "(//button[@class='btn btn-default btn-xs'][normalize-space()='Select'])[1]")
	WebElement Select_Btn;

	@FindBy(xpath = "//button[@class='btn btn-primary blue']//span[contains(text(),'Verify')]")
	WebElement Verify_Btn;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	WebElement Save_Btn;

	public void Extension_Of_ENWR_Request_Maker() throws InterruptedException {

		Wait.until(ExpectedConditions.elementToBeClickable(Transactions_Btn)).click();
		Extension_Of_Validity_Request_Btn.click();
		// Wait.until(ExpectedConditions.elementToBeClickable(Extension_Of_Validity_Request_Btn)).click();

		New_Btn.click();

		Instr_Slip_No_Txt.sendKeys(Instr_Slip_No);

		Request_Date_Txt.click();

		Todays_Date.click();

		Execution_Date_Txt.click();
		Todays_Date.click();

		Execution_Date_Txt.click();
		Execution_Date_value.click();
		// Execution_Date_Txt.sendKeys(Keys.ENTER);
		try {
			if (WSP_ID.matches("^[a-zA-Z0-9]{7}$")) {
				Wait.until(ExpectedConditions.elementToBeClickable(WSP_btn)).click();
				Wait.until(ExpectedConditions.elementToBeClickable(WSP_Txt)).sendKeys(WSP_ID);
				Wait.until(ExpectedConditions.elementToBeClickable(WSP_Txt)).sendKeys(Keys.ENTER);
				// WSP_Txt.sendKeys(Keys.ENTER);
			} else {
				System.out.println("Invalid WSP_ID. Please enter exactly 7 alphanumeric characters:");
			}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript click...");
			js.executeScript("arguments[0].click();", WSP_btn);
			js.executeScript("arguments[0].value='" + WSP_ID + "';", WSP_Txt);
			js.executeScript("arguments[0].click();", WSP_Txt);
			// WSP_ID_txt.click();
		} catch (NoSuchElementException e) {
			System.out.println("WSP_ID_btn not found: " + e.getMessage());

		} catch (Exception e) {
			System.out.println("Unexpected error for WSP_ID_btn: " + e.getMessage());
		}
		try {
			if (WH_Btn.isDisplayed()) {
				if (WH_ID.matches("^[a-zA-Z0-9]{7}$")) {
					Wait.until(ExpectedConditions.elementToBeClickable(WH_Btn)).click();
					Wait.until(ExpectedConditions.elementToBeClickable(WH_Txt)).sendKeys(WH_ID);
					Thread.sleep(1000);
					WH_Txt.sendKeys(Keys.ENTER);
				}
			}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript WH_ID_Btn click...");
			js.executeScript("arguments[0].scrollIntoView(true)", WH_Btn);
			js.executeScript("arguments[0].click();", WH_Btn);
			js.executeScript("arguments[0].value='" + WH_ID + "';", WH_Txt);
			js.executeScript("arguments[0].click();", WH_Txt);
// AC.click();
		} catch (NoSuchElementException e) {
			System.out.println("WH_ID_Btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for WH_ID_Btn: " + e.getMessage());
		}

		Agricultural_Btn.click();
		Agricultural_Txt.sendKeys("Agricultural");
		Agricultural_Txt.sendKeys(Keys.ENTER);
		
		CommodityMaster_Btn.click();
		CommodityMaster_Txt.sendKeys(Commodity_Code);
		CommodityMaster_Txt.sendKeys(Keys.ENTER);
		
		
		client_Id_Btn.click();
		client_Id_Txt.sendKeys(Client_ID);
		client_Id_Txt.sendKeys(Keys.ENTER);
		
		
		TransctionStmt_btn.click();

		Search_Txt.sendKeys(ENWR);
		Search_Btn.click();

		Select_Btn.click();

		Thread.sleep(1000);
		try {
			if (Verify_Btn.isDisplayed()) {
				Verify_Btn.click();
			}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript verify_btn click...");
			js.executeScript("arguments[0].click();", Verify_Btn);
		} catch (NoSuchElementException e) {
			System.out.println("verify_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for verify_btn: " + e.getMessage());
		}

		try {
			if (Save_Btn.isDisplayed()) {
				Save_Btn.click();
			} else {
				System.out.println("We are unable to click the save button");
			}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript save_btn click...");
			js.executeScript("arguments[0].click();", Save_Btn);
		} catch (NoSuchElementException e) {
			System.out.println("save_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for save_btn: " + e.getMessage());
		}

	}

}
