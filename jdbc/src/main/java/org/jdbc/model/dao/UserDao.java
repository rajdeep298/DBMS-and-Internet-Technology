package org.jdbc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.jdbc.misc.ConnectionProvider;
import org.jdbc.model.bean.UserBean;

public class UserDao {
Connection con=ConnectionProvider.getCon();
public int insert(UserBean bean)
{
	String name=bean.getName();
	String email=bean.getEmail();
	String phno=bean.getPhno();
	String add=bean.getAddress();
	String pass=bean.getPass();
	int i=0;
	
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

public boolean login(UserBean bean)
{
	String email=bean.getEmail();
	String pass=bean.getPass();
	boolean status=false;
	try {
		PreparedStatement pstm=con.prepareStatement("select *from user where email=? and password=?");
		pstm.setString(1, email);
		pstm.setString(2, pass);
		ResultSet rs=pstm.executeQuery();
		if(rs.next())
		{
			status=true;
		}
		
	}catch(Exception e) {}
	return status;
}

public List<UserBean> profile(UserBean bean)
{
	String str=bean.getEmail();
	String name=null;
	String email=null;
	String phno=null;
	String add=null;
	List<UserBean> ulist=new ArrayList();
	try {
		PreparedStatement pstm=con.prepareStatement("select *from user where email=?");
		pstm.setString(1, str);
		ResultSet rs=pstm.executeQuery();
		
		while(rs.next())
		{
			
			name=rs.getString(1);
			email=rs.getString(2);
			phno=rs.getString(3);
			add=rs.getString(4);
			UserBean ub=new UserBean(name,email,phno,add);
			ulist.add(ub);
		}
	}catch(Exception e) {}
	return ulist;
}
}
