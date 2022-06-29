package com.in28min.login;

public class LoginService {
	
	public boolean isUserValid(String user, String password) {
		if(user.equals("marcos") && password.equals("santos"))
			return true;
		
		return false;
	}

}
