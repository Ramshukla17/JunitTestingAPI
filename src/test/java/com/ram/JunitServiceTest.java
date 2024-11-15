package com.ram;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ram.dao.JunitDaoInterface;
import com.ram.service.JunitService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class JunitServiceTest {

	@MockBean
	private JunitDaoInterface dao;
	
	@InjectMocks
	private JunitService service;
	
	@Test
	void getWelcomeTest() {
		when(dao.getWelcome()).thenReturn("Welcome");
		String result = service.getWelcome();
		assertNotNull(result);
	}
	
	@Test
	void getGreetTest() {
		when(dao.getGreet()).thenReturn("Hello");
		String result = service.getGreet();
		assertNotNull(result);
	}
}
