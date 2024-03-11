package com.ReactJava.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ReactJava.mapper.TestMapper;
import com.ReactJava.servlce.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {

	@Autowired
	private TestMapper testMapper;
	
	@Override
	public String testDbConnection() throws Exception {
		return testMapper.testDbConnection();
	}

}
