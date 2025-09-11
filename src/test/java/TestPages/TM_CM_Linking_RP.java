package TestPages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utillity.ExcelUtils;

public class TM_CM_Linking_RP {

	WebDriver driver;
	WebDriverWait Wait;
	static String path = "C:\\Users\\abhishekyt\\git\\repository\\Automation\\Data\\TestData.xlsx";
	static String sheet = "Physical_Deposit_Maker";
	static int dataRow = 1; // second row of data
	static ExcelUtils excel = new ExcelUtils(path, sheet); 

	String RequestNo = excel.getBag_Total_py(dataRow);
	static int CE_CC_Id = excel.gettotalBags(dataRow);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public TM_CM_Linking_RP(WebDriver driver, WebDriverWait Wait) {
		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement Masters_btn;
	
	@FindBy(xpath = "//span[normalize-space()='TM CM Linking']")
	WebElement TM_CM_Linking_bttn;
	
	@FindBy(xpath = "//button[normalize-space()='New']")
	WebElement New_bttn;
	
	@FindBy(xpath = "//input[@name='RequestNo']")
	WebElement RequestNo_txt;
	
	@FindBy(xpath = "//button[@data-id='ClientMasterSelectionCombobox']//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED']")
	WebElement TM_client_ID_drop;
	
	@FindBy(xpath = "(//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED'])[2]")
	WebElement CE_CC_Id_bttn;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement CE_CC_Id_txt;
	
	@FindBy(xpath = "//button[@id='openPick']")
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
	
	
	public void TM_CM_Linking() {
		
		
		Masters_btn.click();
		
		TM_CM_Linking_bttn.click();
		
		New_bttn.click();
		
		RequestNo_txt.sendKeys();
		
		TM_client_ID_drop.click();
		
		CE_CC_Id_bttn.click();
		
		CE_CC_Id_txt.sendKeys(String.valueOf(CE_CC_Id));
		
		openPick_bttn.click();
		
		Search_txt.sendKeys("scscv");

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
