package com.ram.dao;

import org.springframework.stereotype.Repository;

@Repository
public class JunitDaoImpl implements JunitDaoInterface {

	@Override
	public String getWelcome() {
		return "welcome";
	}

	@Override
	public String getGreet() {
		// TODO Auto-generated method stub
		return "hi";
	}

}
