package ConnectionFactory;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class storeConnection {
    public Connection getStoreConnection() {
    	
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");	
    		
    	   return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-a15", "root", "root");
    	}catch(SQLException | ClassNotFoundException e ) {
    		e.printStackTrace();
    		System.out.println("connection failed");
    		return null;
    	}
    }
}
