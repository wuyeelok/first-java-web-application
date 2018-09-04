package com.kenneth.debug;

public class DebugUtil {
	// Getting the current line number in the code
	public static int __LINE__() {
		return new Exception().getStackTrace()[1].getLineNumber();
	}
	
	// Getting the current filename in the code
	public static String __FILE__() {
		return new Exception().getStackTrace()[1].getFileName();
	}
}
