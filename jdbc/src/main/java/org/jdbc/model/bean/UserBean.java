package org.jdbc.model.bean;

public class UserBean {
    private String name;
    private String email;
    private String phno;
    private String add;
    private String pass;

    public UserBean() {

    }

    public UserBean(String name, String email, String phno, String add, String pass) {
        this.name = name;
        this.email = email;
        this.phno = phno;
        this.add = add;
        this.pass = pass;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhno() {
        return phno;
    }
    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getAdd() {
        return add;
    }
    public void setAdd(String add) {
        this.add = add;
    }

    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }


}
