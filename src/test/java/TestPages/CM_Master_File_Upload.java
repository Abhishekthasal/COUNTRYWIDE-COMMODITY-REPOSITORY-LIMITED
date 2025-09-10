package TestPages;

import java.time.Duration;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utillity.ExcelUtils;

public class CM_Master_File_Upload {

	WebDriver driver;
	WebDriverWait Wait;
	static String path = "C:\\Users\\abhishekyt\\git\\repository\\Automation\\Data\\TestData.xlsx";
	static String sheet = "Physical_Deposit_Maker";
	static int dataRow = 1; // second row of data
	static ExcelUtils excel = new ExcelUtils(path, sheet); 

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public CM_Master_File_Upload(WebDriver driver, WebDriverWait Wait) {
		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[normalize-space()='Imports']")
	WebElement Imports_btn;
	
	@FindBy(css="a[ui-sref='Imports.CMUpload'] span[class='title ng-binding']")
	WebElement CM_Master_Upload_bttn;
	
	@FindBy(xpath="(//input[@id='files'])[1]")
	WebElement Upload_files;
	@FindBy(xpath="//span[normalize-space()='CM Master File Upload']")
	WebElement CM_Master_File_Upload_txt;
	
	@FindBy(xpath="//button[normalize-space()='Yes']")
	WebElement Are_you_sure_popup;
	
	
	
	
	public void CM_Master_File_Upload_CC() {
		
		
		Wait.until(ExpectedConditions.elementToBeClickable(Imports_btn)).click();
		
		Wait.until(ExpectedConditions.elementToBeClickable(CM_Master_Upload_bttn)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		System.out.println(CM_Master_File_Upload_txt.getText());
		
		
		if(Upload_files.isDisplayed()) {
			
			System.out.println("Upload_files is displayed");
		}
		else {
			System.out.println(" File uploaded not displayed");
		}
			try {
		Wait.until(ExpectedConditions.elementToBeClickable(Upload_files)).sendKeys("D:\\Abhishek Thasal\\Test\\CCRL Test\\CM_Master_AK.xlsx");
		System.out.println("✅ File uploaded successfully");
			}
			catch (Exception e) {
				System.out.println("File uploaded:"+e.getMessage());		
				}
		/*else {
			System.out.println(" File uploaded not selected");
		}*/
		
		Wait.until(ExpectedConditions.elementToBeClickable(Are_you_sure_popup)).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
	}
	
	
	
	
}
