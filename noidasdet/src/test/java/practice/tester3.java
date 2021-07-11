package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class tester3 {
	@Test
	public void executeQuery() throws SQLException
	{
		//Step 1:Register to database
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		//Step 2:establish connection with database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		//Step 3: Issue create statement
		Statement stat = con.createStatement();
		//Step 4:Execute any query
		ResultSet result = stat.executeQuery("show databases;");
		while(result.next())
		{
			System.out.println(result.getString(1));
		}
		//Step 5:Close database connection
		con.close();

}
}


