package TestPages;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utillity.ExcelUtils;

public class Settlement_Master_CC_Login {

	WebDriver driver;
	WebDriverWait Wait;

	static String path = "C:\\Users\\abhishekyt\\git\\repository\\Automation\\Data\\ON_Market.xlsx";
	static String sheet = "Settlement";
	static int dataRow = 1; // second row of data
	static ExcelUtils excel = new ExcelUtils(path, sheet);

	String ExchangeMaster = excel.getExchangeMaster(dataRow);
	int Settlement_Type = excel.getSettlement_Type(dataRow);
	static int settlement_No = excel.getsettlement_No(dataRow);
	int settlement_Year = excel.getsettlement_Year(dataRow);
	String commodity = excel.getcommodity(dataRow);
	String expectedDay = excel.getexpectedDay(dataRow);
	String expectedMonth = excel.getexpectedMonth(dataRow);
	String expectedYear = excel.getexpectedYear(dataRow);
	String trade_Day = excel.gettrade_Day(dataRow);
	String trade_Month = excel.gettrade_Month(dataRow);
	String trade_Year = excel.gettrade_Year(dataRow);
	String PostExpiry_Validity = excel.getPostExpiry_Validity_Date(dataRow);
	String PostExpiry_Validity_Month = excel.getPostExpiry_Validity_Month(dataRow);
	String PostExpiry_Validity_Year = excel.getPostExpiry_Validity_Year(dataRow);
	String Delivery_Marking = excel.getDelivery_Marking(dataRow);
	String Delivery_Marking_Month = excel.getDelivery_Marking_Month(dataRow);
	String Delivery_Marking_Year = excel.getDelivery_Marking_Year(dataRow);
	String pay_In_date = excel.getpay_In_date(dataRow);
	String pay_In_Month = excel.getpay_In_Month(dataRow);
	String pay_In_Year = excel.getpay_In_Year(dataRow);
	// String pay_Out_Date=excel.getpay_Out_Date_hr(dataRow);
	int pay_In_Date_hr = excel.getpay_In_Date_hr(dataRow);
	int pay_In_Date_mn = excel.getpay_In_Date_mn(dataRow);
	String pay_out_date = excel.getpay_out_date(dataRow);
	String pay_out_Month = excel.getpay_out_Month(dataRow);
	String pay_out_Year = excel.getpay_out_Year(dataRow);
	int pay_out_Date_hr = excel.getpay_out_Date_hr(dataRow);
	int pay_out_Date_mn = excel.getpay_out_Date_mn(dataRow);
	String early_pay_In_date = excel.getearly_pay_In_date(dataRow);
	String early_pay_In_Month = excel.getearly_pay_In_Month(dataRow);
	String early_pay_In_Year = excel.getearly_pay_In_Year(dataRow);
	int early_pay_In_Date_hr = excel.getearly_pay_In_Date_hr(dataRow);
	int early_pay_In_Date_mn = excel.getearly_pay_In_Date_mn(dataRow);
	String early_Payin_End_date = excel.getearly_Payin_End_date(dataRow);
	String early_Payin_End_Month = excel.getearly_Payin_End_Month(dataRow);
	String early_Payin_End_Year = excel.getearly_Payin_End_Year(dataRow);
	int early_Payin_End_Date_hr = excel.getearly_Payin_End_Date_hr(dataRow);
	int early_Payin_End_Date_mn = excel.getearly_Payin_End_Date_mn(dataRow);

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public Settlement_Master_CC_Login(WebDriver driver, WebDriverWait Wait) {
		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);
	}

	// --------------for Request for Depledge_Request creation process-------------
	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement Masters_Btn;

	@FindBy(xpath = "//a[@ui-sref='Masters.Settlement']//span[@class='title ng-binding'][normalize-space()='Settlement']")
	WebElement Settlement_Btn;

	@FindBy(xpath = "(//button[normalize-space()='New'])[1]")
	WebElement New_btn;

	@FindBy(xpath = "//button[@data-id='ExchangeMasterCombobox']//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED']")
	WebElement ExchangeMasterCombobox_btn;
	// div[@class='btn-group bootstrap-select form-control ng-pristine ng-untouched
	// ng-empty ng-invalid ng-invalid-required dropup open']//input[@type='text']

	@FindBy(xpath = "(//input[@type='text'])[2]")
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

	@FindBy(xpath = "//button[@data-id='CommodityMasterSelectionCombobox']//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED']")
	WebElement COMM_CODE_NAME_btn;
	
	

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement COMM_CODE_NAME_Txt;

	@FindBy(xpath = "(//input[@id='expiry_Date'])[1]")
	WebElement expiry_Date_txt;

	@FindBy(xpath = "(//input[@id='trade_Start_Date'])[1]")
	WebElement trade_Start_Date_txt;
	
	@FindBy(xpath="//td[@class='today active start-date active end-date available']")
	WebElement today_active;

	@FindBy(xpath = "//select[@name='pay_In_Date_hr']")
	WebElement pay_In_Date_hr_s;

	@FindBy(xpath = "//select[@name='pay_In_Date_mn']")
	WebElement pay_In_Date_mn_s;

	@FindBy(xpath = "//select[@name='pay_Out_Date_hr']")
	WebElement pay_Out_Date_hr_s;

	@FindBy(xpath = "//select[@name='pay_Out_Date_mn']")
	WebElement pay_Out_Date_mn_s;

	@FindBy(xpath = "//select[@name='early_pay_In_Date_hr']")
	WebElement early_pay_In_Date_hr_s;

	@FindBy(xpath = "//select[@name='early_pay_In_Date_mn']")
	WebElement early_pay_In_Date_mn_s;

	@FindBy(xpath = "//select[@name='early_Payin_End_Date_hr']")
	WebElement early_Payin_End_Date_hr_s;

	@FindBy(xpath = "//select[@name='early_Payin_End_Date_mn']")
	WebElement early_Payin_End_Date_mn_s;

	@FindBy(xpath = "(//button[normalize-space()='Add To Settelment Details'])[1]")
	WebElement Add_To_Settelment_Details_btn;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	WebElement Save_btn;

	public void Settlement_Master() throws InterruptedException {

		
		try {
			
			Wait.until(ExpectedConditions.elementToBeClickable(Masters_Btn)).click();
			
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying Masters_Btn click...");
			js.executeScript("arguments[0].click();", Masters_Btn);
		} catch (NoSuchElementException e) {
			System.out.println("Masters_Btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for Masters_Btn: " + e.getMessage());
		}
		Thread.sleep(2000);
		try {
			
			Wait.until(ExpectedConditions.elementToBeClickable(Settlement_Btn)).click();
			
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying Settlement_Btn click...");
			js.executeScript("arguments[0].click();", Settlement_Btn);
		} catch (NoSuchElementException e) {
			System.out.println("Settlement_Btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for Settlement_Btn: " + e.getMessage());
		}
		Wait.until(ExpectedConditions.elementToBeClickable(New_btn)).click();
		Thread.sleep(2000);
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(ExchangeMasterCombobox_btn)).click();
			Wait.until(ExpectedConditions.elementToBeClickable(ExchangeMasterCombobox_txt)).sendKeys(ExchangeMaster);
			System.out.println("ExchangeMaster is :" + ExchangeMaster);
			Thread.sleep(1000);
			ExchangeMasterCombobox_txt.sendKeys(Keys.ENTER);
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying ExchangeMasterCombobox_btn click...");
			js.executeScript("arguments[0].click();", ExchangeMasterCombobox_btn);
			js.executeScript("arguments[0].value='" + ExchangeMaster + "';", ExchangeMasterCombobox_txt);
			js.executeScript("arguments[0].click();", ExchangeMasterCombobox_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Settlement_Btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for Settlement_Btn: " + e.getMessage());
		}
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(Settlement_Type_Btn)).click();
			Settlement_Type_Txt.sendKeys(String.valueOf(Settlement_Type));
			Thread.sleep(1000);
			Settlement_Type_Txt.sendKeys(Keys.ENTER);
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying Settlement_Type_Txt click...");
			js.executeScript("arguments[0].click();", Settlement_Type_Btn);
			js.executeScript("arguments[0].value='" + Settlement_Type + "';", Settlement_Type_Txt);
			js.executeScript("arguments[0].click();", Settlement_Type_Txt);
		} catch (NoSuchElementException e) {
			System.out.println("Settlement_Type_Txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for Settlement_Type_Txt: " + e.getMessage());
		}

		settlement_No_txt.click();
		settlement_No_txt.sendKeys(String.valueOf(settlement_No));

		/*
		 * try { Settlement_pop_Up.click(); } catch (Exception e) {
		 * 
		 * System.out.println("Settlement_pop_Up is not visible"); }
		 */

		settlement_Year_txt.click();
		settlement_Year_txt.sendKeys(String.valueOf(settlement_Year));

		Add_Commodity.click();
		Thread.sleep(2000);
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(COMM_CODE_NAME_btn)).click();
			COMM_CODE_NAME_Txt.sendKeys(commodity);
			Thread.sleep(1000);
			COMM_CODE_NAME_Txt.sendKeys(Keys.ENTER);
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying COMM_CODE_NAME_btn click...");
			js.executeScript("arguments[0].click();", COMM_CODE_NAME_btn);
			js.executeScript("arguments[0].value='" + commodity + "';", COMM_CODE_NAME_Txt);
			js.executeScript("arguments[0].click();", COMM_CODE_NAME_Txt);
		} catch (NoSuchElementException e) {
			System.out.println("COMM_CODE_NAME_Txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for COMM_CODE_NAME_Txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		// Open the calendar
		WebElement dateField = driver.findElement(By.xpath("//input[@id='expiry_Date']"));
		dateField.click();
		// select year
		WebElement yearDropdown = driver
				.findElement(By.xpath("//div[@class='calendar left single']//select[@class='yearselect']"));
		Select yearSelect = new Select(yearDropdown);
		yearSelect.selectByVisibleText(expectedYear);
		//System.out.println("expectedYear is :" + expectedYear);
		//String expectedyearSelect = yearSelect.getFirstSelectedOption().getText();
		
		// select month
		WebElement monthDropdown = driver.findElement(By.xpath("(//select[@class='monthselect'])[1]"));
		Select monthSelect = new Select(monthDropdown);
		monthSelect.selectByVisibleText(expectedMonth);
	//	System.out.println("expectedMonth is:" + expectedMonth);
		//String selectedMonth = monthSelect.getFirstSelectedOption().getText();
		
		Thread.sleep(2000);
		// select date
		WebElement dateElement = driver.findElement(By.xpath("//td[@class='available' and normalize-space(text())='" + expectedDay + "']"));
		// Click on the specific date
		try {
		dateElement.click();
		//System.out.println("✅ Clicked on date: " + dateElement);
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying dateElement click...");
			js.executeScript("arguments[0].click();", dateElement);
		} catch (NoSuchElementException e) {
			System.out.println("dateElement not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for dateElement: " + e.getMessage());
		}
		
		
		
		
		// Open the calendar
		WebElement trade_Start_Date = driver.findElement(By.xpath(" //input[@id='trade_Start_Date']"));
		trade_Start_Date.click();
		
		Thread.sleep(2000);
		/*
		 * try {
		 * Wait.until(ExpectedConditions.elementToBeClickable(today_active)).click(); }
		 * catch (ElementClickInterceptedException e) {
		 * System.out.println("Normal click failed, trying today_active click...");
		 * js.executeScript("arguments[0].click();", today_active); } catch
		 * (NoSuchElementException e) { System.out.println("today_active not found: " +
		 * e.getMessage()); } catch (Exception e) {
		 * System.out.println("Unexpected error for today_active: " + e.getMessage()); }
		 */
			
		// Open the calendar
				WebElement delivery_Marking_dateField = driver.findElement(By.xpath("(//input[@id='delivery_Marking_Date'])[1]"));
				delivery_Marking_dateField.click();
		
				// select year
				WebElement delivery_Marking_year = driver
						.findElement(By.xpath("//select[@class='yearselect'][5]"));
				Select delivery_yearSelect = new Select(delivery_Marking_year);
				delivery_yearSelect.selectByVisibleText(Delivery_Marking_Year);
				System.out.println("Delivery_Marking_Year is :" + Delivery_Marking_Year);
				//String expectedyearSelect = yearSelect.getFirstSelectedOption().getText();
				
				// select month
				WebElement delivery_Marking_month = driver.findElement(By.xpath("(//select[@class='monthselect'])[5]"));
				Select delivery_monthSelect = new Select(delivery_Marking_month);
				delivery_monthSelect.selectByVisibleText(Delivery_Marking_Month);
				System.out.println("Delivery_Marking_Month is:" + Delivery_Marking_Month);
				//String selectedMonth = monthSelect.getFirstSelectedOption().getText();
				
				Thread.sleep(2000);
				// select date
				//WebElement Delivery_Marking_date = driver.findElement(By.xpath("//td[@class='available' and normalize-space(text())='" + Delivery_Marking + "'][19]"));
				WebElement Delivery_Marking_date = driver.findElement(By.xpath("(//td[contains(text(),'" + Delivery_Marking + "')])[19]"));
				
				//(//td[contains(text(),'7')])[18]
				// Click on the specific date
				try {
					Delivery_Marking_date.click();
				System.out.println("✅ Clicked on date: " + Delivery_Marking);
				} catch (ElementClickInterceptedException e) {
					System.out.println("Normal click failed, trying dateElement click...");
					js.executeScript("arguments[0].click();", dateElement);
				} catch (NoSuchElementException e) {
					System.out.println("dateElement not found: " + e.getMessage());
				} catch (Exception e) {
					System.out.println("Unexpected error for dateElement: " + e.getMessage());
				}
				
				
				// Open the calendar
				WebElement delivery_Date = driver.findElement(By.xpath("(//input[@id='delivery_Marking_Date'])[2]"));
				delivery_Date.click();
				
				Thread.sleep(2000);
				try {
						Wait.until(ExpectedConditions.elementToBeClickable(today_active)).click();
				} catch (ElementClickInterceptedException e) {
					System.out.println("Normal click failed, trying today_active click...");
					js.executeScript("arguments[0].click();", today_active);
				} catch (NoSuchElementException e) {
					System.out.println("today_active not found: " + e.getMessage());
				} catch (Exception e) {
					System.out.println("Unexpected error for today_active: " + e.getMessage());
				}
					
		
		
				WebElement pay_In_Date = driver.findElement(By.xpath("//input[@id='pay_In_Date']"));
				pay_In_Date.click();
				
				// select year
				WebElement pay_In_year_btn = driver
						.findElement(By.xpath("//select[@class='yearselect'][9]"));
				Select pay_In_yearSelect = new Select(pay_In_year_btn);
				pay_In_yearSelect.selectByVisibleText(pay_In_Year);
				//System.out.println("expectedYear is :" + expectedYear);
				//String expectedyearSelect = yearSelect.getFirstSelectedOption().getText();
				
				// select month
				WebElement pay_In_month = driver.findElement(By.xpath("(//select[@class='monthselect'])[9]"));
				Select pay_In_monthSelect = new Select(pay_In_month);
				pay_In_monthSelect.selectByVisibleText(pay_In_Month);
			//	System.out.println("expectedMonth is:" + expectedMonth);
				//String selectedMonth = monthSelect.getFirstSelectedOption().getText();
				
				Thread.sleep(2000);
				// select date
				WebElement pay_In_date_btn = driver.findElement(By.xpath("//td[@class='available' and normalize-space(text())='" + pay_In_date + "']"));
				// Click on the specific date
				try {
					pay_In_date_btn.click();
				//System.out.println("✅ Clicked on date: " + dateElement);
				} catch (ElementClickInterceptedException e) {
					System.out.println("Normal click failed, trying dateElement click...");
					js.executeScript("arguments[0].click();", pay_In_date_btn);
				} catch (NoSuchElementException e) {
					System.out.println("dateElement not found: " + e.getMessage());
				} catch (Exception e) {
					System.out.println("Unexpected error for dateElement: " + e.getMessage());
				}
				
				WebElement Pay_In_Hr= driver.findElement(By.xpath("(//select[@name='pay_In_Date_hr'])[1]"));
				Select Sa=new Select (Pay_In_Hr);
				Sa.selectByContainsVisibleText(String.valueOf(pay_In_Date_hr));
				
				WebElement pay_In_MM= driver.findElement(By.xpath("(//select[@name='pay_In_Date_mn'])[1]"));
				Select Sb=new Select (pay_In_MM);
				Sb.selectByContainsVisibleText(String.valueOf(String.valueOf(pay_In_Date_mn)));
				
				
				
				
		
		
		
		
		
		Wait.until(ExpectedConditions.elementToBeClickable(Add_To_Settelment_Details_btn)).click();

		try {
			if (Save_btn.isDisplayed()) {
				Wait.until(ExpectedConditions.elementToBeClickable(Save_btn)).click();
			} else {
				System.out.println("Save_btn is not visible");
			}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying Save_btn click...");
			js.executeScript("arguments[0].click();", Save_btn);
		} catch (NoSuchElementException e) {
			System.out.println("Save_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for Save_btn: " + e.getMessage());
		}

	}

}
