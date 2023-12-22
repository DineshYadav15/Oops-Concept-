package JDBC_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert3Simpleway {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 Class.forName("com.mysql.cj.jdbc.Driver");
		    String url="jdbc:mysql://localhost:3306/jdbc_db";
		    String uname="root";
		    String pass="root";
		    Connection con=DriverManager.getConnection(url,uname,pass);
			Statement stmt=con.createStatement(); 
			String sql="insert into register values(105,'rogi','dhanbad',20318)";
			//String sql="delete from register where name='dinesh'";
			//String sql="update register set name ='rajesh' where id=102";
			stmt.executeUpdate(sql);
			int i=stmt.executeUpdate(sql);
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
