package com.TestPojo;

public class Authentication 
{
	private String username;
	private String password;
	
	public Authentication(String un,String psw)
	{
		this.username=un;
		this.password=psw;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
