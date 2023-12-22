package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertHomeWork {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("Jdbc:mysql://localhost:3306/test","root","root");
	//	PreparedStatement stmt=con.prepareStatement("insert into emp values(102,'gautam','parsabad',90318)");
	//	PreparedStatement stmt=con.prepareStatement("delete from emp where name='rogi'");
		PreparedStatement stmt=con.prepareStatement("update emp set name ='dinesh' where empid=102");
		
		int i=stmt.executeUpdate();
		if(i>0)
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("fail");
		}
        }


	}


