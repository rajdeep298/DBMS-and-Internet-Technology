package org.jdbc.misc;
import java.sql.*;
public class ConnectionProvider {
	static Connection con;
	public static Connection getCon()
	{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca1sem","root","akcsit");
	}catch(Exception e) {}
		return con;
	}
}
