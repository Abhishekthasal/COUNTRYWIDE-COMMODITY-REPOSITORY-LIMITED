package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Pledge_Creation_WareHouse {


	WebDriver driver;
	WebDriverWait Wait;

	public Pledge_Creation_WareHouse(WebDriver driver, WebDriverWait Wait) {
		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);
	}

	//--------------for Request for Pledge creation process-------------
		 @FindBy(xpath = "//span[normalize-space()='Transactions']")
		WebElement Transaction_Btn;

		@FindBy(xpath = "//span[normalize-space()='Pledge Creation Approval']")
		WebElement Pledge_Creation_Approval;

		@FindBy(xpath="(//button[normalize-space()='New'])[1]")
		WebElement New_Button;

		@FindBy(xpath="(//input[@name='client_id'])[1]")
		WebElement client_id_Text;

		@FindBy(xpath="(//input[@name='location'])[1]")
		WebElement location;

		@FindBy(xpath="(//input[@name='commodity'])[1]")
		WebElement commodity_txt;

		@FindBy(xpath="//button[normalize-space()='Search']")
		WebElement Search_Button;

		@FindBy(xpath="//button[normalize-space()='Select']")
		WebElement Select;
		
		@FindBy(xpath="//button[@class='btn btn-primary blue']//span[contains(text(),'Verify')]")
		WebElement verify_button;
		
		@FindBy(xpath="//span[normalize-space()='Save']")
		WebElement save_button;
		


		public void Pledge_Creation_WareHouse_Approval() {


			Transaction_Btn.click();
			Assert.assertTrue(Transaction_Btn.isDisplayed(), "Transaction button not visible");

			Pledge_Creation_Approval.click();
			Assert.assertTrue(Pledge_Creation_Approval.isDisplayed(), "Pledge_Creation_Approval button not visible");

			New_Button.click();
			Assert.assertTrue(New_Button.isDisplayed(), "New button not visible");

			client_id_Text.sendKeys(String.valueOf(Pledge_Creation.Client_ID));
			Assert.assertTrue(client_id_Text.isDisplayed(), "client_id Text Box not visible");

			//location.sendKeys("Indore");
			Assert.assertTrue(location.isDisplayed(), "location Text Box not visible");

			/*int Com = Pledge_Creation.Commodity;

			switch (Com) {
			    case 1:
			    	commodity_txt.sendKeys("WHEAT");
			        System.out.println("Processing WHEAT...");
			        break;
			    case 15:
			    	commodity_txt.sendKeys("COTTON BALES");
			        System.out.println("Processing COTTON BALES...");
			        break;
			    case 100:
			    	commodity_txt.sendKeys("RUBBER");
			        System.out.println("Processing RUBBER...");
			        break;
			    case 13:
			    	commodity_txt.sendKeys("SOYABEAN");
			        System.out.println("Processing SOYABEAN...");
			        break;
			    default:
			        System.out.println("Unknown commodity.");
			        break;  
			}*/
			Search_Button.click();
			//Wait.until(ExpectedConditions.elementToBeClickable(Search_Button)).click();
			Select.click();
			//Wait.until(ExpectedConditions.elementToBeClickable(Select)).click();

			Wait.until(ExpectedConditions.elementToBeClickable(verify_button)).click();		

			Wait.until(ExpectedConditions.elementToBeClickable(save_button)).click();
}
}


