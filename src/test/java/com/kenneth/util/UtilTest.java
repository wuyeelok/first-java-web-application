package com.kenneth.util;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.junit.Before;
import org.junit.Test;

import com.kenneth.stub.HttpServletRequestStub;

public class UtilTest {

	Map<String, String[]> mockMap;
	
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


}
