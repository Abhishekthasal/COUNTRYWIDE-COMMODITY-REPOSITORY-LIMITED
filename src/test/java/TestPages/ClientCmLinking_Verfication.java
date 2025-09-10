package TestPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utillity.ExcelUtils;

public class ClientCmLinking_Verfication {

	WebDriver driver;
	WebDriverWait Wait;
	static String path = "C:\\Users\\abhishekyt\\git\\repository\\Automation\\Data\\TestData.xlsx";
	static String sheet = "Physical_Deposit_Maker";
	static int dataRow = 1; // second row of data
	static ExcelUtils excel = new ExcelUtils(path, sheet); 

	String Bag_Total = excel.getBag_Total_py(dataRow);
	static int totalBags = excel.gettotalBags(dataRow);
	int updated_Bags;
	int j = 3;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public ClientCmLinking_Verfication(WebDriver driver, WebDriverWait Wait) {
		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//span[@class='title ng-binding'][normalize-space()='Transactions'])[1]")
	WebElement Transaction_btn;
}
