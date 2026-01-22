package TestPages;

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
import org.testng.Assert;

import Utillity.ExcelUtils;

public class Exports_Reports {

	WebDriver driver;
	WebDriverWait Wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	static String path = "C:\\Users\\abhishekyt\\git\\repository\\Automation\\Data\\Margin_Depledge.xlsx";
	static String sheet = "CC Depledge Request";
	static int dataRow = 2; // second row of data
	static ExcelUtils excel = new ExcelUtils(path, sheet);

	/*
	 * long CC_Client_Id_DePledge = excel.getCC_Client_Id_DePledge(dataRow); //
	 * 180000110000033L; public static int Pledge_Sequence_No =
	 * excel.getPledge_Sequence_No_DePledge(dataRow); static String
	 * CC_DePledge_Request_No = excel.getCC_DePledge_Request_No(dataRow); long
	 * ENWR_DePledge = excel.getCC_ENWR_DePledge(dataRow);
	 */

	public Exports_Reports(WebDriver driver, WebDriverWait Wait) {

		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='Exports']")
	WebElement Exports_btn;

	@FindBy(xpath = "(//span[@class='title ng-binding'][normalize-space()='CM Payout Transfer'])[2]")
	WebElement CM_Payout_Transfer_btn;

	@FindBy(xpath = "(//span[normalize-space()='TM Payout Transfer'])[1]")
	WebElement CCRL_Login_TM_Payout_Transfer_btn;

	@FindBy(xpath = "(//span[@class='title ng-binding'][normalize-space()='TM Payout Transfer'])[2]")
	WebElement RP_Login_TM_Payout_Transfer_btn;

	@FindBy(xpath = "(//span[@class='title ng-binding'][normalize-space()='CM Payout Transfer'])[1]")
	WebElement Client_CM_Payout_Transfer_btn;
	
	@FindBy(xpath="//span[@class='title ng-binding'][normalize-space()='Pledge Export']")
	WebElement Pledge_Export_Btn;

	@FindBy(xpath = "//h4[normalize-space()='CM Payout Transfer Export']")
	WebElement ClickOnly;

	@FindBy(xpath = "//h4[normalize-space()='Tm Payout Transfer Export']")
	WebElement BlankClick;

	@FindBy(xpath = "//button[@id='TMClientidOk']")
	WebElement TMClientidOk;
	@FindBy(xpath = "//input[@id='ccdatalabel']")
	WebElement ccdatalabelOk;
	

	@FindBy(xpath = "//button[normalize-space()='New']")
	WebElement New_btn;

	@FindBy(xpath="//button[@data-id='reportType']//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED']")
	WebElement reportType_Btn;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement reportType_Txt;
	
	@FindBy(xpath = "//button[@title='NOTHING SELECTED']")
	WebElement Exchange_ID_btn;

	@FindBy(xpath = "//div[@class='btn-group bootstrap-select form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required open']//input[@type='text']")
	WebElement Exchange_ID_txt;

	@FindBy(xpath = "//button[@data-id='settle_selection_box']//span[@class='filter-option pull-left'][normalize-space()='Nothing selected']")
	WebElement settle_selection_box_btn;

	@FindBy(xpath = "//button[@data-id='settlementwisecombobox']//span[@class='filter-option pull-left'][normalize-space()='Nothing selected']")
	WebElement settlementwisecombobox_btn;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement settle_selection_box_txt;

	@FindBy(xpath = "//button[@data-id='comm_selection_box']//span[@class='filter-option pull-left'][normalize-space()='Nothing selected']")
	WebElement comm_selection_box_btn;

	@FindBy(xpath = "//button[@data-id='commoditywisecombobox']//span[@class='filter-option pull-left'][normalize-space()='Nothing selected']")
	WebElement commoditywisecombobox_btn;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement comm_selection_box_txt;

	@FindBy(xpath = "//button[@data-id='client_selection_box']")
	WebElement client_selection_box_btn;
	@FindBy(xpath = "//button[@data-id='tmclientidwisedatamaster']//span[@class='filter-option pull-left'][normalize-space()='Nothing selected']")
	WebElement tmclientidwisedatamaster_btn;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement client_selection_box_txt;

	@FindBy(xpath = "//input[@id='from_date']")
	WebElement from_date_btn;

	@FindBy(xpath = "(//select[@class='yearselect'])[1]")
	WebElement from_Years;

