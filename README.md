
Automation Testing Report:
 Countrywide Commodity Repository Limited (CCRL) is a warehouse receipt management company in India that provides electronic negotiable warehouse receipts (eNWRs). Automation plays a crucial role in its operations, ensuring efficiency, security, and compliance in commodity storage, trade, and financing.

	Testing Performed:
1)Functional testing - verifies each function of the application against business requirements. It ensures that the system performs as expected.
2)Sanity Testing - Sanity Testing is a type of software testing performed after minor changes (bug fixes, small feature updates) to ensure that the affected functionalities are still working correctly.
3)Field Validation Testing- Field Validation Testing is a type of functional testing that ensures form fields (input fields, dropdowns, checkboxes, etc.) accept valid data and reject invalid data as per business rules
4)Data Base Validation Testing- Database Validation Testing ensures that the data stored in the database is accurate, consistent, and follows business rules. It verifies that data entered through the UI or APIs is correctly stored, retrieved, and updated in the database.
5)Regression Testing -Regression Testing ensures that new code changes do not break existing functionality. It is performed after bug fixes, enhancements, or system updates to verify that everything still works as expected.
Deposit Request Can be Generated From WSP, RP and Client Portal. The Deposit Checker Part Should be From RP Entity.
	Various Entities
1) Warehouse Service Provider /Warehouseman (WSP)
a) Warehouse 
b) Assayer
2)  Repository Participant 
a) RP with RP-Pledgee rights.
b) RP with all rights.
3) Client Portal

General Deposit Functionality for eNWR/eNNWR generation

1)	Deposit Request: Request from WSP/WH/RP/Client Portal 
Below are the system Validations while initiate the deposit request from respective entities 
	Active Client ID
	Active Warehouse
	Insurance policy in force
	Lease agreement validity in force 
	WDRA registered Commodity
	Physical Stock Reconciliation done
	Warehouse registered capacity not breaching.

2)	Physical Deposit: Physical deposit can be accessed by mapped WH users through ‘Organization Unit’ module by WSP admin user with Auto code provided by CCRL client with following validation.

	Valid Auto code
	With selection of Visual Inspection as Accept or Reject
With Accept  system will allow to WH to process further steps of eNWR
With Reject  System will not allow to WH to proceed.
	15% quantity variation (+/-) weighbridge net weight 
	Unique Sample ID with Godown and Stack in Lot Details.
	Weighbridge Net Quantity should be equal to entered GSL quantity 
	GSL entered quantity should be in range between define quantity variation (+/-) as per ECWM master for that exchange and commodity.
	WH checker will re-enter no of bag and GSL entered quantity which are initiated by WH maker user.
	Base Depositor detail required if WH user deposit the exchange deposit.
	eNNWR will generate post WH checker in system


3)	Deposit Assayer: Assayer users can enter WDRA approved Quality parameter value and derived Grade for that Quality standard of the deposited commodities which are mapped with that WDRA approved Commodity for that WH and Created Assayer master for that WH by CCRL user through WH-Assayer -Commodity linking master.

Below are the system validations while initiating the deposit assayer 
	With Correct Sample ID which are used in Physical deposit
	Shelf-life date should be as per CCRL ‘Shelf-Life Validity Extension’ WDRA approved for that commodity.
	WDRA approved grade should be as per ‘Commodity Master’ for that commodity
	Quality Parameter value range as per that ‘Quality Standard’ Master which are define in ‘Commodity Master’.
	eNNWR will generate if assayer user as per selection of check box of “Not meeting Agmark” or others.

4)	Deposit Confirm by WH: WH users can confirm the entered weighbridge new weight quantity which are entered in Physical deposit and Grade, Quality Parameter Value and Self Life date which are entered in deposit assayer.
    Below are the system validations while initiating deposit confirmation
	Shelf-Life date can be edited as per as per CCRL ‘Shelf-Life Validity Extension’ WDRA approved for that commodity.
	eNWR will generate post authorization by WH checker user if Deposit assayer is not select “Not meeting Agmark” or others 
	eNNWR will generate post authorization by WH checker user if Deposit assayer is select “Not meeting Agmark” or others. 


Following is the Result of Automation Testing 
	For deposit request number 3244382, we have carried out complete process of ENWR generation. It has been generated ENWR  110001017943 Successfully.

1)Deposits Request:
a) Deposits Request Maker:
	we can run the RP_Deposite_Request_Maker test for RP.
	Showing the Response time Required to complete Request for Maker.

 

	Showing the Test Result as Pass to complete Request for Maker as Below.
 

b) Deposits Request Checker:
	we can run the RP_Deposite_Request_Checker test for Authorization.
	Showing the Response time Required to complete Authorization for checker.
 



	Showing the Test Result as Pass to complete Request for Deposits Request Checker as below. 




2)Physical Deposit
a) Physical Deposit Maker:
	In this stage WSP man create Physical entry in warehouse where we can 
	Showing the Response time Required to complete flow for Physical Warehouse Maker.
  

	Showing the Test Result as Pass to complete Request for Deposits Request Checker as below.
 


