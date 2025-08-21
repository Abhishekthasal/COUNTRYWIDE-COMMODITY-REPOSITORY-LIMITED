package TestPages;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Withdrawal_Function_Checker {

	WebDriver driver;
	WebDriverWait Wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public Withdrawal_Function_Checker(WebDriver driver, WebDriverWait Wait) {
		this.driver = driver;
		this.Wait = Wait; 
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//span[normalize-space()='Transactions'])[1]")
	WebElement Transaction_Btn;

	@FindBy(xpath = "(//span[@class='title ng-binding'][normalize-space()='Withdrawal Request'])[1]")
	WebElement Withdrawal_Request;

	@FindBy(xpath="//span[@class='title ng-binding'][normalize-space()='Withdrawal Confirm']")
	WebElement Withdrawal_Confirm_bttn;
	
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement Search_Txt;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit_bttn;

	@FindBy(xpath = "//button[normalize-space()='Actions']")
	WebElement Actions_Bttn;

	@FindBy(xpath = "//a[normalize-space()='Authorize']")
	WebElement Authorize_Bttn;
	
	@FindBy(xpath = "//div[@role='dialog']")
	WebElement Scroll;
	//label[normalize-space()='Authorize']
	//(//input[@id='EditDeposit_Checked'])
	@FindBy(xpath = "(//input[@id='EditDeposit_Checked'])")
	WebElement Authorize_chek;

	@FindBy(xpath = "//button[@class='btn btn-primary blue']//span[contains(text(),'Verify')]")
	WebElement verify_bttn;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	WebElement Save_Bttn;

	public void Withdrawal_Checker() {

		Transaction_Btn.click();

		Withdrawal_Request.click();
		

		if (String.valueOf(Withdrawal_Function.Withdrawal_Request_No).matches("^[a-zA-Z0-9]{0,16}$")) {
			Search_Txt.sendKeys(String.valueOf(Withdrawal_Function.Withdrawal_Request_No));
		} else {
			System.out.println("Invalid Withdrawal_Request_No ");
		}
		submit_bttn.click();

		Actions_Bttn.click();

		Authorize_Bttn.click();
 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		Scroll.sendKeys(Keys.PAGE_DOWN);
		Scroll.sendKeys(Keys.PAGE_DOWN);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		try {
			if (Authorize_chek.isDisplayed() && Authorize_chek.isEnabled()) {
				Wait.until(ExpectedConditions.elementToBeClickable(Authorize_chek)).click();
			} else {
				System.out.println("Authorize_chek box is not visible");
			}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Authorize_chek click...");
			js.executeScript("arguments[0].click();", Authorize_chek);
		} catch (NoSuchElementException e) {
			System.out.println("Authorize_chek not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for Authorize_chek: " + e.getMessage());
		}
		try {
			if (verify_bttn.isDisplayed() && verify_bttn.isEnabled()) {
				Wait.until(ExpectedConditions.elementToBeClickable(verify_bttn)).click();
			} else {
				System.out.println("verify_bttn is not visible");
			}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript verify_bttn click...");
			js.executeScript("arguments[0].click();", verify_bttn);
		} catch (NoSuchElementException e) {
			System.out.println("verify_bttn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for verify_bttn: " + e.getMessage());
		}
		try {
			if (Save_Bttn.isDisplayed() && Save_Bttn.isEnabled()) {
				Wait.until(ExpectedConditions.elementToBeClickable(Save_Bttn)).click();
			} else {
				System.out.println("Save_Bttn is not visible");
			}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Save_Bttn click...");
			js.executeScript("arguments[0].click();", Save_Bttn);
		} catch (NoSuchElementException e) {
			System.out.println("Save_Bttn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for Save_Bttn: " + e.getMessage());
		}

	}

	public void Withdrawal_Confirm() {
		
		Transaction_Btn.click();

		Withdrawal_Confirm_bttn.click();

		if (String.valueOf(Withdrawal_Function.Withdrawal_Request_No).matches("^[a-zA-Z0-9]{0,16}$")) {
			Search_Txt.sendKeys(String.valueOf(Withdrawal_Function.Withdrawal_Request_No));
		} else {
			System.out.println("Invalid Withdrawal_Request_No ");
		}
		submit_bttn.click();

		Actions_Bttn.click();

		Authorize_Bttn.click();

		try {
			if (Authorize_chek.isDisplayed() && Authorize_chek.isEnabled()) {
				Wait.until(ExpectedConditions.elementToBeClickable(Authorize_chek)).click();
			} else {
				System.out.println("Authorize_chek box is not visible");
			}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Authorize_chek click...");
			js.executeScript("arguments[0].click();", Authorize_chek);
		} catch (NoSuchElementException e) {
			System.out.println("Authorize_chek not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for Authorize_chek: " + e.getMessage());
		}
		try {
			if (verify_bttn.isDisplayed() && verify_bttn.isEnabled()) {
				Wait.until(ExpectedConditions.elementToBeClickable(verify_bttn)).click();
			} else {
				System.out.println("verify_bttn is not visible");
			}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript verify_bttn click...");
			js.executeScript("arguments[0].click();", verify_bttn);
		} catch (NoSuchElementException e) {
			System.out.println("verify_bttn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for verify_bttn: " + e.getMessage());
		}
		try {
			if (Save_Bttn.isDisplayed() && Save_Bttn.isEnabled()) {
				Wait.until(ExpectedConditions.elementToBeClickable(Save_Bttn)).click();
			} else {
				System.out.println("Save_Bttn is not visible");
			}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Save_Bttn click...");
			js.executeScript("arguments[0].click();", Save_Bttn);
		} catch (NoSuchElementException e) {
			System.out.println("Save_Bttn not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for Save_Bttn: " + e.getMessage());
		}

		
	}
}
