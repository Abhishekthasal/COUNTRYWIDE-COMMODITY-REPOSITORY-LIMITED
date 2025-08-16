package TestPages;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utillity.DataBaseUtility;
import Utillity.ExcelUtils;

public class Withdrawal_Confirm_WSP_Maker {
	
	WebDriver driver;
	WebDriverWait Wait;

	static String path = "C:\\Users\\eclipse\\Desktop\\Automation-Testing-2025\\Eclipse\\Automation\\Data\\Withdrawal.xlsx";
	static String sheet = "Withdrawal_Request";
	static int dataRow = 2; // second row of data
	JavascriptExecutor js = (JavascriptExecutor) driver;
	static ExcelUtils excel = new ExcelUtils(path, sheet);
	int DRN_Number;
	int auth_code;
	/*
	 * public static int Withdrawal_Request_No = 9996059; public static int WH_ID =
	 * 5750013; public long Client_ID = 100673000000011L; public static long ENWR =
	 * 110001018628l; String Commodity_Segment="Agricultural";
	 */
	public static int Withdrawal_Request_No = excel.getWithdrawal_Request_No(dataRow);
	public static int WH_ID = excel.getWH_ID_Withdrawal(dataRow);
	String Commodity_Segment = excel.getCommodity_Segment_Withdrawal(dataRow);
	int Commodity_Code = excel.getCommodity_Code_Withdrawal(dataRow);
	public long Client_ID = excel.getClient_ID_Withdrawal(dataRow);
	public static long ENWR = excel.getENWR_Withdrawal(dataRow);
	int noOfBag = excel.getnoOfBag_Withdrawal(dataRow); 

	public Withdrawal_Confirm_WSP_Maker(WebDriver driver, WebDriverWait Wait) {
		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//span[normalize-space()='Transactions'])[1]")
	WebElement Transaction_Btn;

	@FindBy(xpath = "//span[normalize-space()='Withdrawal Confirm']")
	WebElement Withdrawal_Confirm_bttn;
	
	@FindBy(xpath="//button[normalize-space()='New']")
	WebElement New_bttn;
	
	@FindBy(xpath="//input[@name='drn11']")
	WebElement Internal_Reference_No;
	
	@FindBy(xpath="//input[@name='auth_code']")
	WebElement auth_code_txt;
	
	
	
	public void Withdrawal_Confirm_WSP() {
		
		Transaction_Btn.click();		
		
		Withdrawal_Confirm_bttn.click();
		
		New_bttn.click();
		try {
			Connection conn = DataBaseUtility.getConnection();

			String query_DRN = "select Id from withdrawal_req where WRN_id LIKE ? ;";
			PreparedStatement stmt = conn.prepareStatement(query_DRN);
			stmt.setString(1, "%" + Withdrawal_Function.Withdrawal_Request_No + "%"); // bind the variable to query

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				 DRN_Number = rs.getInt("ID"); 
				System.out.println("DRN_NO is : " + DRN_Number);

				rs.close();
				stmt.close();
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Internal_Reference_No.sendKeys(String.valueOf(DRN_Number));
		
		try {
			Connection conn = DataBaseUtility.getConnection();

			String query_OTP = "SELECT a.auth_code FROM auth_code_generation a JOIN withdrawal_req d ON a.ref_id = d.Id WHERE  d.WRN_id LIKE ? and a.tran_type='WR';";
			PreparedStatement stmt = conn.prepareStatement(query_OTP);
			stmt.setString(1, "%" + Withdrawal_Function.Withdrawal_Request_No + "%"); // bind the variable to query

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				auth_code = rs.getInt("auth_code"); 
				System.out.println("DRN_NO is : " + auth_code);

				rs.close();
				stmt.close();
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		auth_code_txt.sendKeys(String.valueOf(auth_code));
		
		
		
		
	}

}
