package com.ram;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ram.controller.JunitController;
import com.ram.service.JunitService;

@WebMvcTest(value = JunitController.class)
public class JunitControllerTest {

	@MockBean
	private JunitService service;
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void getWelcomeTest() throws Exception {
		//define mock object behavior
		when(service.getWelcome()).thenReturn("Welcome to Junit");
		//prepare http get request
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/welcome");
		//send request & hold response
		MvcResult result = mvc.perform(reqBuilder).andReturn();
		//verify response
		MockHttpServletResponse response = result.getResponse();
		int status = response.getStatus();
		assertEquals(200, status);
	}
	
	@Test
	public void getGreetTest() throws Exception {
		//define mock object behavior
		when(service.getGreet()).thenReturn("Hello");
		
		//prepare http get request
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/greet");
		
		//send request & hold response
		MvcResult result = mvc.perform(reqBuilder).andReturn();
		
		//verify response
		MockHttpServletResponse response = result.getResponse();
		int status = response.getStatus();
		assertEquals(200, status);
	}
}
