package com.kenneth.util;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.kenneth.exception.InvalidPasswordException;
import com.kenneth.stub.HttpServletRequestStub;

public class UtilTest {

	Map<String, String[]> mockMap;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none(); 
	
	@Before
	public void setUp() throws Exception {
		mockMap = new HashMap<String, String[]>();		
	}
		
	
	@Test
	public void getNameFunctionShouldReturnEmptyStringIfNoNameParam() throws Exception {
		HttpServletRequest requestStub = new HttpServletRequestStub(mockMap);
		
		assertEquals("", Util.getName(requestStub));		
	}

	@Test
	public void getNameFunctionShouldReturnValueIfParamValid() {
		String[] strArr = {"kenneth"};
		mockMap.put("name", strArr);
		HttpServletRequest requestStub = new HttpServletRequestStub(mockMap);
		
		assertEquals("kenneth", Util.getName(requestStub));
	}

	@Test
	public void getPasswordFunctionShouldThrowExceptionWhenNullInput() throws Exception {
		HttpServletRequest requestStub = new HttpServletRequestStub(mockMap);
		thrown.expect(InvalidPasswordException.class);
		thrown.expectMessage("Invalid password!!! Password can not be empty and must be at least 6 characters!");
		
		Util.getPassword(requestStub);
	}
	
	@Test
	public void getPasswordFunctionShouldThrowExceptionWhenInvalidInput() throws Exception {
		String[] strArr = {"xx"};
		mockMap.put("name", strArr);
		HttpServletRequest requestStub = new HttpServletRequestStub(mockMap);
		thrown.expect(InvalidPasswordException.class);
		thrown.expectMessage("Invalid password!!! Password can not be empty and must be at least 6 characters!");
		
		Util.getPassword(requestStub);
	}
	
	@Test
	public void getPasswordFunctionShouldReturnNormalWhenValidInput() throws Exception {
		String[] strArr = {"123456"};
		mockMap.put("password", strArr);
		HttpServletRequest requestStub = new HttpServletRequestStub(mockMap);
		
		assertEquals("123456", Util.getPassword(requestStub));
	}
}
