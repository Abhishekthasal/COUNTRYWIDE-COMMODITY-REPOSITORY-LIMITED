package TestCase;

import org.testng.annotations.AfterMethod;
//import java.time.Duration;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestPages.BaseClass;
import TestPages.DashBoard_WareHouse_Checker;
import TestPages.Deposit_Confirm_WH_Checker;
import TestPages.Deposit_Confirm_WH_Maker;
import TestPages.Deposite_Assayer_Checker;
import TestPages.Deposite_Assayer_Maker;
import TestPages.LoginPages;
import TestPages.Physical_Deposit_Maker;
import TestPages.RP_Deposite_Request_Agriculture_Maker;
import TestPages.RP_Deposite_Request_Checker;

public class PositiveTestCase extends BaseClass {


 @BeforeMethod void LoginPages() {
	LoginPages Log = new LoginPages(driver, Wait);

	  Log.PortalLogin("Rp-Abhishek", "user51", "121@test");
	  //Log.PortalLogin("RP-Abhishek", "user52", "121@test");
	  //Log.PortalLogin("wsp9996059", "user104", "121@test");
	  //Log.PortalLogin("wsp9996059", "user103", "121@test");
	  //Log.PortalLogin("Assayer01", "user1", "121@test");
	  //Log.PortalLogin("Assayer01", "user2", "121@test");

	  }


@Test
	void RP_Deposite_Request_Maker() {
	RP_Deposite_Request_Agriculture_Maker Depo = new RP_Deposite_Request_Agriculture_Maker(driver, Wait);
		Depo.General_Deposite_Request();
	}

	void RP_Deposite_Request_Checker() {
		RP_Deposite_Request_Checker Dash = new RP_Deposite_Request_Checker(driver, Wait);
		Dash.Deposite_Request();

	}

@Test
void LogoutPage() {
		TestPages.LogoutPage Log = new TestPages.LogoutPage(driver, Wait);
		Log.Logout();
	}

	void DashBord_WareHouse_Maker() {
		Physical_Deposit_Maker WSP = new Physical_Deposit_Maker(driver, Wait);
		WSP.General_Physical_Deposit_Maker();
	}

	void DashBoard_WareHouse_Checker() {
		DashBoard_WareHouse_Checker WSP_CH = new DashBoard_WareHouse_Checker(driver, Wait);
		WSP_CH.Transaction();
	}

	void Deposite_Assayer_Maker() {
		Deposite_Assayer_Maker Assayer = new Deposite_Assayer_Maker(driver, Wait);
		Assayer.Deposit_Assayer();
	}

	void Deposite_Assayer_Checker() {
		Deposite_Assayer_Checker Assayer_Auth = new Deposite_Assayer_Checker(driver, Wait);
		Assayer_Auth.Deposit_Assayer();

	}

	void Deposit_Confirm_WH_Maker() {
		Deposit_Confirm_WH_Maker Confirn_Maker = new Deposit_Confirm_WH_Maker(driver, Wait);
		Confirn_Maker.Deposit_Confirm_WH();

	}

	void Deposit_Confirm_WH_Checker() {
		Deposit_Confirm_WH_Checker Confirm = new Deposit_Confirm_WH_Checker(driver, Wait);
		Confirm.Deposit_Confirm_WH();
	}

	@AfterMethod
	public void tearDown() {

		if (driver != null) {
			driver.quit();
		}
	}

}