b) Physical Deposit Checker:
	Showing the Response time Required to complete flow for Physical Warehouse Checker.
 


	Showing the Test Result as Pass to complete Request for Physical Deposit Checker as below.
 
3)Assayer
a) Assayer Maker:
	To verify that product Quality and validate of product is store in warehouse also getting Loan and online features for selling the product.
	Showing the Response time Required to complete flow for Assayer Maker.
 


	Showing the Test Result as Pass to complete Request for Assayer Maker as below.
 


b) Assayer Checker:
	Showing the Response time Required to complete flow for Assayer Checker.
 


	Showing the Test Result as Pass to complete Request for Assayer Checker as below.
 








4) Deposit Confirm WH

a) Deposit Confirm WH Maker:
	Showing the Response time Required to complete flow for Deposit Confirm WH Maker.
 

	Showing the Test Result as Pass to complete Request for Deposit Confirm WH Maker as below.
 


b) Deposit Confirm WH Checker:
	Showing the Response time Required to complete flow for Deposit Confirm WH Checker.
 

	Showing the Test Result as Pass to complete Request for Deposit Confirm WH Checker as below.

 





Exchange Deposit Functionality for eNWR/eNNWR generation

1)Deposit Request: Request from WSP/WH/RP/Client Portal 
Below are the system Validations while initiate the deposit request from respective entities 
	Active Client ID
	Active Warehouse
	Insurance policy in force
	Lease agreement validity in force 
	WDRA registered Commodity
	Physical Stock Reconciliation done
	Warehouse registered capacity not breaching.
	Deposit type is Exchange 

    2)Physical Deposit: Physical deposit can be accessed by mapped WH users through ‘Organization Unit’ module by WSP admin user with Auto code provided by CCRL client with following validation.

	Valid Auto code
	With selection of Visual Inspection as Accept or Reject
With Accept  system will allow to WH to process further steps of eNWR
With Reject  System will not allow to WH to proceed.
	15% quantity variation (+/-) weighbridge net weight 
	Unique Sample ID with Godown and Stack in Lot Details.
	Weighbridge Net Quantity should be equal to entered GSL quantity 
	GSL entered quantity should be in range between define quantity variation (+/-) as per ECWM master for that exchange and commodity.
	WH checker will re-enter no of bag and GSL entered quantity which are initiated by WH maker user.
	Base Depositor detail required if WH user deposit the exchange deposit.
	eNNWR will generate post WH checker in system.


3)Deposit Assayer: Assayer users can enter WDRA approved Quality parameter value and derived Grade for that Quality standard of the deposited commodities which are mapped with that WDRA approved Commodity for that WH and Created Assayer master for that WH by CCRL user through WH-Assayer -Commodity linking master.

Below are the system validations while initiating the deposit assayer 
	With Correct Sample ID which are used in Physical deposit
	Shelf-life date should be as per CCRL ‘Shelf-Life Validity Extension’ WDRA approved for that commodity.
	WDRA approved grade should be as per ‘Commodity Master’ for that commodity
	Quality Parameter value range as per that ‘Quality Standard’ Master which are define in ‘Commodity Master’.
	eNNWR will generate if assayer user as per selection of check box of “Not meeting Agmark” or others.

    4)Deposit Confirm by WH: WH users can confirm the entered weighbridge new weight quantity which are entered in Physical deposit and Grade, Quality Parameter Value and Self Life date which are entered in deposit assayer.
    Below are the system validations while initiating deposit confirmation
	Shelf-Life date can be edited as per as per CCRL ‘Shelf-Life Validity Extension’ WDRA approved for that commodity.
	eNWR will generate post authorization by WH checker user if Deposit assayer is not select “Not meeting Agmark” or others 
	eNNWR will generate post authorization by WH checker user if Deposit assayer is select “Not meeting Agmark” or others. 














Following is the Result of Automation Testing 
	For deposit request number 3244409, we have carried out complete process of ENNWR generation. It has been generated ENNWR  110001019733 Successfully.
1)Deposits Request:
a) Exchange Deposit Request Maker:
	we can run the Exchange Deposit _Request_Maker test for RP.
	Showing the Response time Required to complete Request for Maker.
 
	Showing the Test Result as Pass to complete Request for Maker as Below.
 
b) Exchange Deposit Request Checker:
	we can run the RP_Deposite_Request_Checker test for Authorization.
	Showing the Response time Required to complete Authorization for checker.
 
	Showing the Test Result as Pass to complete Request for Deposits Request Checker as below
 

2) Exchange Physical Deposit
a) Exchange Physical Deposit Maker:
	In this stage WSP man create Physical entry in warehouse where we can 
	Showing the Response time Required to complete flow for Physical Warehouse Maker.
 


	Showing the Test Result as Pass to complete Request for Deposits Request Checker as below.
 
b) Exchange Physical Deposit Checker:
	Showing the Response time Required to complete flow for Physical Warehouse Checker
 
	Showing the Test Result as Pass to complete Request for Physical Deposit Checker as below.
 

