package JDBC_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Firstprogramjdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 Class.forName("com.mysql.cj.jdbc.Driver");//first step
		    String url="jdbc:mysql://localhost:3306/ravi";//second step to
		    String uname="root";
		    String pass="root";
		    String sql="select * from emp";
		    Connection con=DriverManager.getConnection(url,uname,pass);//creating connection //second step;
		    Statement stmt=con.createStatement();  //creating statement third step;
		    ResultSet rs=stmt.executeQuery(sql); //executing query means read; fourth step;
		    while(rs.next()) 
			{
			System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3)); 
			}
    }

}
