package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Examples {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		
		
	     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
	        String url = "jdbc:sqlserver://<SERVER_IP>:<PORT_NO>;databaseName=" + DATABASE_NAME;
	        Connection con = DriverManager.getConnection(url, "kadmin", "45Tr^88ptPzmmMe");
	        
	        
	        
		  //  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    String hostName = "localhost";
		    String dbName = "dev-korio-platform-sql-00.database.windows.net";
		    String user = "kadmin";
		    String password = "45Tr^88ptPzmmMe";
		    String url = String.format("jdbc:sqlserver:@dev-korio-platform-sql-00.database.windows.net", hostName, dbName, user, password);
		    Connection con = DriverManager.getConnection("jdbc:sqlserver:@dev-korio-platform-sql-00.database.windows.net", user, password);
		    
		//Connection con = DriverManager.getConnection("dev-korio-platform-sql-00.database.windows.net","kadmin","45Tr^88ptPzmmMe");
        Statement stmt = con.createStatement();
        String s = "select * from Country";
        ResultSet rs = stmt.executeQuery(s);
        
        while(rs.next()) {
        	String colName = rs.getString("CountryName");
        	System.out.println(colName);
        	
        }
        stmt.close();
	}
	

}
