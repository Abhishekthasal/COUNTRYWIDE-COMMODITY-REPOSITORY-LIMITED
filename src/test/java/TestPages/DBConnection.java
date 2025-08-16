package TestPages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static void main(String[] args) {
        String url = "jdbc:mysql://192.168.19.147:3066/ccrl_uat?useSSL=false&connectTimeout=120000&allowPublicKeyRetrieval=true";
        String username = "ccrl1";
        String password = "ccrl@123";
        //String Deposit_ID ="5244457";
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected successfully!");
            /*
         // Create statement
            Statement statement = conn.createStatement();

            // Execute query
            ResultSet resultSet = statement.executeQuery("select ID from auth_code_generation where DRN= ? ");
           /*
            String query ="select ID from auth_code_generation where DRN=?";
          //  System.out.println("ColumnValue: " + resultSet.getRow());
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, Deposit_ID);

          //  ResultSet rs = stmt.executeQuery();

            ((PreparedStatement) statement).setString(1, Deposit_ID);




            if (resultSet.next()) {
            String name = resultSet.getString("INR");
            int age = resultSet.getInt("Auth_Code");
            System.out.println("ID is :"+name);
            System.out.println("Auth_Code is:"+age);
            }
            /* Read data
            while (resultSet.next()) {
                System.out.println("ColumnValue: " + resultSet.getString("id"));
            }*/

        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}