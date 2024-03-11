package com.ReactJava.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ReactJava.servlce.TestService;


@Controller("testController")
public class TestController {

	@Autowired
	private TestService testService;
	
	@GetMapping(value = "/test/testConnection.do")
	@ResponseBody
	public void postAppExist() throws Exception {
		String test = testService.testDbConnection();
		System.out.println("test : " + test);
	}
}
