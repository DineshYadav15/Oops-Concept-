package JDBC_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Insert1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("Jdbc:mysql://localhost:3306/jdbc_db","root","root");
		PreparedStatement stmt=con.prepareStatement("insert into register values(102,'gautam','parsabad',90318)");
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
