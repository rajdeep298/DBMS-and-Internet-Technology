package org.jdbc.model.bean;

public class UserBean {
	private String name;
	private String email;
	private String phno;
	private String address;
	private String pass;
	
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserBean(String name, String email, String phno, String address) {
		super();
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.address = address;
	}
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}


}