3) Exchange Deposit Assayer
a) Exchange Deposit  Assayer Maker:
	To verify that product Quality and validate of product is store in warehouse also getting Loan and online features for selling the product.
	Showing the Response time Required to complete flow for Assayer Maker.
 

	Showing the Test Result as Pass to complete Request for Assayer Maker as below.
 

b) Exchange Deposit Assayer Checker:
	Showing the Response time Required to complete flow for Assayer Checker.
 
	Showing the Test Result as Pass to complete Request for Assayer Checker as below.
 

4) Exchange Deposit Confirm WH
a) Exchange Deposit Confirm WH Maker:
	Showing the Response time Required to complete flow for Deposit Confirm WH Maker.
 
	Showing the Test Result as Pass to complete Request for Deposit Confirm WH Maker as below.
 

b) Exchange Deposit Confirm WH Checker:
	Showing the Response time Required to complete flow for Deposit Confirm WH Checker.
 
	Showing the Test Result as Pass to complete Request for Deposit Confirm WH Checker as below.
 







Extent Report Output for Exchange :
 
 





Government Agency Deposit Functionality for eNWR/eNNWR Generation
1)Deposit Request: Request from WSP/WH/RP/Client Portal 
Below are the system Validations while initiate the deposit request from respective entities 
	Active Client ID
	Active Warehouse
	Insurance policy in force
	Lease agreement validity in force 
	WDRA registered Commodity
	Physical Stock Reconciliation done
	Warehouse registered capacity not breaching.



2)Deposit Government Agency
Deposit Government Agency: Government Agency deposit can be accessed by mapped WH users through ‘Organization Unit’ module by WSP admin user with Auto code provided by CCRL client with following validation.

	Valid Auto code
	With selection of Visual Inspection as Accept or Reject
With Accept  system will allow to WH to process further steps of eNWR
With Reject  System will not allow to WH to proceed.
	15% quantity variation (+/-) weighbridge net weight 
	Unique Sample ID with Godown and Stack in Lot Details.
	Weighbridge Net Quantity should be equal to entered GSL quantity 
	GSL entered quantity should be in range between define quantity variation (+/-) as per ECWM master for that exchange and commodity.
	WH checker will re-enter no of bag and GSL entered quantity which are initiated by WH maker user.
	Base Depositor detail required if WH user deposit the exchange deposit.
	eNNWR will generate post WH checker in system
Deposit Assayer: Assayer users can enter WDRA approved Quality parameter value and derived Grade for that Quality standard of the deposited commodities which are mapped with that WDRA approved Commodity for that WH and Created Assayer master for that WH by CCRL user through WH-Assayer -Commodity linking master.
Below are the system validations while initiating the deposit assayer 
	With Correct Sample ID which are used in Physical deposit
	Shelf-life date should be as per CCRL ‘Shelf-Life Validity Extension’ WDRA approved for that commodity.
	WDRA approved grade should be as per ‘Commodity Master’ for that commodity
	Quality Parameter value range as per that ‘Quality Standard’ Master which are define in ‘Commodity Master’.
	eNNWR will generate if assayer user as per selection of check box of “Not meeting Agmark” or others.

Deposit Confirm by WH: WH users can confirm the entered weighbridge new weight quantity which are entered in Physical deposit and Grade, Quality Parameter Value and Self Life date which are entered in deposit assayer.
   Below are the system validations while initiating deposit confirmation
	Shelf-Life date can be edited as per as per CCRL ‘Shelf-Life Validity Extension’ WDRA approved for that commodity.
	eNWR will generate post authorization by WH checker user if Deposit assayer is not select “Not meeting Agmark” or others 
	eNNWR will generate post authorization by WH checker user if Deposit assayer is select “Not meeting Agmark” or others. 

Following is the Result of Automation Testing 
	For deposit request number 3244400, we have carried out complete process of ENWR generation. It has been generated ENWR  110001018941 Successfully.
1)Deposits Request:
a) Government Agency Deposits Request  Maker:
	we can run the  Government Agency Deposite_Request_Maker test for RP.
	Showing the Response time Required to complete Request for Maker.
 
	Showing the Test Result as Pass to complete Request for Maker as Below.
 



b) Government Agency Deposits Request Checker:
	we can run the Government Agency  Deposite_Request_Checker test for Authorization.
	Showing the Response time Required to complete Authorization for checker.
 
	Showing the Test Result as Pass to complete Request for Checker as Below.
 

2) Deposit Government Agency Warehouse
a) Deposit Government Agency Maker:
	In this stage WSP man create Physical entry in warehouse where we can 
	Showing the Response time Required to complete flow for Physical Warehouse Maker.
 
	Showing the Test Result as Pass to complete Request for Maker as Below.
 

b) Deposit Government Agency Checker:
	Showing the Response time Required to complete flow for Warehouse Checker.
 
	Showing the Test Result as Pass to complete Request for Checker as Below.
 

------------------------------------------End of ENWR generation Process-----------------------------------
