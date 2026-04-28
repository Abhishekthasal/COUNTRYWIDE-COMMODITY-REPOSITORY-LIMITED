package TestPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pledge_Invocation_Request_Authorized {
	
	
	WebDriver driver;
	WebDriverWait Wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	// public int pledge_Req_Number= 234567;

	public Pledge_Invocation_Request_Authorized(WebDriver driver, WebDriverWait Wait) {
		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);
	}

	// --------------for Request for Pledge creation process-------------
	@FindBy(xpath = "//span[normalize-space()='Transactions']")
	WebElement Transaction_Btn;

	public void Pledge_Invocation_Authorized() {
		
		
		
		
		
		
		
	}
	

}
