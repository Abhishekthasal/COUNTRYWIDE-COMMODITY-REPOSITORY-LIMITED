package TestPages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Margin_Pledge_Checker {

	WebDriver driver;
	WebDriverWait Wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public Margin_Pledge_Checker(WebDriver driver, WebDriverWait Wait) {

		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);
	}

	// --------------for Request for Margin_Pledge_Checker creation
	// process-------------

	@FindBy(xpath = "//span[normalize-space()='Margin Pledge']")
	WebElement Margin_Pledge_Btn;

	@FindBy(xpath = "//span[@class='title ng-binding'][normalize-space()='Margin Pledge Request']")
	WebElement Margin_Pledge_Request_Btn;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement Search_Txt;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement Search_Btn;

	@FindBy(xpath = "//button[normalize-space()='Actions']")
	WebElement Actions_Btn;

	@FindBy(xpath = "//a[normalize-space()='Authorize']")
	WebElement Authorize_Btn;

	@FindBy(xpath = "//label[normalize-space()='Authorize']")
	WebElement Authorize_Chek;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	WebElement Save_Btn;

	public void Margin_Pledge_Request_Checker() throws InterruptedException {

		Margin_Pledge_Btn.click();

		Margin_Pledge_Request_Btn.click();

		Search_Txt.sendKeys(Margin_Pledge_Request.Margin_pledge_Req_No);

		Search_Btn.click();

		Actions_Btn.click();

		Authorize_Btn.click();

		Thread.sleep(1000);
		try {
			if (Authorize_Chek.isDisplayed()) {
				Authorize_Chek.click();
			} else {
				System.out.println("We are unable to click the Authorize_Chek CheckBox");
			}
		} catch (ElementClickInterceptedException e) {
			System.out.println("Normal click failed, trying JavaScript Authorize_Chek click...");
			js.executeScript("arguments[0].click();", Authorize_Chek);
		} catch (NoSuchElementException e) {
			System.out.println("Authorize_Chek not found: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error for Authorize_Chek: " + e.getMessage());
		}

		try {
			if (Save_Btn.isDisplayed()) {
				Save_Btn.click();
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
