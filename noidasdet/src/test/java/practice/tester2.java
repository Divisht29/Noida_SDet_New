package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class tester2 {
	@Test
	 public void executeQuery() throws SQLException
	 {
	  Connection con=null;
	  try{
	  //Step 1:Register to database
	  Driver driverref=new Driver();
	  DriverManager.registerDriver(driverref);
	  //Step 2:establish connection with database
	   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
	  //Step 3: Issue create statement
	  Statement stat = con.createStatement();
	  //Step 4:Execute any query
	  int result = stat.executeUpdate("insert into project valuse('TY_PROJ_004','Keer','19/06/2021','Noida','On_Going',23);");
	  if(result==1)
	  {
	   System.out.println("project is successfully created");
	  }
	  else
	  {
	   System.out.println("Query failed");
	  }
	  }
	  catch(Exception e){
	  }
	  finally{
	  //Step 5:Close database connection
	  con.close();
	  }
	 }

}
