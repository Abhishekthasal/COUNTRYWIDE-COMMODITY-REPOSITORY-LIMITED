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

public class Settlement_Master_CC_Login {

	WebDriver driver;
	WebDriverWait Wait;

	static String path = "C:\\Users\\abhishekyt\\git\\repository\\Automation\\Data\\ON_Market.xlsx";
	static String sheet = "Settlement";
	static int dataRow = 1; // second row of data
	static ExcelUtils excel = new ExcelUtils(path, sheet);

	String ExchangeMaster =excel.getExchangeMaster(dataRow);  
	int Settlement_Type = excel.getSettlement_Type(dataRow);
	int settlement_No = excel.getsettlement_No(dataRow);
	int settlement_Year = excel.getsettlement_Year(dataRow);
	String expiry_Date = excel.getexpiry_Date(dataRow);
	String trade_Start_Date = excel.gettrade_Start_Date(dataRow);
	

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public Settlement_Master_CC_Login(WebDriver driver, WebDriverWait Wait) {
		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);
	}

	// --------------for Request for Depledge_Request creation process-------------
	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement Masters_Btn;

	@FindBy(xpath = "(//span[@class='title ng-binding'][normalize-space()='Settlement'])[1]")
	WebElement Settlement_Btn;

	@FindBy(xpath = "(//button[normalize-space()='New'])[1]")
	WebElement New_btn;

	@FindBy(xpath = "//button[@data-id='ExchangeMasterCombobox']//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED']")
	WebElement ExchangeMasterCombobox_btn;
	// div[@class='btn-group bootstrap-select form-control ng-pristine ng-untouched
	// ng-empty ng-invalid ng-invalid-required dropup open']//input[@type='text']

	@FindBy(xpath = "//div[@class='btn-group bootstrap-select form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required dropup open']//input[@type='text']")
	WebElement ExchangeMasterCombobox_txt;

	@FindBy(xpath = "(//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED'])[1]")
	WebElement Settlement_Type_Btn;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement Settlement_Type_Txt;

	@FindBy(xpath = "(//input[@name='settlement_No'])[1]")
	WebElement settlement_No_txt;

	@FindBy(xpath = "//button[normalize-space()='Ok']")
	WebElement Settlement_pop_Up;

	@FindBy(xpath = "(//input[@name='settlement_Year'])[1]")
	WebElement settlement_Year_txt;

	@FindBy(xpath = "(//button[normalize-space()='Add Commodity Contract'])[1]")
	WebElement Add_Commodity;

	@FindBy(xpath = "//button[@aria-expanded='false']//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED']")
	WebElement COMM_CODE_NAME_btn;

	@FindBy(xpath = "(//input[@id='expiry_Date'])[1]")
	WebElement expiry_Date_txt;

	@FindBy(xpath = "(//input[@id='trade_Start_Date'])[1]")
	WebElement trade_Start_Date_txt;

	public void Settlement_Master() throws InterruptedException {

		Thread.sleep(3000);
		
		if (Masters_Btn.isDisplayed()) {
			Wait.until(ExpectedConditions.elementToBeClickable(Masters_Btn)).click();
		} else {
			System.out.println("Masters_Btn is not visible");
		}

		if (Settlement_Btn.isDisplayed()) {
			Wait.until(ExpectedConditions.elementToBeClickable(Settlement_Btn)).click();
		} else {
			System.out.println("Settlement_Btn is not visible");
		}

		if (New_btn.isDisplayed()) {
			New_btn.click();
		} else {
			System.out.println("New_btn is not visible");
		}

		ExchangeMasterCombobox_btn.click();
		ExchangeMasterCombobox_txt.sendKeys(ExchangeMaster);
		ExchangeMasterCombobox_txt.sendKeys(Keys.ENTER);
		
		Settlement_Type_Btn.click();
		Settlement_Type_Txt.sendKeys(String.valueOf(Settlement_Type));
		Settlement_Type_Txt.sendKeys(Keys.ENTER);
		settlement_No_txt.click();
		settlement_No_txt.sendKeys(String.valueOf(settlement_No));

		try {
			Settlement_pop_Up.click();
		} catch (Exception e) {

			System.out.println("Settlement_pop_Up is not visible");
		}

		settlement_Year_txt.click();
		settlement_Year_txt.sendKeys(String.valueOf(settlement_Year));

		Add_Commodity.click();

		COMM_CODE_NAME_btn.click();

		expiry_Date_txt.sendKeys(String.valueOf(expiry_Date));

		trade_Start_Date_txt.sendKeys(trade_Start_Date);
	}

}
