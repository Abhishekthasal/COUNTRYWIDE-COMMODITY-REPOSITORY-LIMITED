package Utillity;
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseUtility {


	public static Connection getConnection() throws Exception {
		 String url = "jdbc:mysql://192.168.19.147:3066/ccrl_uat?useSSL=false&connectTimeout=120000&allowPublicKeyRetrieval=true";
	        String username = "ccrl1";
	        String password = "ccrl@123";

	        
			/*
			 * String url =
			 * "jdbc:mysql://192.168.19.163:3066/live_dump_new?useSSL=false&connectTimeout=120000&allowPublicKeyRetrieval=true";
			 * String username = "ccrl"; String password = "Ccrl@pp0";
			 */
	        
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }

}
