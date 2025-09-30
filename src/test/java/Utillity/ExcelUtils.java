package Utillity;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
//import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet Sheet;

	public ExcelUtils(String excelPath, String sheetName) {
		try {

			/*
			 * workbook = new XSSFWorkbook(excelPath); Sheet = workbook.getSheet(sheetName);
			 */

			FileInputStream fis = new FileInputStream(excelPath);
			workbook = (XSSFWorkbook) WorkbookFactory.create(fis); // Handles both .xls and .xlsx
			Sheet = workbook.getSheet(sheetName);

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			e.getCause();
		}
	}

	public static int getRowCount() {
		int rowCount = 0;
		try {

			rowCount = Sheet.getPhysicalNumberOfRows();
			System.out.println("total number of rows" + rowCount);
		} catch (Exception exp) {

			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}
		return rowCount;
	}

	public static int getColCount() {
		int colCount = 0;
		try {

			colCount = Sheet.getRow(0).getPhysicalNumberOfCells();
			// System.out.println("total number of rows" + colCount);
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}
		return colCount;
	}

	public static String getCellData(int rowNum, int colNum) {
		String cellData = ""; // Default empty value

		try {
			XSSFRow row = Sheet.getRow(rowNum);
			if (row != null) {
				XSSFCell cell = row.getCell(colNum);
				if (cell != null) {
					switch (cell.getCellType()) {
					case STRING:
						cellData = cell.getStringCellValue(); // Direct string value
						break;
					case NUMERIC:
						cellData = String.valueOf((long) cell.getNumericCellValue()); // Convert to String
						break;
					case BOOLEAN:
						cellData = String.valueOf(cell.getBooleanCellValue()); // Convert Boolean to String
						break;
					case FORMULA:
						cellData = cell.getCellFormula(); // Get formula as string
						break;
					case BLANK:
						cellData = ""; // Empty cell
						break;
					default:
						cellData = "UNKNOWN"; // Undefined cell type
						break;
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Error reading cell [" + rowNum + "," + colNum + "]: " + e.getMessage());
			e.printStackTrace();
		}

		return cellData.trim(); // Trim any extra spaces
	}

	/************ RP_Deposite_Request_Agriculture_Maker *************************/
	public static String getCommoditySegment(int rowNum) {
		return getCellData(rowNum, 0);
	}

	public String getDeposite(int rowNum) {
		return getCellData(rowNum, 1);
	}

	public String getQualityStand(int rowNum) {
		return getCellData(rowNum, 2);
	}

	public String getClientID(int rowNum) {
		return getCellData(rowNum, 3);
	}

	public String getWspID(int rowNum) {
		return getCellData(rowNum, 4);
	}

	public String getWhID(int rowNum) {
		return getCellData(rowNum, 5);
	}

	public String getDepositType(int rowNum) {
		return getCellData(rowNum, 6);
	}

	public String getCommodityCode(int rowNum) {
		return getCellData(rowNum, 7);
	}

	public String getBags(int rowNum) {
		return getCellData(rowNum, 8);
	}

	public float getBagSize(int rowNum) {
		// return getCellData(rowNum, 9);
		return (float) Sheet.getRow(rowNum).getCell(9).getNumericCellValue();
	}

	public String getBagType(int rowNum) {
		return getCellData(rowNum, 10);
	}

	public String getQtyUOM(int rowNum) {
		return getCellData(rowNum, 11);
	}

	public String getBagUOM(int rowNum) {
		return getCellData(rowNum, 12);
	}

	/************ Physical_Deposit_Maker *************************/
	public String getInternal_Ref_py(int rowNum) {
		return getCellData(rowNum, 0);
	}

	public String getOTP_Auth_py(int rowNum) {
		return getCellData(rowNum, 1);
	}

	public int getTare_Weight_value_py(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(2).getNumericCellValue();
	}

	public String getassaying_type_py(int rowNum) {
		return getCellData(rowNum, 3);
	}

	public String getWeight_bridge_py(int rowNum) {
		return getCellData(rowNum, 4);
	}

	public String getWeight_bridge_Receipt_py(int rowNum) {
		return getCellData(rowNum, 5);
	}

	public String getSample_py(int rowNum) {
		return getCellData(rowNum, 6);
	}

	public String getlot_No_py(int rowNum) {
		return getCellData(rowNum, 7);
	}

	public String getdispatch_Number_py(int rowNum) {
		return getCellData(rowNum, 8);
	}

	public int getAssayring_Referance_Id_py(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(9).getNumericCellValue();
	}

	public String getWeighbridgeNetWeighte_py(int rowNum) {
		return getCellData(rowNum, 10);
	}

	public String getEstimatedValueAtDeposit_py(int rowNum) {
		return getCellData(rowNum, 11);
	}

	public String getMoistureAtDeposit_py(int rowNum) {
		return getCellData(rowNum, 12);
	}

	public String getRate_of_Storage_Charges_py(int rowNum) {
		return getCellData(rowNum, 13);
	}

	public String getPer_UOM_py(int rowNum) {
		return getCellData(rowNum, 14);
	}

	public String getGodown_No_py(int rowNum) {
		return getCellData(rowNum, 15);
	}

	public String getStack_No_py(int rowNum) {
		return getCellData(rowNum, 16);
	}

	public String getLot_No_py(int rowNum) {
		return getCellData(rowNum, 17);
	}

	public String getPanCard_No_py(int rowNum) {
		return getCellData(rowNum, 18);
	}

	public String getDepositerName_py(int rowNum) {
		return getCellData(rowNum, 19);
	}

	public String getL1_py(int rowNum) {
		return getCellData(rowNum, 20);
	}

	public String getL2_py(int rowNum) {
		return getCellData(rowNum, 21);
	}

	public String getL3_py(int rowNum) {
		return getCellData(rowNum, 22);
	}

	public String getCity_Name_py(int rowNum) {
		return getCellData(rowNum, 23);
	}

	public String getPinCode_py(int rowNum) {
		return getCellData(rowNum, 24);
	}

	public int getshelflife_py(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(25).getNumericCellValue();
	}

	public String getBag_Total_py(int rowNum) {
		return getCellData(rowNum, 26);
	}

	public int getBags_py(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(27).getNumericCellValue();
	}

	public int gettotalBags(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(28).getNumericCellValue();
	}

	/************ RP_Exchange_Deposite_Agriculture_Maker *************************/
	public String getCommoditySegment_Ex(int rowNum) {
		return getCellData(rowNum, 0);
	}

	public String getDeposite_ex(int rowNum) {
		return getCellData(rowNum, 1);
	}

	public String getClientID_ex(int rowNum) {
		return getCellData(rowNum, 2);
	}

	public String getWspID_ex(int rowNum) {
		return getCellData(rowNum, 3);
	}

	public String getWhID_ex(int rowNum) {
		return getCellData(rowNum, 4);
	}

	public String getDepositType_ex(int rowNum) {
		return getCellData(rowNum, 5);
	}

	public String getCommodityCode_ex(int rowNum) {
		return getCellData(rowNum, 6);
	}

	public String getBags_ex(int rowNum) {
		return getCellData(rowNum, 7);
	}

	public float getBagSize_ex(int rowNum) {
		// return getCellData(rowNum, 8);
		return (float) Sheet.getRow(rowNum).getCell(8).getNumericCellValue();
	}

	public String getBagType_ex(int rowNum) {
		return getCellData(rowNum, 9);
	}

	public String getQtyUOM_ex(int rowNum) {
		return getCellData(rowNum, 10);
	}

	public String getBagUOM_ex(int rowNum) {
		return getCellData(rowNum, 11);
	}

	public String getexchange_Code(int rowNum) {
		return getCellData(rowNum, 12);
	}

	/************
	 * Exchange_Deposite_Request_Non_Agriculture_Maker
	 *************************/
	public String getCommoditySegment_Ex_Non(int rowNum) {
		return getCellData(rowNum, 0);
	}

	public String getDeposite_ex_Non(int rowNum) {
		return getCellData(rowNum, 1);
	}

	public String getDepositType_ex_Non(int rowNum) {
		return getCellData(rowNum, 2);
	}

	public String getexchange_Code_Non(int rowNum) {
		return getCellData(rowNum, 3);
	}

	public String getWspID_ex_Non(int rowNum) {
		return getCellData(rowNum, 4);
	}

	public String getWhID_ex_Non(int rowNum) {
		return getCellData(rowNum, 5);
	}

	public String getClientID_ex_Non(int rowNum) {
		return getCellData(rowNum, 6);
	}

	public String getCommodityCode_ex_Non(int rowNum) {
		return getCellData(rowNum, 7);
	}

	public String getsymbol_ex_Non(int rowNum) {
		return getCellData(rowNum, 8);
	}

	public String getNo_of_Bundle_ex_Non(int rowNum) {
		return getCellData(rowNum, 9);
	}

	public String getPieces_Per_Bundle_ex_Non(int rowNum) {
		return getCellData(rowNum, 10);
	}

	public String getQtyUOM_ex_Non(int rowNum) {
		return getCellData(rowNum, 11);
	}

	public String getNQuantity_ex_Non(int rowNum) {
		return getCellData(rowNum, 12);
	}

	public String getBag_Type_ex_Non(int rowNum) {
		return getCellData(rowNum, 13);
	}

	/************
	 * Exchange_Non_Agriculture_Physical_Deposit
	 *************************/
	public String getInternal_Ref_ex_py(int rowNum) {
		return getCellData(rowNum, 0);
	}

	public String getOTP_Auth_ex_py(int rowNum) {
		return getCellData(rowNum, 1);
	}

	public String getVariety_Code_Value_ex_py(int rowNum) {
		return getCellData(rowNum, 2);
	}

	public String getassaying_type_ex_py(int rowNum) {
		return getCellData(rowNum, 3);
	}

	public String getWeight_bridge_ex_py(int rowNum) {
		return getCellData(rowNum, 4);
	}

	public String getWeight_bridge_Receipt_ex_py(int rowNum) {
		return getCellData(rowNum, 5);
	}

	public String getEstimatedValue_ex_py(int rowNum) {
		return getCellData(rowNum, 6);
	}

	public String getLot_Heat_Cast_Batch_number_ex_py(int rowNum) {
		return getCellData(rowNum, 7);
	}

	public String getPer_Month_ex_py(int rowNum) {
		return getCellData(rowNum, 8);
	}

	public String getper_uom_ex_py(int rowNum) {
		return getCellData(rowNum, 9);
	}

	public int getNo_Of_Bundles_ex_py(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(10).getNumericCellValue();
	}

	public int getpieces_per_bundle_ex_py(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(11).getNumericCellValue();
	}

	public String getSample_ex_py(int rowNum) {
		return getCellData(rowNum, 12);
	}

	public int getlot_No_ex_py(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(13).getNumericCellValue();
	}

	public String getQuantity_ex_py(int rowNum) {
		return getCellData(rowNum, 14);
	}

	public String getNetWeightPerPackList_ex_py(int rowNum) {
		return getCellData(rowNum, 15);
	}

	public String getGodown_No_ex_py(int rowNum) {
		return getCellData(rowNum, 16);
	}

	public String getStack_No_ex_py(int rowNum) {
		return getCellData(rowNum, 17);
	}

	public String getLot_No_ex_py(int rowNum) {
		return getCellData(rowNum, 18);
	}

	public String getPanCard_No_ex_py(int rowNum) {
		return getCellData(rowNum, 19);
	}

	public String getDepositerName_ex_py(int rowNum) {
		return getCellData(rowNum, 20);
	}

	public String getL1_ex_py(int rowNum) {
		return getCellData(rowNum, 21);
	}

	public String getL2_ex_py(int rowNum) {
		return getCellData(rowNum, 22);
	}

	public String getL3_ex_py(int rowNum) {
		return getCellData(rowNum, 23);
	}

	public String getCity_Name_ex_py(int rowNum) {
		return getCellData(rowNum, 24);
	}

	public String getPinCode_ex_py(int rowNum) {
		return getCellData(rowNum, 25);
	}

	public int getshelflife_ex_py(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(26).getNumericCellValue();
	}

	public String getBag_Total_ex_py(int rowNum) {
		return getCellData(rowNum, 27);
	}

	/***********************************
	 * Government_Agency_Deposite_Request_Maker
	 ********************************************/
	public String getDeposite_GA(int rowNum) {
		return getCellData(rowNum, 0);
	}

	public String getQuality_Stand_GA(int rowNum) {
		return getCellData(rowNum, 1);
	}

	public String getCommodity_Segment_GA(int rowNum) {
		return getCellData(rowNum, 2);
	}

	public String getScheme_GA(int rowNum) {
		return getCellData(rowNum, 3);
	}

	public String getCrop_Year_GA(int rowNum) {
		return getCellData(rowNum, 4);
	}

	public String getCrop_Season_GA(int rowNum) {
		return getCellData(rowNum, 5);
	}

	public String getDeposit_Type_GA(int rowNum) {
		return getCellData(rowNum, 6);
	}

	public String getClient_ID_GA(int rowNum) {
		return getCellData(rowNum, 7);
	}

	public String getWSP_ID_GA(int rowNum) {
		return getCellData(rowNum, 8);
	}

	public String getWH_ID_GA(int rowNum) {
		return getCellData(rowNum, 9);
	}

	public String getbags_GA(int rowNum) {
		return getCellData(rowNum, 10);
	}

	public String getCommodity_Code_GA(int rowNum) {
		return getCellData(rowNum, 11);
	}

	public float getBag_Size_GA(int rowNum) {
		// return getCellData();rowNum, 12
		return (float) Sheet.getRow(rowNum).getCell(12).getNumericCellValue();
	}

	public String getBag_Type_GA(int rowNum) {
		return getCellData(rowNum, 13);
	}

	public String getQty_UOM_GA(int rowNum) {
		return getCellData(rowNum, 14);
	}

	public String getBag_UOM_GA(int rowNum) {
		return getCellData(rowNum, 15);
	}

	/***********************************
	 * PladgeRequest
	 ************************************************/

	public int getpledge_Req_Number(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(0).getNumericCellValue();
	}

	public String getClient_ID(int rowNum) {
		return getCellData(rowNum, 1);
	}

	public int getWH_id(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(2).getNumericCellValue();
	}

	public int getCommodity(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(3).getNumericCellValue();
	}

	public String getpledgee_Client(int rowNum) {
		return getCellData(rowNum, 4);
	}

	public String getENWR(int rowNum) {
		return getCellData(rowNum, 5);
	}

	public int getBagsp(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(6).getNumericCellValue();
	}

	public int getpledge_value(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(7).getNumericCellValue();
	}

	public String getifsc_Code(int rowNum) {
		return getCellData(rowNum, 8);
	}

	public int getPledge_Confirm_code(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(9).getNumericCellValue();
	}

	/***********************************
	 * DPlageRequest
	 ************************************************/
	public long getPledgor_Client_ID(int rowNum) {
		// return (long) Sheet.getRow(rowNum).getCell(0).getNumericCellValue();
		Cell cell = Sheet.getRow(rowNum).getCell(0);
		DataFormatter formatter = new DataFormatter();
		String cellValue = formatter.formatCellValue(cell); // Always returns String
		return Long.parseLong(cellValue);
	}

	public int getpledge_Seq_No_D(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(1).getNumericCellValue();
	}

	public String getlocation(int rowNum) {
		return getCellData(rowNum, 2);
	}

	public int getcommodity_d(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(3).getNumericCellValue();
	}

	public int getPledge_Closure_Request_No(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(4).getNumericCellValue();
	}

	public int getno_of_bags(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(5).getNumericCellValue();
	}

	public int getpledge_Cls_Confrim_Req_No(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(6).getNumericCellValue();
	}

	public int getpledge_value_d(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(7).getNumericCellValue();
	}

	/*************************************
	 * Deposite_Assayer_Maker
	 *****************************/
	public String getAssayring_Referance(int rowNum) {
		return getCellData(rowNum, 0);
	}

	public String getshelflife(int rowNum) {
		return getCellData(rowNum, 1);
	}

	public String getGrade_Desig_type(int rowNum) {
		return getCellData(rowNum, 2);
	}

	public String getRemark_Value(int rowNum) {
		return getCellData(rowNum, 3);
	}

	public String getNABLCertificateRefNum(int rowNum) {
		return getCellData(rowNum, 4);
	}

	public String getAddress_Value(int rowNum) {
		return getCellData(rowNum, 5);
	}

	/********************* Transfer_Request_RP_Maker ***************/

	public String getInstr_Slip_No(int rowNum) {
		return getCellData(rowNum, 0);
	}

	public int getWSP_ID(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(1).getNumericCellValue();
	}

	public int getWH_ID(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(2).getNumericCellValue();
	}

	public int getCommodity_Code(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(3).getNumericCellValue();
	}

	public long getClient_ID_Transfer(int rowNum) {
		// return (long) Sheet.getRow(rowNum).getCell(4).getNumericCellValue();
		Cell cell = Sheet.getRow(rowNum).getCell(4);
		DataFormatter formatter = new DataFormatter();
		String cellValue = formatter.formatCellValue(cell); // Always returns String
		return Long.parseLong(cellValue);
	}

	public long gettargetClient_Id_Transfer(int rowNum) {
		// return (long) Sheet.getRow(rowNum).getCell(5).getNumericCellValue();
		Cell cell = Sheet.getRow(rowNum).getCell(5);
		DataFormatter formatter = new DataFormatter();
		String cellValue = formatter.formatCellValue(cell); // Always returns String
		return Long.parseLong(cellValue);
	}

	public long getENWR_Transfer(int rowNum) {
		// return (long) Sheet.getRow(rowNum).getCell(6).getNumericCellValue();
		Cell cell = Sheet.getRow(rowNum).getCell(6);
		DataFormatter formatter = new DataFormatter();
		String cellValue = formatter.formatCellValue(cell); // Always returns String
		return Long.parseLong(cellValue);
	}

	public int getBags_Transfer(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(7).getNumericCellValue();
	}

	public String getTransferReason(int rowNum) {
		return getCellData(rowNum, 8);
	}

	/******************************* Withdrawal Request *******************/

	public int getWithdrawal_Request_No(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(0).getNumericCellValue();
	}

	public int getWH_ID_Withdrawal(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(1).getNumericCellValue();
	}

	public String getCommodity_Segment_Withdrawal(int rowNum) {
		return getCellData(rowNum, 2);
	}

	public int getCommodity_Code_Withdrawal(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(3).getNumericCellValue();
	}

	public long getClient_ID_Withdrawal(int rowNum) {
		Cell cell = Sheet.getRow(rowNum).getCell(4);
		DataFormatter formatter = new DataFormatter();
		String cellValue = formatter.formatCellValue(cell); // Always returns String
		return Long.parseLong(cellValue); // Convert to long
	}

	public long getENWR_Withdrawal(int rowNum) {
		Cell cell = Sheet.getRow(rowNum).getCell(5);
		DataFormatter formatter = new DataFormatter();
		String cellValue = formatter.formatCellValue(cell); // Always returns String
		return Long.parseLong(cellValue); // Convert to long
	}

	public int getnoOfBag_Withdrawal(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(6).getNumericCellValue();
	}

	/*************************************
	 * Client_Account_opening_For_RP
	 ***************************************/
	public int getclientid_Num(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(0).getNumericCellValue();
	}
	/*
	 * public static int getclientid_Num(int rowNum) { return (int)
	 * Sheet.getRow(rowNum).getCell(0).getNumericCellValue(); }
	 */

	public String getFormID(int rowNum) {
		return getCellData(rowNum, 1);
	}

	public String getClient_holder_Name(int rowNum) {
		return getCellData(rowNum, 2);
	}

	public String getClient_Type(int rowNum) {
		return getCellData(rowNum, 3);
	}

	public String getClient_Sub_Type(int rowNum) {
		return getCellData(rowNum, 4);
	}

	public String getFrequency(int rowNum) {
		return getCellData(rowNum, 5);
	}

	public String getStatement(int rowNum) {
		return getCellData(rowNum, 6);
	}

	public String getLine1(int rowNum) {
		return getCellData(rowNum, 7);
	}

	public String getLine2(int rowNum) {
		return getCellData(rowNum, 8);
	}

	public String getLine3(int rowNum) {
		return getCellData(rowNum, 9);
	}

	public String getLine4(int rowNum) {
		return getCellData(rowNum, 10);
	}

	public String getCity(int rowNum) {
		return getCellData(rowNum, 11);
	}

	public int getPinCode(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(12).getNumericCellValue();
	}

	public int getmobile_Isd(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(13).getNumericCellValue();
	}

	public long getmobile_NUmber(int rowNum) {

		return (long) Sheet.getRow(rowNum).getCell(14).getNumericCellValue();
		/*
		 * Cell cell = Sheet.getRow(rowNum).getCell(14); DataFormatter formatter = new
		 * DataFormatter(); String cellValue = formatter.formatCellValue(cell); //
		 * Always returns String return Long.parseLong(cellValue); // Convert to long
		 */ }

	public String getEmail_Id(int rowNum) {
		return getCellData(rowNum, 15);
	}

	public int getAccount_No(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(16).getNumericCellValue();
	}

	public String getIFSC(int rowNum) {
		return getCellData(rowNum, 17);
	}

	public String getBankAccount(int rowNum) {
		return getCellData(rowNum, 18);
	}

	public String getIncomeRange(int rowNum) {
		return getCellData(rowNum, 19);
	}

	public String getPanCardNo(int rowNum) {
		return getCellData(rowNum, 20);
	}

	public String getPOI(int rowNum) {
		return getCellData(rowNum, 21);
	}

	public String getPOA(int rowNum) {
		return getCellData(rowNum, 22);
	}

	public String getAuthsignatory_Name(int rowNum) {
		return getCellData(rowNum, 23);
	}

	public String getAuthorized_Representative_Name(int rowNum) {
		return getCellData(rowNum, 24);
	}

	public String getCIN_Number(int rowNum) {
		return getCellData(rowNum, 25);
	}

	public String getGSTIN_Number(int rowNum) {
		return getCellData(rowNum, 26);
	}

	public String getSEBI_Registration_Number(int rowNum) {
		return getCellData(rowNum, 27);
	}
	
	public String getCM_ID(int rowNum) {
		return getCellData(rowNum, 28);
	}
	
	
	public int getnetWorth(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(29).getNumericCellValue();
	}
	
	
	/************************************* * TM_CM_Linking_RP ***************************************/
	
	
	public String getRequestNo(int rowNum) {
		return getCellData(rowNum, 0);
	}
	
	
	public int getCE_CC_Id(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(1).getNumericCellValue();
	}
	
	public int getTM_ID(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(2).getNumericCellValue();
	}
	
	public long getTM_client_ID(int rowNum) {

		return (long) Sheet.getRow(rowNum).getCell(3).getNumericCellValue();
	}
	
	
	/**************************ClientCmLinking_RP*********************************/
	
	public int getRequestNo_ClientCmLinking(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(0).getNumericCellValue();
	}
	
	
	public int getUCC_ID(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(1).getNumericCellValue();
	}
	
	public long getClient_Id_ClientCmLinking(int rowNum) {

		return (long) Sheet.getRow(rowNum).getCell(2).getNumericCellValue();
	}
	
	public String getTMID_ClientCmLinking(int rowNum) {
		return getCellData(rowNum, 3);
		
	}
	
	public int getCeCcID_ClientCmLinking(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(4).getNumericCellValue();
	}
	
	/************************Settlement_Master_CC_Login********************************/
	public String getExchangeMaster(int rowNum) {
		return getCellData(rowNum, 0);
	}
	
	public int getSettlement_Type(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(1).getNumericCellValue();
	}
	
	public int getsettlement_No(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(2).getNumericCellValue();
	}
	
	public int getsettlement_Year(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(3).getNumericCellValue();
	}
	
	public String getcommodity(int rowNum) {
		return getCellData(rowNum, 4);
	}
	public String getexpectedDay(int rowNum) {
		return getCellData(rowNum, 5);
	}
	
	public String getexpectedMonth(int rowNum) {
		return getCellData(rowNum, 6);
	}
	
	public String getexpectedYear(int rowNum) {
		return getCellData(rowNum, 7);
	}
	
	public String gettrade_Day(int rowNum) {
		return getCellData(rowNum, 8);
	}
	
	public String gettrade_Month(int rowNum) {
		return getCellData(rowNum, 9);
	}
	
	public String gettrade_Year(int rowNum) {
		return getCellData(rowNum, 10);
	}
	
	public String getPostExpiry_Validity_Date(int rowNum) {
		return getCellData(rowNum, 11);
	}
	
	public String getPostExpiry_Validity_Month(int rowNum) {
		return getCellData(rowNum, 12);
	}
	
	public String getPostExpiry_Validity_Year(int rowNum) {
		return getCellData(rowNum, 13);
	}
	
	public String getDelivery_Marking(int rowNum) {
		return getCellData(rowNum, 14);
	}
	
	public String getDelivery_Marking_Month(int rowNum) {
		return getCellData(rowNum, 15);
	}
	
	public String getDelivery_Marking_Year(int rowNum) {
		return getCellData(rowNum, 16);
	}
	public String getpay_In_date(int rowNum) {
		return getCellData(rowNum, 17);
	}
	public String getpay_In_Month(int rowNum) {
		return getCellData(rowNum, 18);
	}
	public String getpay_In_Year(int rowNum) {
		return getCellData(rowNum, 19);
	}
	public int getpay_In_Date_hr(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(3).getNumericCellValue();
	}
	public int getpay_In_Date_mn(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(3).getNumericCellValue();
	}
	public String getpay_out_date(int rowNum) {
		return getCellData(rowNum, 19);
	}
	public String getpay_out_Month(int rowNum) {
		return getCellData(rowNum, 19);
	}
	public String getpay_out_Year(int rowNum) {
		return getCellData(rowNum, 19);
	}
	public int getpay_out_Date_hr(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(3).getNumericCellValue();
	}
	public int getpay_out_Date_mn(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(3).getNumericCellValue();
	}
	public String getearly_pay_In_date(int rowNum) {
		return getCellData(rowNum, 19);
	}
	public String getearly_pay_In_Month(int rowNum) {
		return getCellData(rowNum, 19);
	}
	public String getearly_pay_In_Year(int rowNum) {
		return getCellData(rowNum, 19);
	}
	public int getearly_pay_In_Date_hr(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(3).getNumericCellValue();
	}
	public int getearly_pay_In_Date_mn(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(3).getNumericCellValue();
	}
	public String getearly_Payin_End_date(int rowNum) {
		return getCellData(rowNum, 19);
	}
	public String getearly_Payin_End_Month(int rowNum) {
		return getCellData(rowNum, 19);
	}
	public String getearly_Payin_End_Year(int rowNum) {
		return getCellData(rowNum, 1);
	}
	public int getearly_Payin_End_Date_hr(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(3).getNumericCellValue();
	}
	public int getearly_Payin_End_Date_mn(int rowNum) {
		return (int) Sheet.getRow(rowNum).getCell(3).getNumericCellValue();
	}
	
	
	
	
	

}
