package TestPages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utillity.ExcelUtils;

public class Margin_Pledge_Request {

	WebDriver driver;
	WebDriverWait Wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	static String path = "C:\\Users\\abhishekyt\\git\\repository\\Automation\\Data\\Margin_Pledge.xlsx";
	static String sheet = "Margin_Pledge_Request";
	static int dataRow = 1; // second row of data
	static ExcelUtils excel = new ExcelUtils(path, sheet);

	//public int ce_cc_id_Release = excel.getce_cc_id_Pay_Out_Release(dataRow); // 11;
	public static String Margin_pledge_Req_No = "67676767";
	long Client_Id = 155000010000027L;
	String ucc_Id = "PR269MARGin";
	String tm_Id = "TM23213";
	String cm_Id = "CM23213";
	String ceccId = "11";
	int WHID = 1000421;
	String CommoditySeg = "Agricultural";
	int Commodity = 15;
	long ENWR = 110000005360L;
	int no_of_bags = 50; 

	public Margin_Pledge_Request(WebDriver driver, WebDriverWait Wait) {

		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);
	}

	// --------------for Request for Margin_Pledge_Request creation
	// process-------------

	@FindBy(xpath = "//span[normalize-space()='Margin Pledge']")
	WebElement Margin_Pledge_Btn;

	@FindBy(xpath = "//span[@class='title ng-binding'][normalize-space()='Margin Pledge Request']")
	WebElement Margin_Pledge_Request_Btn;

	@FindBy(xpath = "//button[normalize-space()='New']")
	WebElement New_Btn;

	@FindBy(xpath = "//input[@name='pledge_Req_No']")
	WebElement Margin_pledge_Req_No_txt;

	@FindBy(xpath = "//input[@name='execution_Date']")
	WebElement execution_Date_btn;

	@FindBy(xpath = "//td[@class='today active start-date active end-date in-range available']")
	WebElement Today_date;

	@FindBy(xpath = "//button[@id='s']")
	WebElement CLIENT_PICK_LIST_Btn;

	@FindBy(xpath = "//div[@class='modal-body']//input[@placeholder='Search...']")
	WebElement Search_Txt;

	@FindBy(xpath = "//button[@ng-click='vm.GetDetails()']")
	WebElement Search_Btn;

	@FindBy(xpath = "//button[normalize-space()='Select']")
	WebElement Select_Btn;

	@FindBy(xpath = "//button[@data-id='ucc']//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED']")
	WebElement ucc_Id_Btn;

	@FindBy(xpath = "(//input[@type='text'])[14]")
	WebElement ucc_Id_Txt;

	@FindBy(xpath = "//button[@data-id='tm_IdCombobox']//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED']")
	WebElement tm_IdCombobox_Btn;

	@FindBy(xpath = "(//input[@type='text'])[16]")
	WebElement tm_IdCombobox_Txt;

	@FindBy(xpath = "//button[@data-id='cm_IdCombobox']")
	WebElement cm_IdCombobox_Btn;

	@FindBy(xpath = "(//input[@type='text'])[18]")
	WebElement cm_IdCombobox_Txt;

	@FindBy(xpath = "//button[@data-id='ceccIdCombobox']//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED']")
	WebElement ceccIdCombobox_Btn;

	@FindBy(xpath = "(//input[@type='text'])[20]")
	WebElement ceccIdCombobox_Txt;

	@FindBy(xpath = "//button[@data-id='WhMasterSelectionCombobox']//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED']")
	WebElement WhMasterSelection_Btn;

	@FindBy(xpath = "(//input[@type='text'])[23]")
	WebElement WhMasterSelection_Txt;

	@FindBy(xpath = "//button[@data-id='CommoditySegSelectionCombobox']//span[@class='filter-option pull-left']")
	WebElement CommoditySegSelectionCombobox_btn;

	@FindBy(xpath = "(//input[@type='text'])[30]")
	WebElement CommoditySegSelectionCombobox_Txt;

	@FindBy(xpath = "//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED']")
	WebElement Commodity_Btn;

	@FindBy(xpath = "(//input[@type='text'])[31]")
	WebElement Commodity_Txt;

	@FindBy(xpath = "//input[@id='eff_Start_date']")
	WebElement eff_Start_date_Btn;

	@FindBy(xpath = "//button[@id='TransctionStmt']")
	WebElement TransctionStmt_Btn;

	@FindBy(xpath = "//input[@name='no_of_bags']")
	WebElement no_of_bags_Txt;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	WebElement Save_Btn;

	public void Margin_Pledge_Request_Maker() throws InterruptedException {

		Margin_Pledge_Btn.click();

		Margin_Pledge_Request_Btn.click();

		New_Btn.click();

		Margin_pledge_Req_No_txt.sendKeys(Margin_pledge_Req_No);

		execution_Date_btn.click();

		Today_date.click();

		CLIENT_PICK_LIST_Btn.click();

		Search_Txt.sendKeys(String.valueOf(Client_Id));

		Search_Btn.click();

		Select_Btn.click();

		ucc_Id_Btn.click();
		ucc_Id_Txt.sendKeys(ucc_Id);
		ucc_Id_Txt.sendKeys(Keys.ENTER);

		tm_IdCombobox_Btn.click();
		tm_IdCombobox_Txt.sendKeys(tm_Id);
		tm_IdCombobox_Txt.sendKeys(Keys.ENTER);

		cm_IdCombobox_Btn.click();
		cm_IdCombobox_Txt.sendKeys(cm_Id);
		cm_IdCombobox_Txt.sendKeys(Keys.ENTER);

		ceccIdCombobox_Btn.click();
		ceccIdCombobox_Txt.sendKeys(ceccId);
		ceccIdCombobox_Txt.sendKeys(Keys.ENTER);

		WhMasterSelection_Btn.click();
		WhMasterSelection_Txt.sendKeys(String.valueOf(WHID));
		WhMasterSelection_Txt.sendKeys(Keys.ENTER);

		CommoditySegSelectionCombobox_btn.click();
		CommoditySegSelectionCombobox_Txt.sendKeys(CommoditySeg);
		CommoditySegSelectionCombobox_Txt.sendKeys(Keys.ENTER);

		Commodity_Btn.click();
		Commodity_Txt.sendKeys(String.valueOf(Commodity));
		Commodity_Txt.sendKeys(Keys.ENTER);

		eff_Start_date_Btn.click();
		Today_date.click();

		TransctionStmt_Btn.click();

		Search_Txt.sendKeys(String.valueOf(ENWR));

		Search_Btn.click();

		Select_Btn.click();
		Thread.sleep(2000);
		no_of_bags_Txt.sendKeys(String.valueOf(no_of_bags));

		try {
			if (Save_Btn.isDisplayed()) {
				Save_Btn.click();
			} else {
				System.out.println("We are unable to click the Save_Btn button");
			}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Save_Btn click...");
			js.executeScript("arguments[0].click();", Save_Btn);
		} catch (NoSuchElementException e) {
			System.out.println("Save_Btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for Save_Btn: " + e.getMessage());
		}

	}

}
