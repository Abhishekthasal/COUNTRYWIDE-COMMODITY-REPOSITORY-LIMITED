package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Extension_Of_ENWR_Request {

	WebDriver driver;
	WebDriverWait Wait;

	public Extension_Of_ENWR_Request(WebDriver driver, WebDriverWait Wait) {
		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(xpath = "//span[normalize-space()='Transactions']")
	WebElement Transactions_Btn;
	
	@FindBy(xpath = "//span[normalize-space()='Extension Of Validity Request']")
	WebElement Extension_Of_Validity_Request_Btn;
	
	@FindBy(xpath="//button[normalize-space()='New']")
	WebElement New_Btn;
	
	@FindBy(xpath="//input[@name='Instr_Slip_No']")
	WebElement Instr_Slip_No_Txt;
	
	@FindBy(xpath="//input[@id='Request_Date']")
	WebElement Request_Date_Txt;
	
	@FindBy(xpath="//td[@class='today active start-date active end-date in-range available']")
	WebElement Todays_Date;
	
	
	@FindBy(xpath="//input[@id='Execution_Date']")
	WebElement Execution_Date_Txt;
	
	
	
	
	
	public void Extension_Of_ENWR_Request_Maker() {

		Transactions_Btn.click();
		
		Extension_Of_Validity_Request_Btn.click();
		
		New_Btn.click();
		
		Instr_Slip_No_Txt.sendKeys("9012026A");
		
		Request_Date_Txt.click();
		
		Todays_Date.click();
		
		Execution_Date_Txt.click();
		
		
		
		
	}

}
