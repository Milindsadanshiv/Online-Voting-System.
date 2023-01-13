import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbManager {

	public Connection getConnection() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			java.sql.Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineVotingDb","root","Mysqldata@123");
			return con;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