	@FindBy(xpath = "(//select[@class='monthselect'])[1]")
	WebElement from_months;

	// @FindBy(xpath="//td[@class='available'][normalize-space()='29']")

	@FindBy(xpath = "//input[@id='to_date']")
	WebElement to_date_btn;

	@FindBy(xpath = "//input[@id='toDate']")
	WebElement toDate_btn;

	@FindBy(xpath = "(//select[@class='yearselect'])[3]")
	WebElement to_Years;

	@FindBy(xpath = "(//select[@class='monthselect'])[3]")
	WebElement to_months;

	@FindBy(xpath = "//span[normalize-space()='Export']")
	WebElement Export_btn;

	@FindBy(xpath = "//button[normalize-space()='Ok']")
	WebElement Ok_btn;

    //CR246_TestCase
	public void CR246_TestCase1() throws InterruptedException {

		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();

		try {
			// if (CM_Payout_Transfer_btn.isDisplayed()) {
			Wait.until(ExpectedConditions.elementToBeClickable(CM_Payout_Transfer_btn)).click();
			// }
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
		// Thread.sleep(1000);
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(Exchange_ID_txt)).sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		ClickOnly.click();

		settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys("21082018256");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		comm_selection_box_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		client_selection_box_btn.click();
		client_selection_box_txt.sendKeys("155000010000019 - Shobhachand Sanjaykumar & Co.");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2025");

		Select B = new Select(from_months);
		B.selectByVisibleText("Dec");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='29']"));

		FromDate.click();

		to_date_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();

		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR246_TestCase2() throws InterruptedException {

		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();

		try {
			// if(CM_Payout_Transfer_btn.isDisplayed()) {
			Wait.until(ExpectedConditions.elementToBeClickable(CM_Payout_Transfer_btn)).click();
			// }
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

		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

		Exchange_ID_btn.click();
		// Thread.sleep(1000);
		// Exchange_ID value is blank
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(Exchange_ID_txt)).sendKeys(""); // 11 - MCX
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);
		/*
		 * Assert.assertTrue(mandatoryError.isDisplayed(),
		 * "Exchange ID should be mandatory");
		 */

