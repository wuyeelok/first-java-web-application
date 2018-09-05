package com.kenneth.login;

public class LoginService {

	public static boolean validUser(String username, String password) {
		if("abcd".equals(username) && "1234".equals(password)) {
			return true;
		} else {
			return false;
		}
	}
}
