package com.day4;

public class LoginValidation {

	private String  username;
	private String password;
	
	
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


	
	
	
	public LoginValidation(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public  LoginValidation()
	{
		super();
		
	}
	public int checkLogin(String userName , String pwd)
	{
		if(pwd.equals("admin"))
		{
				return 1;
		}
				else {
					return 0;
				 }
	}
		
}
