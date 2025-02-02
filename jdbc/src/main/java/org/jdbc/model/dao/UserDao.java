package org.jdbc.model.dao;

import org.jdbc.misc.ConnectionProvider;
import org.jdbc.model.bean.UserBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    Connection con = ConnectionProvider.getCon();

    //Inserting data into database
    public int insert(UserBean ub) {
        System.out.println("Inserting data into database...");
        String name = ub.getName();
        String email = ub.getEmail();
        String phno = ub.getPhno();
        String add = ub.getAdd();
        String pass = ub.getPass();

        int i = 0;
        try{
            PreparedStatement pstm = con.prepareStatement("insert into user values(?,?,?,?,?)");
            pstm.setString(1, name);
            pstm.setString(2, email);
            pstm.setString(3, phno);
            pstm.setString(4, add);
            pstm.setString(5, pass);
            i=pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    //Login method
    public boolean login(UserBean ub) {
        String email = ub.getEmail();
        String pass = ub.getPass();
        boolean status = false;
        try {
            PreparedStatement pstm = con.prepareStatement("select * from user where email=? and pass=?");
            pstm.setString(1,email);
            pstm.setString(2,pass);

            System.out.println("Executing query: " + pstm.toString());

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                status = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public List<UserBean> profile(UserBean ub) {
        String email = ub.getEmail();
        String name = null;
        String phno = null;
        String add = null;
        String pass = null;
        List<UserBean> list = new ArrayList<>();
        try{
            PreparedStatement pstm = con.prepareStatement("select * from user where email=?");
            pstm.setString(1,email);

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                name = rs.getString(1);
                phno = rs.getString(3);
                add = rs.getString(4);
                pass = rs.getString(5);
                System.out.println("Name: " + name + " Email: " + email + " Phone: " + phno + " Address: " + add + " Password: " + pass);
                UserBean ub1 = new UserBean(name,email,phno,add,pass);
                list.add(ub1);
                return list;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
