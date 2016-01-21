package com.application.login;

public class User {
	
	private String userName,password;


	
	public User(String userName, String password) {
		
		this.userName=userName;
		this.password=password;
	}

	public String getUserName() {
		return userName;
	}

	
	public String getPassword() {
		return password;
	}

	
	public boolean isValid()
	{
		if(password.equals("brinda"))
		{
			return true;
		}
		else
		{
			return false;	
		}
	}
	
}
