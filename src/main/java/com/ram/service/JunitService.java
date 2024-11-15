package com.ram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.dao.JunitDaoInterface;

@Service
public class JunitService {

	@Autowired
	private JunitDaoInterface dao;
	
	public String getWelcome() {
		return dao.getWelcome();
	}
	
	public String getGreet() {
		return dao.getGreet();
	}
}
