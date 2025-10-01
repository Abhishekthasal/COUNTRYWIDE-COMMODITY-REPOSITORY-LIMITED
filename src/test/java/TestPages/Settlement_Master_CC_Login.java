package TestPages;

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

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement COMM_CODE_NAME_Txt;

	@FindBy(xpath = "(//input[@id='expiry_Date'])[1]")
	WebElement expiry_Date_txt;

	@FindBy(xpath = "(//input[@id='trade_Start_Date'])[1]")
	WebElement trade_Start_Date_txt;

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
	
	@FindBy(xpath="(//button[normalize-space()='Add To Settelment Details'])[1]")
	WebElement Add_To_Settelment_Details_btn;
	
	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement Save_btn;
	

	public void Settlement_Master() throws InterruptedException {

		// Thread.sleep(3000);
		try {
			if (Masters_Btn.isDisplayed()) {
				Masters_Btn.click();
			} else {
				System.out.println("Masters_Btn is not visible");
			}
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
			if (Settlement_Btn.isDisplayed()) {
				Wait.until(ExpectedConditions.elementToBeClickable(Settlement_Btn)).click();
			} else {
				System.out.println("Settlement_Btn is not visible");
			}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying Settlement_Btn click...");
			js.executeScript("arguments[0].click();", Settlement_Btn);
		} catch (NoSuchElementException e) {
			System.out.println("Settlement_Btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for Settlement_Btn: " + e.getMessage());
		}

		if (New_btn.isDisplayed()) {
			New_btn.click();
		} else {
			System.out.println("New_btn is not visible");
		}
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(ExchangeMasterCombobox_btn)).click();
			Wait.until(ExpectedConditions.elementToBeClickable(ExchangeMasterCombobox_txt)).sendKeys(ExchangeMaster);
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

		try {
			Settlement_pop_Up.click();
		} catch (Exception e) {

			System.out.println("Settlement_pop_Up is not visible");
		}

		settlement_Year_txt.click();
		settlement_Year_txt.sendKeys(String.valueOf(settlement_Year));

		Add_Commodity.click();

		COMM_CODE_NAME_btn.click();
		COMM_CODE_NAME_Txt.sendKeys(commodity);
		COMM_CODE_NAME_Txt.sendKeys(Keys.ENTER);

		// Open the calendar
		WebElement dateField = driver.findElement(By.xpath("//input[@id='expiry_Date']"));
		dateField.click();

		// Loop until correct month and year are displayed
		while (true) {
			String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();

			if (currentMonth.equals(expectedMonth) && currentYear.equals(expectedYear)) {
				break; // Correct month and year found
			} else {
				// Click next button to move calendar forward
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
		}

		// Select the expectedDay
		List<WebElement> days = driver.findElements(
				By.xpath("(//div[@class='daterangepicker dropdown-menu single opensright show-calendar'])[1]"));
		for (WebElement d : days) {
			if (d.getText().equals(expectedDay)) {
				d.click();
				break;
			}
		}
		// Open the calendar
		WebElement trade_Start_Date = driver.findElement(By.xpath(" //input[@id='trade_Start_Date']"));
		trade_Start_Date.click();

		// Loop until correct month and year are displayed
		while (true) {
			String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();

			if (currentMonth.equals(trade_Month) && currentYear.equals(trade_Year)) {
				break; // Correct month and year found
			} else {
				// Click next button to move calendar forward
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
		}

		// Select the trade_Start_Date_days
		List<WebElement> trade_Start_Date_days = driver.findElements(
				By.xpath("(//div[@class='daterangepicker dropdown-menu single opensright show-calendar'])[1]"));
		for (WebElement d : trade_Start_Date_days) {
			if (d.getText().equals(trade_Day)) {
				d.click();
				break;
			}
		}
		// Open the calendar
		WebElement PostExpiry_Validity_Date = driver
				.findElement(By.xpath("//input[@ng-class=\"{'vm.Settlement.post_expiry_Date'}\"]"));
		PostExpiry_Validity_Date.click();

		// Loop until correct month and year are displayed
		while (true) {
			String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();

			if (currentMonth.equals(PostExpiry_Validity_Month) && currentYear.equals(PostExpiry_Validity_Year)) {
				break; // Correct month and year found
			} else {
				// Click next button to move calendar forward
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
		}

		// Select the PostExpiry_Validity_days
		List<WebElement> PostExpiry_Validity_days = driver.findElements(
				By.xpath("(//div[@class='daterangepicker dropdown-menu single opensright show-calendar'])[1]"));
		for (WebElement d : PostExpiry_Validity_days) {
			if (d.getText().equals(PostExpiry_Validity)) {
				d.click();
				break;
			}
		}
		// Open the calendar
		WebElement Delivery_Marking_Date = driver
				.findElement(By.xpath("//input[@ng-class=\"{'vm.Settlement.delivery_Marking_Date'}\"]"));
		Delivery_Marking_Date.click();

		// Loop until correct month and year are displayed
		while (true) {
			String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();

			if (currentMonth.equals(Delivery_Marking_Month) && currentYear.equals(Delivery_Marking_Year)) {
				break; // Correct month and year found
			} else {
				// Click next button to move calendar forward
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
		}

		// Select the Delivery_Marking_Date_days
		List<WebElement> Delivery_Marking_Date_days = driver.findElements(
				By.xpath("(//div[@class='daterangepicker dropdown-menu single opensright show-calendar'])[1]"));
		for (WebElement d : Delivery_Marking_Date_days) {
			if (d.getText().equals(Delivery_Marking)) {
				d.click();
				break;
			}
		}
		// Open the calendar
		WebElement pay_In = driver.findElement(By.xpath("//input[@id='pay_In_Date']"));
		pay_In.click();

		// Loop until correct month and year are displayed
		while (true) {
			String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();

			if (currentMonth.equals(pay_In_Month) && currentYear.equals(pay_In_Year)) {
				break; // Correct month and year found
			} else {
				// Click next button to move calendar forward
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
		}

		// Select the Delivery_Marking_Date_days
		List<WebElement> Dpay_In_days = driver.findElements(
				By.xpath("(//div[@class='daterangepicker dropdown-menu single opensright show-calendar'])[1]"));
		for (WebElement d : Dpay_In_days) {
			if (d.getText().equals(pay_In_date)) {
				d.click();
				break;
			}
		}
		Select pay_in = new Select(pay_In_Date_hr_s);
		pay_in.selectByContainsVisibleText(String.valueOf(pay_In_Date_hr));

		Select pay_in_mm = new Select(pay_In_Date_mn_s);
		pay_in_mm.selectByContainsVisibleText(String.valueOf(pay_In_Date_mn));

		// Open the calendar
		WebElement pay_out = driver.findElement(By.xpath("(//input[@id='pay_Out_Date'])[1]"));
		pay_out.click();

		// Loop until correct month and year are displayed
		while (true) {
			String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();

			if (currentMonth.equals(pay_out_Month) && currentYear.equals(pay_out_Year)) {
				break; // Correct month and year found
			} else {
				// Click next button to move calendar forward
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
		}

		// Select the Delivery_Marking_Date_days
		List<WebElement> pay_out_days = driver.findElements(
				By.xpath("(//div[@class='daterangepicker dropdown-menu single opensright show-calendar'])[1]"));
		for (WebElement d : pay_out_days) {
			if (d.getText().equals(pay_out_date)) {
				d.click();
				break;
			}
		}

		Select pay_Out = new Select(pay_Out_Date_hr_s);
		pay_Out.selectByContainsVisibleText(String.valueOf(pay_out_Date_hr));

		Select pay_Out_mm = new Select(pay_Out_Date_mn_s);
		pay_Out_mm.selectByContainsVisibleText(String.valueOf(pay_out_Date_mn));

		// Open the calendar
		WebElement early_pay_In = driver.findElement(By.xpath("//input[@id='early_Payin_Start_Date']"));
		early_pay_In.click();

		// Loop until correct month and year are displayed
		while (true) {
			String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();

			if (currentMonth.equals(early_pay_In_Month) && currentYear.equals(early_pay_In_Year)) {
				break; // Correct month and year found
			} else {
				// Click next button to move calendar forward
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
		}

		// Select the Delivery_Marking_Date_days
		List<WebElement> early_pay_In_days = driver.findElements(
				By.xpath("(//div[@class='daterangepicker dropdown-menu single opensright show-calendar'])[1]"));
		for (WebElement d : early_pay_In_days) {
			if (d.getText().equals(early_pay_In_date)) {
				d.click();
				break;
			}
		}
		Select early_pay_In_hr = new Select(early_pay_In_Date_hr_s);
		early_pay_In_hr.selectByContainsVisibleText(String.valueOf(early_pay_In_Date_hr));

		Select early_pay_In_mm = new Select(early_pay_In_Date_mn_s);
		early_pay_In_mm.selectByContainsVisibleText(String.valueOf(early_pay_In_Date_mn));

		// Open the calendar
		WebElement early_Payin_End = driver
				.findElement(By.xpath("//input[@ng-class=\"{'vm.Settlement.early_Payin_End_Date'}\"]"));
		early_Payin_End.click();

		// Loop until correct month and year are displayed
		while (true) {
			String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();

			if (currentMonth.equals(early_Payin_End_Month) && currentYear.equals(early_Payin_End_Year)) {
				break; // Correct month and year found
			} else {
				// Click next button to move calendar forward
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
		}

		// Select the Delivery_Marking_Date_days
		List<WebElement> early_Payin_End_days = driver.findElements(
				By.xpath("(//div[@class='daterangepicker dropdown-menu single opensright show-calendar'])[1]"));
		for (WebElement d : early_Payin_End_days) {
			if (d.getText().equals(early_Payin_End_date)) {
				d.click();
				break;
			}
		}
		Select early_Payin_End_hr = new Select(early_Payin_End_Date_hr_s);
		early_Payin_End_hr.selectByContainsVisibleText(String.valueOf(early_Payin_End_Date_hr));

		Select early_Payin_End_mm = new Select(early_Payin_End_Date_mn_s);
		early_Payin_End_mm.selectByContainsVisibleText(String.valueOf(early_Payin_End_Date_mn));
		
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
