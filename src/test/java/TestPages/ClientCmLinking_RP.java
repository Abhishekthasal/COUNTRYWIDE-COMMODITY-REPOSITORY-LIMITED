package TestPages;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utillity.ExcelUtils;

public class ClientCmLinking_RP {

	WebDriver driver;
	WebDriverWait Wait;
	static String path = "C:\\Users\\abhishekyt\\git\\repository\\Automation\\Data\\TM_CM_Linking.xlsx";
	static String sheet = "ClientCmLinking_RP";
	static int dataRow = 1; // second row of data
	static ExcelUtils excel = new ExcelUtils(path, sheet);

	String RequestNo = excel.getRequestNo_ClientCmLinking(dataRow);
	static int UCC_ID = excel.getUCC_ID(dataRow);
	long  Client_Id=excel.getClient_Id_ClientCmLinking(dataRow);
	int TMID = excel.getTMID_ClientCmLinking(dataRow);
	int j = 3;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public ClientCmLinking_RP(WebDriver driver, WebDriverWait Wait) {
		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement Masters_btn;

	// span[normalize-space()='Client CM Linking']
	@FindBy(xpath = "//span[normalize-space()='Client CM Linking']")
	WebElement Client_CM_Linking_bttn;

	@FindBy(xpath = "//button[normalize-space()='New']")
	WebElement New_bttn;

	@FindBy(xpath = "//input[@name='RequestNo']")
	WebElement RequestNo_txt;
	
	@FindBy(xpath="//input[@id='Request_Date']")
	WebElement Request_Date_bttn;
	
	@FindBy(xpath = "//td[@class='today active start-date active end-date available']")
	WebElement Today_dates;
	//(//td[@class='today weekend active start-date active end-date available'])[1]
	//td[@class='today weekend active start-date active end-date available']
	@FindBy(xpath = "//td[@class='today weekend active start-date active end-date available']")
	WebElement WeekEnd_Date;
	
	@FindBy(xpath="//button[@title='NOTHING SELECTED']")
	WebElement Client_Id_bttn;
	
	@FindBy(xpath="//input[@class='form-control']")
	WebElement Client_Id_txt;
	
	@FindBy(xpath="//input[@name='ucc']")
	WebElement UCC_txt;
	
	@FindBy(xpath="(//button[normalize-space()='...'])[1]")
	WebElement openPick_bttn;
	
	@FindBy(xpath = "//div[contains(@class,'modal-body')]//input[contains(@placeholder,'Search...')]")
	WebElement Search_txt;

	@FindBy(xpath = "//button[contains(@ng-click,'vm.GetDetails()')]")
	WebElement Search_bttn;

	@FindBy(xpath = "(//button[contains(@ng-click,'grid.appScope.selectItem(row.entity)')][normalize-space()='Select'])[1]")
	WebElement Select_bttn;
	
	@FindBy(xpath = "//button[@class='btn btn-primary blue']//span[contains(text(),'Verify Fields')]")
	WebElement Verify_Button;
	
	@FindBy(xpath = "//i[@class='fa fa-save']")
	WebElement Save_Button;
	
	

	public void Client_Cm_Linking() {

		try {
		Wait.until(ExpectedConditions.elementToBeClickable(Masters_btn)).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Transaction_btn click...");
			js.executeScript("arguments[0].click();", Masters_btn);
		} catch (NoSuchElementException e) {
			System.out.println("Transaction_Btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for Transaction_Btn: " + e.getMessage());
		}
		
		Client_CM_Linking_bttn.click();

		New_bttn.click();

		RequestNo_txt.sendKeys(RequestNo);
		
		Request_Date_bttn.click();
		
		DayOfWeek today = LocalDateTime.now().getDayOfWeek();
		if (today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY) {
		    // Click on Weekend date button
		    WebElement weekendButton = Wait.until(ExpectedConditions.elementToBeClickable(WeekEnd_Date));
		    weekendButton.click();
		    System.out.println("Weekend button clicked");
		} else {
		    // Click on Today date button
		    WebElement todayButton = Wait.until(ExpectedConditions.elementToBeClickable(Today_dates));
		    todayButton.click();
		    System.out.println("Today date button clicked");
		}
		
		Client_Id_bttn.click();
		Client_Id_txt.sendKeys(String.valueOf(Client_Id));
		Client_Id_txt.click();
		
		UCC_txt.sendKeys(String.valueOf(UCC_ID));
		
		openPick_bttn.click();
		
		Search_txt.sendKeys();

		Search_bttn.click();

		Select_bttn.click();
		
		try {
			if (Verify_Button.isEnabled()) {
				Verify_Button.click();
			} else {
				System.out.println("Verify_Button is not enable");
			}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Verify_Button click...");
			js.executeScript("arguments[0].click();", Verify_Button);
		} catch (NoSuchElementException e) {
			System.out.println("save_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for save_btn: " + e.getMessage());
		}

		try {
			if (Save_Button.isDisplayed()) {
				Save_Button.click();
			} else {
				System.out.println("Save_Button is not Visible ");
			}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript save_btn click...");
			js.executeScript("arguments[0].click();", Save_Button);
		} catch (NoSuchElementException e) {
			System.out.println("save_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for save_btn: " + e.getMessage());
		}
		
	}

}
