package com.in28min;

public class UserValidationService {
	
	public boolean isUserValid(String user, String password) {
		if(user.equals("marcos") && password.equals("santos"))
			return true;
		
		return false;
	}

}
