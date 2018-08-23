package com.kenneth.util;

import javax.servlet.http.HttpServletRequest;

import com.kenneth.exception.InvalidPasswordException;

public class Util {
	
	public static String getName(HttpServletRequest request) {		
		if(request.getParameter("name") == null) {
			return "";
		} else {
			return request.getParameter("name");
		}
	}

	public static String getPassword(HttpServletRequest request) throws Exception {
		if(request.getParameter("password") == null || request.getParameter("password").length() < 6) {
			throw new InvalidPasswordException("Invalid password!!! Password can not be empty and must be longer than 6 characters!");
		} else {
			return request.getParameter("password");
		}
	}

}
