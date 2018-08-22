package com.kenneth.util;

import javax.servlet.http.HttpServletRequest;

public class Util {
	
	public static String getName(HttpServletRequest request) {		
		if(request.getParameter("name") == null) {
			return "";
		} else {
			return request.getParameter("name");
		}
	}

}
