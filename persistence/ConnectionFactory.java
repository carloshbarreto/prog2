package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection() throws SQLException {
		
		String user_con = "jdbc:mysql://127.0.0.1/testj";		
		String user = "root";
		String password = "root";
		return DriverManager.getConnection(user_con, user, password);
		
	}

}
