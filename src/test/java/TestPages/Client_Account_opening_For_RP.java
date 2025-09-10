package TestPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Client_Account_opening_For_RP {

	WebDriver driver;
	WebDriverWait Wait;
	static int clientid_Num = 9090;
	String FormID = "3214";
	static String Client_holder_Name = "CCRL_HR";
	String Client_Type = "Individual";
	String Client_Sub_Type = "Individual";
	String Frequency = "Annually";
	String Statement = "Physical";
	String Line1 = "Lep Gaulwadi";
	String Line2 = "Mhasala";
	String Line3 = "Raigad";
	String Line4 = "Lep";
	String City = "Mhasala";
	int PinCode = 401202;
	int mobile_Isd = 91;
	static long mobile_NUmber = 9730150615L;
	String Email_Id = "Abdj@gmail.com";
	int Account_No = 9696696;
	String IFSC = "HDFC0000002";
	String BankAccount = "Saving Bank Account";
	String IncomeRange = "500001-1000000";
	String PanCardNo = "PBTPT5612N";
	String POI = "PAN CARD";
	String POA = "AADHAR CARD (POA)";
	String Authsignatory_Name = "Abhishek Thasal";
	String Authorized_Representative_Name = "Kalpesh";

	public Client_Account_opening_For_RP(WebDriver driver, WebDriverWait Wait) {

		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//li[@class='nav-item ng-scope start']//a[@class='auto ng-scope']")
	WebElement Client;

	@FindBy(xpath = "//span[normalize-space()='Account Opening']")
	WebElement Account_Opening;

	@FindBy(xpath = "//button[normalize-space()='New']")
	WebElement New;

	@FindBy(xpath = "(//span[@class='box'])[1]")
	WebElement Choice;

	@FindBy(xpath = "//input[@name='clientid']")
	WebElement clientid;

	@FindBy(xpath = "//input[@id='formNo']")
	WebElement formNo;

	@FindBy(xpath = "//input[@name='holder_Name']")
	WebElement Client_Name;

	@FindBy(xpath = "//button[@data-id='ClientSubTypeSelectionCombobox']//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED']")
	WebElement Client_Sub_Type_checkBox;

	@FindBy(xpath = "//select[@id='ClientStatusSelectionCombobox']")
	WebElement Client_Type_btn;

	@FindBy(xpath = "//div[@class='tab-content']//li[2]//a[1]")
	WebElement Individual_Sub_Type;

	@FindBy(xpath = "//div[@class='tab-content']//li[3]//a[1]")
	WebElement Eligible_Foreign_Entities_Sub_Type;

	@FindBy(xpath = "//div[@class='tab-content']//li[4]//a[1]")
	WebElement Private_Trust_Sub_Type;

	@FindBy(xpath = "//div[@class='tab-content']//li[5]//a[1]")
	WebElement FARMER_Sub_Type;

	@FindBy(xpath = "//select[@ng-model='vm.CreateClientMaster.stmt_frq' and contains(@class, 'form-control') and @ng-disabled='vm.CanAuthorise']")
	WebElement Statement_Frequency;

	@FindBy(xpath = "//select[contains(@class, 'form-control') and contains(@class, 'ng-pristine') and @ng-model='vm.CreateClientMaster.statementtyp']")
	WebElement Statement_Type;

	@FindBy(xpath = "(//a[normalize-space()='Address'])[1]")
	WebElement Address;

	@FindBy(xpath = "(//input[@id='Address1'])[1]")
	WebElement Address1;

	@FindBy(xpath = "(//input[@name='address2'])[1]")
	WebElement address2;

	@FindBy(xpath = "(//input[@name='address3'])[1]")
	WebElement address3;
	@FindBy(xpath = "(//input[@name='address4'])[1]")
	WebElement address4;
	@FindBy(xpath = "(//input[@name='address5'])[1]")
	WebElement City_Text;

	@FindBy(xpath = " (//input[@name='PerPIN'])[1]")
	WebElement PinCode_Text;

	@FindBy(xpath = "(//input[@name='mobile1_Isd'])[1]")
	WebElement mobile1_Isd;
	@FindBy(xpath = "(//input[@name='mobile_1'])[1]")
	WebElement mobile_No;
	@FindBy(xpath = "(//input[@name='email1'])[1]")
	WebElement Email;

	@FindBy(xpath = "(//a[normalize-space()='Bank Details'])[1]")
	WebElement Bank_Details;

	@FindBy(xpath = "(//a[normalize-space()='Correspondence Address'])[1]")
	WebElement Correspondence;

	@FindBy(xpath = "//label[@for='EditClient_SameAddress']//span[@class='box']")
	WebElement Same_as_Permanent_Address;

	@FindBy(xpath = "(//input[@id='bank_Account_No'])[1]")
	WebElement bank_Account_No;

	@FindBy(xpath = "(//input[@name='ifsc'])[1]")
	WebElement ifsc_No;

	@FindBy(xpath = "//span[@class='filter-option pull-left'][normalize-space()='NOTHING SELECTED']")
	WebElement MICR;

	@FindBy(xpath = "//div[@class='tab-pane ng-scope active']//li[2]//a[1]")
	WebElement MICR_Code;

	@FindBy(xpath = " (//select[@id='BankAccTypeSelectionCombobox'])[1]")
	WebElement BankAccType;

	@FindBy(xpath = "(//select[@id='IncomeRangeSelectionCombobox'])[1]")
	WebElement IncomeRangeSelection;

	@FindBy(xpath = "//a[normalize-space()='Documents']")
	WebElement Documents;

	@FindBy(xpath = "(//input[@id='PanNo'])[1]")
	WebElement PanNo;

	@FindBy(xpath = "(//select[@id='POASelectionCombobox'])[1]")
	WebElement POI_Documents;

	@FindBy(xpath = "(//select[@id='POISelectionCombobox'])[1]")
	WebElement POASelection;

	@FindBy(xpath = "(//a[normalize-space()='Authorized Signatory'])[1]")
	WebElement Authorized_Signatory;

	@FindBy(xpath = "(//input[@name='authsignatoryname'])[1]")
	WebElement authsignatoryname;

	@FindBy(xpath = "//a[normalize-space()='Authorized Representative']")
	WebElement Representative;

	@FindBy(xpath = "//input[@name='authrepresentname']")
	WebElement Authorized_Representative;

	@FindBy(xpath = "(//button[@ng-show='!ClientForm.$invalid'])[1]")
	WebElement Verify_Button;

	@FindBy(xpath = "(//i[@class='fa fa-save'])[1]")
	WebElement Save_Button;

	public void Client_Account_opening() {

		Wait.until(ExpectedConditions.elementToBeClickable(Client)).click();

		Wait.until(ExpectedConditions.elementToBeClickable(Account_Opening)).click();

		Wait.until(ExpectedConditions.elementToBeClickable(New)).click();

		Wait.until(ExpectedConditions.elementToBeClickable(Choice)).click();

		clientid.click();
		Wait.until(ExpectedConditions.elementToBeClickable(clientid)).sendKeys(String.valueOf(clientid_Num));

		formNo.sendKeys(Keys.ENTER);
		Wait.until(ExpectedConditions.elementToBeClickable(formNo)).sendKeys(FormID);
		formNo.click();

		Client_Name.sendKeys(Keys.ENTER);
		Client_Name.sendKeys(Client_holder_Name);

		Select Sa = new Select(Client_Type_btn);
		Sa.selectByContainsVisibleText(Client_Type);

		Wait.until(ExpectedConditions.elementToBeClickable(Client_Sub_Type_checkBox)).click();

		if (Client_Sub_Type.equals("Individual")) {
			Wait.until(ExpectedConditions.elementToBeClickable(Individual_Sub_Type)).sendKeys(Keys.ENTER);
		} else if (Client_Sub_Type.equals("Eligible Foreign Entities (EFEs)")) {
			Wait.until(ExpectedConditions.elementToBeClickable(Eligible_Foreign_Entities_Sub_Type))
					.sendKeys(Keys.ENTER);
		} else if (Client_Sub_Type.equals("Private Trust / Trustee")) {
			Wait.until(ExpectedConditions.elementToBeClickable(Private_Trust_Sub_Type)).sendKeys(Keys.ENTER);
		} else if (Client_Sub_Type.equals("FARMER")) {
			Wait.until(ExpectedConditions.elementToBeClickable(FARMER_Sub_Type)).sendKeys(Keys.ENTER);
		} else {
			System.out.println("Client_Sub_Type is not valid");
		}

		Select Statet = new Select(Statement_Frequency);
		Statet.selectByContainsVisibleText(Frequency);

		Select D = new Select(Statement_Type);
		D.selectByContainsVisibleText(Statement);

		Address.click();

		Address1.sendKeys(Line1);
		address2.sendKeys(Line2);
		address3.sendKeys(Line3);
		address4.sendKeys(Line4);
		City_Text.sendKeys(City);
		PinCode_Text.sendKeys(String.valueOf(PinCode));

		mobile1_Isd.sendKeys(String.valueOf(mobile_Isd));

		mobile_No.sendKeys(String.valueOf(mobile_NUmber));
		Email.sendKeys(Email_Id);

		Correspondence.click();

		Same_as_Permanent_Address.click();

		Bank_Details.click();

		bank_Account_No.sendKeys(String.valueOf(Account_No));

		ifsc_No.click();
		ifsc_No.sendKeys(String.valueOf(IFSC));
		ifsc_No.sendKeys(Keys.TAB);
		Wait.until(ExpectedConditions.elementToBeClickable(MICR)).click();
		Wait.until(ExpectedConditions.elementToBeClickable(MICR_Code)).click();

		Select S = new Select(BankAccType);
		S.selectByContainsVisibleText(BankAccount);

		Select A = new Select(IncomeRangeSelection);
		A.selectByContainsVisibleText(IncomeRange);

		Documents.click();

		Wait.until(ExpectedConditions.elementToBeClickable(PanNo)).click();
		Wait.until(ExpectedConditions.elementToBeClickable(PanNo)).sendKeys(PanCardNo);

		Select B = new Select(POI_Documents);
		B.selectByContainsVisibleText(POI);

		Select C = new Select(POASelection);
		C.selectByContainsVisibleText(POA);

		Authorized_Signatory.click();

		authsignatoryname.sendKeys(Authsignatory_Name);

		Representative.click();

		Authorized_Representative.sendKeys(Authorized_Representative_Name);

		if (Verify_Button.isEnabled()) {
			Verify_Button.click();
		} else {
			System.out.println("Verify_Button is not enable");
		}

		if (Save_Button.isDisplayed()) {
			Save_Button.click();
		} else {
			System.out.println("Save_Button is not Visible ");
		}

	}

	public void Account_opening_for_CM() {

	}

	public void Account_opening_for_TM() {

	}
}
