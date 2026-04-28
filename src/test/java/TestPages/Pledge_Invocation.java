package TestPages;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utillity.DataBaseUtility;

public class Pledge_Invocation {
	WebDriver driver;
	WebDriverWait Wait;
	
	
	double Pledgee_Client_Id;
	String Pledge_Seq_No;
	
	public Pledge_Invocation(WebDriver driver, WebDriverWait Wait) {
		this.driver = driver;
		this.Wait = Wait;
		PageFactory.initElements(driver, this);
	}
	// --------------for Request for Pledge creation process-------------
		@FindBy(xpath = "//span[normalize-space()='Transactions']")
		WebElement Transaction_Btn;
	
		@FindBy(xpath="//span[normalize-space()='Pledge Invocation']")
		WebElement Pledge_Invocation_Btn;
	
		@FindBy(xpath = "//button[normalize-space()='New']")
		WebElement New_Button;
		
		@FindBy(xpath="(//input[@class='form-control ng-pristine ng-valid ng-empty ng-valid-maxlength ng-touched'])[1]")
		WebElement Pledgee_Client_Id_txt;
		
		@FindBy(xpath="//input[@ng-class=\"{'edited':vm.PledgeInvocation.pledge_Sequence_No}\"]")
		WebElement pledge_Sequence_No_txt;
		
		

	public void Pledge_Invocation_Request() {
		
		
		try {
			Connection conn = DataBaseUtility.getConnection();

			String Internal_Reference = "select Pledge_Seq_No from pledge_req where Pledge_Req_No like  ?";
			PreparedStatement Internal_Reference_Id = conn.prepareStatement(Internal_Reference);
			Internal_Reference_Id.setString(1, "%" + Pledge_Creation.pledge_Req_Number + "%");
			ResultSet rs1 = Internal_Reference_Id.executeQuery();
			if (rs1.next()) {
				Pledge_Seq_No = rs1.getString("Pledge_Seq_No");
				System.out.println("Pledge_Seq_No print: " + Pledge_Seq_No);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		Transaction_Btn.click();
		
		Pledge_Invocation_Btn.click();
		
		New_Button.click();
		
		Pledgee_Client_Id_txt.sendKeys(String.valueOf(Pledgee_Client_Id));
		
		pledge_Sequence_No_txt.sendKeys(String.valueOf(Pledge_Seq_No));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
