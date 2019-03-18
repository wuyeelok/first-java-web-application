package com.in28minutes;

public class UserValidationService {
	
	public boolean isUserValid(String username, String password) {
		if("in28Minutes".equals(username) && "dummy".equals(password)) {
			return true;
		} else {
			return false;
		}
	}
	
}
