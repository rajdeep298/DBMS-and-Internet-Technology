package org.jdbc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.jdbc.misc.ConnectionProvider;
import org.jdbc.model.bean.UserBean;

public class UserDao {
	public int insert(UserBean bean)
	{
		String name=bean.getName();
		String email=bean.getEmail();
		String phno=bean.getPhno();
		String add=bean.getAddress();
		String pass=bean.getPass();
		int i=0;
		Connection con=ConnectionProvider.getCon();
		try {
			PreparedStatement pstm=con.prepareStatement("insert into user values(?,?,?,?,?)");
			pstm.setString(1, name);
			pstm.setString(2, email);
			pstm.setString(3, phno);
			pstm.setString(4, add);
			pstm.setString(5, pass);
			i=pstm.executeUpdate();
		}catch(Exception e) {}
		return i;
	}
	
	public boolean login(UserBean bean) {
		String email=bean.getEmail();
		String pass=bean.getPass();
		boolean status=false;
		try {
			PreparedStatement pstm=ConnectionProvider.getCon().prepareStatement("select * from user where email=? and pass=?");
			pstm.setString(1, email);
			pstm.setString(2, pass);
			ResultSet rs= pstm.executeQuery();
			if (rs.next())
				status=true;
		}catch(Exception e) {}
		return status;
	}
}
