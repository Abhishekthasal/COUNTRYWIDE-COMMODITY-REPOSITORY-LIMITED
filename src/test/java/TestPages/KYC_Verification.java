package TestPages;

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

public class KYC_Verification {
	
	WebDriver driver;
	WebDriverWait Wait;
	static String path = "C:\\Users\\abhishekyt\\git\\repository\\Automation\\Data\\TM_CM_Linking.xlsx";
	static String sheet = "ClientCmLinking_RP";
	static int dataRow = 1; // second row of data
	static ExcelUtils excel = new ExcelUtils(path, sheet);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public KYC_Verification(WebDriver driver, WebDriverWait Wait) {
		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	WebElement KYC_Requird_btn;
	// span[normalize-space()='Client CM Linking']
	@FindBy(xpath = "//input[@name='PanNo']")
	WebElement Pancord_txt;

	@FindBy(xpath = "//button[normalize-space()='VERIFY PAN']")
	WebElement VERIFY_PAN_bttn;
	
	
	public void KYC_Verification_Process() throws InterruptedException {
		Thread.sleep(4000);
		try {
			if (KYC_Requird_btn.isDisplayed()) {
				
				Wait.until(ExpectedConditions.elementToBeClickable(KYC_Requird_btn)).click();
			} else {
				System.out.println("KYC_Requird_btn is not visible");
			}

		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript KYC_Requird_btn click...");
			js.executeScript("arguments[0].click();", KYC_Requird_btn);
		} catch (NoSuchElementException e) {
			System.out.println("KYC_Requird_btn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for KYC_Requird_btn: " + e.getMessage());
		}

		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(Pancord_txt)).sendKeys("BPTPT5612N");
		
		Thread.sleep(2000);
		Wait.until(ExpectedConditions.elementToBeClickable(VERIFY_PAN_bttn)).click();
	
	
	
	
	
	}
}
