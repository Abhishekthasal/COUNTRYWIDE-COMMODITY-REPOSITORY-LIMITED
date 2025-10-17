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

public class CM_RePledge_Request_Confirm {
	
	WebDriver driver;
	WebDriverWait Wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	static String path = "C:\\Users\\abhishekyt\\git\\repository\\Automation\\Data\\Margin_Pledge.xlsx";
	static String sheet = "Margin_Pledge_Request";
	static int dataRow = 1; // second row of data
	static ExcelUtils excel = new ExcelUtils(path, sheet);

	// public int ce_cc_id_Release = excel.getce_cc_id_Pay_Out_Release(dataRow); //


	long Client_Id = 180000110000033L;


//100673000019391
	public CM_RePledge_Request_Confirm(WebDriver driver, WebDriverWait Wait) {

		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);
	}

	// --------------for Request for CM_RePledge_Request_Confirm creation process-------------//

		@FindBy(xpath = "//span[normalize-space()='Margin Pledge']")
		WebElement Margin_Pledge_Btn;

		@FindBy(xpath = "//span[normalize-space()='CM Re-Pledge Request Confirm']")
		WebElement CM_RePledge_Request_Confirm_Btn;

		@FindBy(xpath = "//button[normalize-space()='New']")
		WebElement New_Btn;

		@FindBy(xpath = "//input[@name='client_id']")
		WebElement client_id_Txt;

		@FindBy(xpath = "//button[normalize-space()='Search']")
		WebElement Search_Btn;

		@FindBy(xpath = "(//button[@class='btn btn-default btn-xs'][normalize-space()='Select'])[1]")
		WebElement Select_Btn;
		
		@FindBy(xpath="//span[normalize-space()='Save']")
		WebElement Save_Btn;



	public void CM_RePledge_Request_Confirm_Maker() throws InterruptedException {
		
		Margin_Pledge_Btn.click();

		CM_RePledge_Request_Confirm_Btn.click();

		New_Btn.click();

		try {
			if (String.valueOf(Client_Id).matches("^[0-9]{0,15}$")) {
		Wait.until(ExpectedConditions.elementToBeClickable(client_id_Txt)).sendKeys(String.valueOf(Client_Id));
			} else {
				System.out.println("Invalid Deposite. Please enter 15 numeric characters:");
			}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript client_id_Txt click...");
			js.executeScript("arguments[0].value='" + Client_Id + "';", client_id_Txt);
		} catch (NoSuchElementException e) {
			System.out.println("client_id_Txt not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for client_id_Txt: " + e.getMessage());
		}
		
		Search_Btn.click();

		
		//String xpath = "//div[contains(text(),'" + value + "')]/following::div[@class='ui-grid-cell-contents ng-scope'][1]";
		//driver.findElement(By.xpath(xpath)).click();
		
		Select_Btn.click();
		Thread.sleep(2000);
		
		try {
			if (Save_Btn.isDisplayed()) {
				Wait.until(ExpectedConditions.elementToBeClickable(Save_Btn)).click();
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
