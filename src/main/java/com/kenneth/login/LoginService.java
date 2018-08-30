package com.kenneth.login;

public class LoginService {
	public static boolean isUserValid(String user, String password) {
		if("in28Minutes".equals(user) && "dummys".equals(password)) {
			return true;					
		} else {
			return false;
		}
	}
}