		ClickOnly.click();
		// ettle_selection_box value is blank
		try {
			settle_selection_box_btn.click();
			settle_selection_box_txt.sendKeys("");// 21082018256
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript settle_selection_box_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "" + "';", settle_selection_box_txt);
		} catch (NoSuchElementException e) {
			System.out.println("settle_selection_box_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error settle_selection_box_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		comm_selection_box_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		client_selection_box_btn.click();
		client_selection_box_txt.sendKeys("155000010000019 - Shobhachand Sanjaykumar & Co.");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2025");

		Select B = new Select(from_months);
		B.selectByVisibleText("Dec");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='29']"));

		FromDate.click();

		to_date_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();

		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR246_TestCase3() throws InterruptedException {

		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();

		try {
			// if (CM_Payout_Transfer_btn.isDisplayed()) {
			Wait.until(ExpectedConditions.elementToBeClickable(CM_Payout_Transfer_btn)).click();
			// }
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
		// Thread.sleep(1000);
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(Exchange_ID_txt)).sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		ClickOnly.click();

		settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys("21082018256");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		comm_selection_box_btn.click();
		comm_selection_box_txt.sendKeys(""); // 15 - COTTON BALES
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		client_selection_box_btn.click();
		client_selection_box_txt.sendKeys("155000010000019 - Shobhachand Sanjaykumar & Co.");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2025");

		Select B = new Select(from_months);
		B.selectByVisibleText("Dec");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='29']"));

		FromDate.click();

		to_date_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();

		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR246_TestCase4() throws InterruptedException {

		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();

		try {
			// if (CM_Payout_Transfer_btn.isDisplayed()) {
			Wait.until(ExpectedConditions.elementToBeClickable(CM_Payout_Transfer_btn)).click();
			// }
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
		// Thread.sleep(1000);
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(Exchange_ID_txt)).sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		ClickOnly.click();

		settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys("21082018256");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		comm_selection_box_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		client_selection_box_btn.click();
		client_selection_box_txt.sendKeys(" "); // 155000010000019 - Shobhachand Sanjaykumar & Co.
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2025");

		Select B = new Select(from_months);
		B.selectByVisibleText("Dec");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='29']"));

		FromDate.click();

		to_date_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR246_TestCase5() throws InterruptedException {

		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();

		try {
			// if (CM_Payout_Transfer_btn.isDisplayed()) {
			Wait.until(ExpectedConditions.elementToBeClickable(CM_Payout_Transfer_btn)).click();
			// }
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
		// Thread.sleep(1000);
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(Exchange_ID_txt)).sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		ClickOnly.click();

		settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys("21082018256");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		comm_selection_box_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		client_selection_box_btn.click();
		client_selection_box_txt.sendKeys("155000010000019 - Shobhachand Sanjaykumar & Co.");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		from_date_btn.click();

		/*
		 * Select A = new Select(from_Years); A.selectByVisibleText("2025");
		 * 
		 * Select B = new Select(from_months); B.selectByVisibleText("Dec");
		 * 
		 * WebElement FromDate = driver.findElement(By.xpath(
		 * "//td[@class='available'][normalize-space()='29']"));
		 * 
		 * FromDate.click();
		 */

		to_date_btn.click();

		/*
		 * Select C = new Select(to_Years); C.selectByVisibleText("2026");
		 * 
		 * Select D = new Select(to_months); D.selectByVisibleText("Jan");
		 * 
		 * WebElement ToDate = driver .findElement(By.
		 * xpath("//td[@class='today active start-date active end-date available']"));
		 * 
		 * ToDate.click();
		 * 
		 * // FromDate.click();
		 */
		Export_btn.click();
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR246_TestCase6() throws InterruptedException {

		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();

		try {
			if (CM_Payout_Transfer_btn.isDisplayed()) {
				Wait.until(ExpectedConditions.elementToBeClickable(CM_Payout_Transfer_btn)).click();
			}
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
		// Thread.sleep(1000);
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(Exchange_ID_txt)).sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		ClickOnly.click();

		settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys("21082018256");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		comm_selection_box_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		client_selection_box_btn.click();
		client_selection_box_txt.sendKeys("155000010000019 - Shobhachand Sanjaykumar & Co.");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2025");

		Select B = new Select(from_months);
		B.selectByVisibleText("Dec");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='29']"));

		FromDate.click();

		to_date_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();

		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR246_TestCase7() throws InterruptedException {

		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();

		try {
			// if (CM_Payout_Transfer_btn.isDisplayed()) {
			Wait.until(ExpectedConditions.elementToBeClickable(Client_CM_Payout_Transfer_btn)).click();
			// }
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
		// Thread.sleep(1000);
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(Exchange_ID_txt)).sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		ClickOnly.click();

		settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys("21082018256");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		comm_selection_box_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		client_selection_box_btn.click();
		client_selection_box_txt.sendKeys("155000010000019 - Shobhachand Sanjaykumar & Co.");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2025");

		Select B = new Select(from_months);
		B.selectByVisibleText("Dec");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='29']"));

		FromDate.click();

		to_date_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(1000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR246_Test_Case8() throws InterruptedException {
		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();

		try {
			// if (Client_CM_Payout_Transfer_btn.isDisplayed()) {
			Wait.until(ExpectedConditions.elementToBeClickable(Client_CM_Payout_Transfer_btn)).click();
			// }
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript CM_Payout_Transfer_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", Client_CM_Payout_Transfer_btn);
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
		// Thread.sleep(1000);
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(Exchange_ID_txt)).sendKeys("");// 11 - MCX
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + " " + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		ClickOnly.click();

		settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(" "); // 21082018256
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		comm_selection_box_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		client_selection_box_btn.click();
		client_selection_box_txt.sendKeys("155000010000019 - Shobhachand Sanjaykumar & Co.");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2025");

		Select B = new Select(from_months);
		B.selectByVisibleText("Dec");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='29']"));

		FromDate.click();

		to_date_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(1000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR246_Test_Case9() throws InterruptedException {
		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();

		try {
			// if (CM_Payout_Transfer_btn.isDisplayed()) {
			Wait.until(ExpectedConditions.elementToBeClickable(Client_CM_Payout_Transfer_btn)).click();
			// }
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript CM_Payout_Transfer_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", Client_CM_Payout_Transfer_btn);
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
		// Thread.sleep(1000);
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(Exchange_ID_txt)).sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		ClickOnly.click();

		settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys("21082018256");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		comm_selection_box_btn.click();
		comm_selection_box_txt.sendKeys(" ");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		client_selection_box_btn.click();
		client_selection_box_txt.sendKeys("155000010000019 - Shobhachand Sanjaykumar & Co.");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2025");

		Select B = new Select(from_months);
		B.selectByVisibleText("Dec");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='29']"));

		FromDate.click();

		to_date_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();

		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR246_Test_Case10() throws InterruptedException {
		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();

		try {
			// if (CM_Payout_Transfer_btn.isDisplayed()) {
			Wait.until(ExpectedConditions.elementToBeClickable(Client_CM_Payout_Transfer_btn)).click();
			// }
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript CM_Payout_Transfer_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", Client_CM_Payout_Transfer_btn);
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
		// Thread.sleep(1000);
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(Exchange_ID_txt)).sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		ClickOnly.click();

		settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys("21082018256");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		comm_selection_box_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		client_selection_box_btn.click();
		client_selection_box_txt.sendKeys(""); // 155000010000019 - Shobhachand Sanjaykumar & Co.
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2025");

		Select B = new Select(from_months);
		B.selectByVisibleText("Dec");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='29']"));

		FromDate.click();

		to_date_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR246_Test_Case11() throws InterruptedException {
		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();

		try {
			// if (CM_Payout_Transfer_btn.isDisplayed()) {
			Wait.until(ExpectedConditions.elementToBeClickable(Client_CM_Payout_Transfer_btn)).click();
			// }
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript CM_Payout_Transfer_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", Client_CM_Payout_Transfer_btn);
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
		// Thread.sleep(1000);
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(Exchange_ID_txt)).sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		ClickOnly.click();

		settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys("21082018256");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		comm_selection_box_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		client_selection_box_btn.click();
		client_selection_box_txt.sendKeys("155000010000019 - Shobhachand Sanjaykumar & Co.");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		from_date_btn.click();

		/*
		 * Select A = new Select(from_Years); A.selectByVisibleText("2025");
		 * 
		 * Select B = new Select(from_months); B.selectByVisibleText("Dec");
		 * 
		 * WebElement FromDate = driver.findElement(By.xpath(
		 * "//td[@class='available'][normalize-space()='29']"));
		 * 
		 * FromDate.click();
		 */

		to_date_btn.click();

		/*
		 * Select C = new Select(to_Years); C.selectByVisibleText("2026");
		 * 
		 * Select D = new Select(to_months); D.selectByVisibleText("Jan");
		 * 
		 * WebElement ToDate = driver .findElement(By.
		 * xpath("//td[@class='today active start-date active end-date available']"));
		 * 
		 * ToDate.click();
		 */

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR246_Test_Case12() throws InterruptedException {

		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();

		try {
			if (CM_Payout_Transfer_btn.isDisplayed()) {
				Wait.until(ExpectedConditions.elementToBeClickable(CM_Payout_Transfer_btn)).click();
			}
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
		// Thread.sleep(1000);
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(Exchange_ID_txt)).sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		ClickOnly.click();

		settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys("21082018256");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		comm_selection_box_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		client_selection_box_btn.click();
		client_selection_box_txt.sendKeys("155000010000019 - Shobhachand Sanjaykumar & Co.");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		ClickOnly.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2025");

		Select B = new Select(from_months);
		B.selectByVisibleText("Dec");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='29']"));

		FromDate.click();

		to_date_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();

		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	// CR247_TestCase below

	public void CR247_TestCase1() throws InterruptedException {

		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(RP_Login_TM_Payout_Transfer_btn)).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript RP_Login_TM_Payout_Transfer_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", RP_Login_TM_Payout_Transfer_btn);
		} catch (NoSuchElementException e) {
			System.out.println("CCRL_Login_TM_Payout_Transfer_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error CCRL_Login_TM_Payout_Transfer_btn: " + e.getMessage());
		}
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

		Exchange_ID_btn.click();
		try {
			Exchange_ID_txt.sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		BlankClick.click();

		Wait.until(ExpectedConditions.elementToBeClickable(settlementwisecombobox_btn)).click();

		Wait.until(ExpectedConditions.elementToBeClickable(settle_selection_box_txt)).sendKeys("11201801001");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		commoditywisecombobox_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		tmclientidwisedatamaster_btn.click();
		client_selection_box_txt.sendKeys("155000011505180 - TESTING TRADING MEMBER 14052018");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2026");

		Select B = new Select(from_months);
		B.selectByVisibleText("Jan");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='2']"));

		FromDate.click();

		toDate_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR247_Test_Case2() throws InterruptedException {

		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(RP_Login_TM_Payout_Transfer_btn)).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript RP_Login_TM_Payout_Transfer_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", RP_Login_TM_Payout_Transfer_btn);
		} catch (NoSuchElementException e) {
			System.out.println("RP_Login_TM_Payout_Transfer_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error RP_Login_TM_Payout_Transfer_btn: " + e.getMessage());
		}
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

		Exchange_ID_btn.click();
		try {
			Exchange_ID_txt.sendKeys(" ");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + " " + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		BlankClick.click();

		Wait.until(ExpectedConditions.elementToBeClickable(settlementwisecombobox_btn)).click();
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(settle_selection_box_txt)).sendKeys(" ");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + " " + "';", settle_selection_box_txt);
		} catch (NoSuchElementException e) {
			System.out.println("settle_selection_box_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error settle_selection_box_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		commoditywisecombobox_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		tmclientidwisedatamaster_btn.click();
		client_selection_box_txt.sendKeys("155000011505180 - TESTING TRADING MEMBER 14052018");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2026");

		Select B = new Select(from_months);
		B.selectByVisibleText("Jan");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='2']"));

		FromDate.click();

		toDate_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR247_Test_Case3() throws InterruptedException {
		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(RP_Login_TM_Payout_Transfer_btn)).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript RP_Login_TM_Payout_Transfer_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", RP_Login_TM_Payout_Transfer_btn);
		} catch (NoSuchElementException e) {
			System.out.println("RP_Login_TM_Payout_Transfer_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error RP_Login_TM_Payout_Transfer_btn: " + e.getMessage());
		}
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

		Exchange_ID_btn.click();
		try {
			Exchange_ID_txt.sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		BlankClick.click();

		Wait.until(ExpectedConditions.elementToBeClickable(settlementwisecombobox_btn)).click();

		Wait.until(ExpectedConditions.elementToBeClickable(settle_selection_box_txt)).sendKeys("11201801001");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		commoditywisecombobox_btn.click();
		try {
			comm_selection_box_txt.sendKeys(" ");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + " " + "';", comm_selection_box_txt);
		} catch (NoSuchElementException e) {
			System.out.println("comm_selection_box_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error comm_selection_box_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		TMClientidOk.click();

		tmclientidwisedatamaster_btn.click();
		client_selection_box_txt.sendKeys("155000011505180 - TESTING TRADING MEMBER 14052018");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2026");

		Select B = new Select(from_months);
		B.selectByVisibleText("Jan");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='2']"));

		FromDate.click();

		toDate_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR247_Test_Case4() throws InterruptedException {
		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(RP_Login_TM_Payout_Transfer_btn)).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript RP_Login_TM_Payout_Transfer_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", RP_Login_TM_Payout_Transfer_btn);
		} catch (NoSuchElementException e) {
			System.out.println("RP_Login_TM_Payout_Transfer_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error RP_Login_TM_Payout_Transfer_btn: " + e.getMessage());
		}
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

		Exchange_ID_btn.click();
		try {
			Exchange_ID_txt.sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		BlankClick.click();

		Wait.until(ExpectedConditions.elementToBeClickable(settlementwisecombobox_btn)).click();

		Wait.until(ExpectedConditions.elementToBeClickable(settle_selection_box_txt)).sendKeys("11201801001");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		commoditywisecombobox_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		tmclientidwisedatamaster_btn.click();
		try {
			client_selection_box_txt.sendKeys(" ");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript client_selection_box_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + " " + "';", client_selection_box_txt);
		} catch (NoSuchElementException e) {
			System.out.println("client_selection_box_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error client_selection_box_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2026");

		Select B = new Select(from_months);
		B.selectByVisibleText("Jan");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='2']"));

		FromDate.click();

		toDate_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR247_TestCase5() throws InterruptedException {
		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(RP_Login_TM_Payout_Transfer_btn)).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript RP_Login_TM_Payout_Transfer_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", RP_Login_TM_Payout_Transfer_btn);
		} catch (NoSuchElementException e) {
			System.out.println("RP_Login_TM_Payout_Transfer_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error RP_Login_TM_Payout_Transfer_btn: " + e.getMessage());
		}
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

		Exchange_ID_btn.click();
		try {
			Exchange_ID_txt.sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		BlankClick.click();

		Wait.until(ExpectedConditions.elementToBeClickable(settlementwisecombobox_btn)).click();

		Wait.until(ExpectedConditions.elementToBeClickable(settle_selection_box_txt)).sendKeys("11201801001");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		commoditywisecombobox_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		tmclientidwisedatamaster_btn.click();
		client_selection_box_txt.sendKeys("155000011505180 - TESTING TRADING MEMBER 14052018");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		from_date_btn.click();

		/*
		 * Select A = new Select(from_Years); A.selectByVisibleText("2026");
		 * 
		 * Select B = new Select(from_months); B.selectByVisibleText("Jan");
		 * 
		 * WebElement FromDate =
		 * driver.findElement(By.xpath("//td[@class='available'][normalize-space()='2']"
		 * ));
		 * 
		 * FromDate.click();
		 */

		toDate_btn.click();

		/*
		 * Select C = new Select(to_Years); C.selectByVisibleText("2026");
		 * 
		 * Select D = new Select(to_months); D.selectByVisibleText("Jan");
		 * 
		 * WebElement ToDate = driver .findElement(By.
		 * xpath("//td[@class='today active start-date active end-date available']"));
		 * 
		 * ToDate.click();
		 */

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR247_TestCase6() throws InterruptedException {
		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(RP_Login_TM_Payout_Transfer_btn)).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript RP_Login_TM_Payout_Transfer_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", RP_Login_TM_Payout_Transfer_btn);
		} catch (NoSuchElementException e) {
			System.out.println("RP_Login_TM_Payout_Transfer_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error RP_Login_TM_Payout_Transfer_btn: " + e.getMessage());
		}
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

		Exchange_ID_btn.click();
		try {
			Exchange_ID_txt.sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		BlankClick.click();

		Wait.until(ExpectedConditions.elementToBeClickable(settlementwisecombobox_btn)).click();

		Wait.until(ExpectedConditions.elementToBeClickable(settle_selection_box_txt)).sendKeys("11201801001");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		commoditywisecombobox_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		tmclientidwisedatamaster_btn.click();
		client_selection_box_txt.sendKeys("155000011505180 - TESTING TRADING MEMBER 14052018");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2026");

		Select B = new Select(from_months);
		B.selectByVisibleText("Jan");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='2']"));

		FromDate.click();

		toDate_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR247_TestCase7() throws InterruptedException {
		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(CCRL_Login_TM_Payout_Transfer_btn)).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript CCRL_Login_TM_Payout_Transfer_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", CCRL_Login_TM_Payout_Transfer_btn);
		} catch (NoSuchElementException e) {
			System.out.println("CCRL_Login_TM_Payout_Transfer_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error CCRL_Login_TM_Payout_Transfer_btn: " + e.getMessage());
		}
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

		Exchange_ID_btn.click();
		try {
			Exchange_ID_txt.sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		BlankClick.click();

		Wait.until(ExpectedConditions.elementToBeClickable(settlementwisecombobox_btn)).click();

		Wait.until(ExpectedConditions.elementToBeClickable(settle_selection_box_txt)).sendKeys("11201801001");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		commoditywisecombobox_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		tmclientidwisedatamaster_btn.click();
		client_selection_box_txt.sendKeys("155000011505180 - TESTING TRADING MEMBER 14052018");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2026");

		Select B = new Select(from_months);
		B.selectByVisibleText("Jan");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='2']"));

		FromDate.click();

		toDate_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR247_TestCase8() throws InterruptedException {
		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(CCRL_Login_TM_Payout_Transfer_btn)).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript CCRL_Login_TM_Payout_Transfer_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", CCRL_Login_TM_Payout_Transfer_btn);
		} catch (NoSuchElementException e) {
			System.out.println("CCRL_Login_TM_Payout_Transfer_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error CCRL_Login_TM_Payout_Transfer_btn: " + e.getMessage());
		}
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

		Exchange_ID_btn.click();
		try {
			Exchange_ID_txt.sendKeys(" ");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + " " + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		BlankClick.click();

		Wait.until(ExpectedConditions.elementToBeClickable(settlementwisecombobox_btn)).click();
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(settle_selection_box_txt)).sendKeys(" ");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript settle_selection_box_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + " " + "';", settle_selection_box_txt);
		} catch (NoSuchElementException e) {
			System.out.println("settle_selection_box_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error settle_selection_box_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		commoditywisecombobox_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		tmclientidwisedatamaster_btn.click();
		client_selection_box_txt.sendKeys("155000011505180 - TESTING TRADING MEMBER 14052018");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2026");

		Select B = new Select(from_months);
		B.selectByVisibleText("Jan");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='2']"));

		FromDate.click();

		toDate_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR247_TestCase9() throws InterruptedException {
		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(CCRL_Login_TM_Payout_Transfer_btn)).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript CCRL_Login_TM_Payout_Transfer_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", CCRL_Login_TM_Payout_Transfer_btn);
		} catch (NoSuchElementException e) {
			System.out.println("CCRL_Login_TM_Payout_Transfer_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error CCRL_Login_TM_Payout_Transfer_btn: " + e.getMessage());
		}
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

		Exchange_ID_btn.click();
		try {
			Exchange_ID_txt.sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		BlankClick.click();

		Wait.until(ExpectedConditions.elementToBeClickable(settlementwisecombobox_btn)).click();

		Wait.until(ExpectedConditions.elementToBeClickable(settle_selection_box_txt)).sendKeys("11201801001");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		commoditywisecombobox_btn.click();
		try {
			comm_selection_box_txt.sendKeys(" ");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript comm_selection_box_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + " " + "';", comm_selection_box_txt);
		} catch (NoSuchElementException e) {
			System.out.println("comm_selection_box_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error comm_selection_box_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		TMClientidOk.click();

		tmclientidwisedatamaster_btn.click();
		client_selection_box_txt.sendKeys("155000011505180 - TESTING TRADING MEMBER 14052018");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2026");

		Select B = new Select(from_months);
		B.selectByVisibleText("Jan");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='2']"));

		FromDate.click();

		toDate_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR247_TestCase10() throws InterruptedException {
		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(CCRL_Login_TM_Payout_Transfer_btn)).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript CCRL_Login_TM_Payout_Transfer_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", CCRL_Login_TM_Payout_Transfer_btn);
		} catch (NoSuchElementException e) {
			System.out.println("CCRL_Login_TM_Payout_Transfer_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error CCRL_Login_TM_Payout_Transfer_btn: " + e.getMessage());
		}
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

		Exchange_ID_btn.click();
		try {
			Exchange_ID_txt.sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		BlankClick.click();

		Wait.until(ExpectedConditions.elementToBeClickable(settlementwisecombobox_btn)).click();

		Wait.until(ExpectedConditions.elementToBeClickable(settle_selection_box_txt)).sendKeys("11201801001");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		commoditywisecombobox_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		tmclientidwisedatamaster_btn.click();
		try {
			client_selection_box_txt.sendKeys(" ");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript client_selection_box_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + " " + "';", client_selection_box_txt);
		} catch (NoSuchElementException e) {
			System.out.println("client_selection_box_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error client_selection_box_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		ccdatalabelOk.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2026");

		Select B = new Select(from_months);
		B.selectByVisibleText("Jan");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='2']"));

		FromDate.click();

		toDate_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR247_Test_Case11() throws InterruptedException {
		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(CCRL_Login_TM_Payout_Transfer_btn)).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript CCRL_Login_TM_Payout_Transfer_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", CCRL_Login_TM_Payout_Transfer_btn);
		} catch (NoSuchElementException e) {
			System.out.println("CCRL_Login_TM_Payout_Transfer_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error CCRL_Login_TM_Payout_Transfer_btn: " + e.getMessage());
		}
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

		Exchange_ID_btn.click();
		try {
			Exchange_ID_txt.sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		BlankClick.click();

		Wait.until(ExpectedConditions.elementToBeClickable(settlementwisecombobox_btn)).click();

		Wait.until(ExpectedConditions.elementToBeClickable(settle_selection_box_txt)).sendKeys("11201801001");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		commoditywisecombobox_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		tmclientidwisedatamaster_btn.click();
		client_selection_box_txt.sendKeys("155000011505180 - TESTING TRADING MEMBER 14052018");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		from_date_btn.click();

		/*
		 * Select A = new Select(from_Years); A.selectByVisibleText("2026");
		 * 
		 * Select B = new Select(from_months); B.selectByVisibleText("Jan");
		 * 
		 * 
		 * WebElement FromDate =
		 * driver.findElement(By.xpath("//td[@class='available'][normalize-space()='2']"
		 * ));
		 * 
		 * FromDate.click();
		 */

		toDate_btn.click();
		/*
		 * Select C = new Select(to_Years); C.selectByVisibleText("2026");
		 * 
		 * Select D = new Select(to_months); D.selectByVisibleText("Jan");
		 * 
		 * WebElement ToDate = driver .findElement(By.
		 * xpath("//td[@class='today active start-date active end-date available']"));
		 * 
		 * ToDate.click();
		 */

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	public void CR247_TestCase12() throws InterruptedException {
		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(CCRL_Login_TM_Payout_Transfer_btn)).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript CCRL_Login_TM_Payout_Transfer_btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", CCRL_Login_TM_Payout_Transfer_btn);
		} catch (NoSuchElementException e) {
			System.out.println("CCRL_Login_TM_Payout_Transfer_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error CCRL_Login_TM_Payout_Transfer_btn: " + e.getMessage());
		}
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

		Exchange_ID_btn.click();
		try {
			Exchange_ID_txt.sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		BlankClick.click();

		Wait.until(ExpectedConditions.elementToBeClickable(settlementwisecombobox_btn)).click();

		Wait.until(ExpectedConditions.elementToBeClickable(settle_selection_box_txt)).sendKeys("11201801001");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		commoditywisecombobox_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		tmclientidwisedatamaster_btn.click();
		client_selection_box_txt.sendKeys("155000011505180 - TESTING TRADING MEMBER 14052018");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2026");

		Select B = new Select(from_months);
		B.selectByVisibleText("Jan");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='2']"));

		FromDate.click();

		toDate_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();

	}

	// CR212_TestCase
	public void CR212_TestCase1() throws InterruptedException {
		
		Wait.until(ExpectedConditions.elementToBeClickable(Exports_btn)).click();
		try {
			Wait.until(ExpectedConditions.elementToBeClickable(Pledge_Export_Btn)).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Pledge_Export_Btn click...");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", Pledge_Export_Btn);
		} catch (NoSuchElementException e) {
			System.out.println("Pledge_Export_Btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Pledge_Export_Btn: " + e.getMessage());
		}
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
		
		reportType_Btn.click();
		
		reportType_Txt.sendKeys("Pledge Creation");
		reportType_Txt.sendKeys(Keys.ENTER);

		Exchange_ID_btn.click();
		try {
			Exchange_ID_txt.sendKeys("11 - MCX");
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Exchange_ID_txt click...");
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// New_btn);
			((JavascriptExecutor) driver).executeScript("arguments[0].value='" + "11 - MCX" + "';", Exchange_ID_txt);
		} catch (NoSuchElementException e) {
			System.out.println("Exchange_ID_txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error Exchange_ID_txt: " + e.getMessage());
		}
		Thread.sleep(1000);
		Exchange_ID_txt.sendKeys(Keys.ENTER);

		BlankClick.click();

		Wait.until(ExpectedConditions.elementToBeClickable(settlementwisecombobox_btn)).click();

		Wait.until(ExpectedConditions.elementToBeClickable(settle_selection_box_txt)).sendKeys("11201801001");
		Thread.sleep(1000);
		// settle_selection_box_btn.click();
		settle_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		commoditywisecombobox_btn.click();
		comm_selection_box_txt.sendKeys("15 - COTTON BALES");
		Thread.sleep(1000);
		comm_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		tmclientidwisedatamaster_btn.click();
		client_selection_box_txt.sendKeys("155000011505180 - TESTING TRADING MEMBER 14052018");
		Thread.sleep(1000);
		client_selection_box_txt.sendKeys(Keys.ENTER);
		BlankClick.click();

		from_date_btn.click();

		Select A = new Select(from_Years);
		A.selectByVisibleText("2026");

		Select B = new Select(from_months);
		B.selectByVisibleText("Jan");

		WebElement FromDate = driver.findElement(By.xpath("//td[@class='available'][normalize-space()='2']"));

		FromDate.click();

		toDate_btn.click();

		Select C = new Select(to_Years);
		C.selectByVisibleText("2026");

		Select D = new Select(to_months);
		D.selectByVisibleText("Jan");

		WebElement ToDate = driver
				.findElement(By.xpath("//td[@class='today active start-date active end-date available']"));

		ToDate.click();

		// FromDate.click();

		Export_btn.click();
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Ok_btn)).click();		

	}

}
