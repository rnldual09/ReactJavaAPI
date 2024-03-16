package com.ReactJava.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ReactJava.servlce.LoginService;
import com.ReactJava.servlce.TestService;


@Controller("userController")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@PostMapping(value = "/login/getDupCnt.do")
	@ResponseBody
	public Map<String, Object> getDupCnt(@RequestBody Map<String,Object> paramMap) throws Exception {
		
		Map<String,Object> resultMap = new HashMap<>();
		
		int cnt = loginService.getDupCnt(paramMap);
		resultMap.put("cnt", cnt);
		
		return resultMap;
	}
	
	@PostMapping(value = "/login/joinUser.do")
	@ResponseBody
	public Map<String, Object> joinUser(@RequestBody Map<String,Object> paramMap) throws Exception {
		
		Map<String,Object> resultMap = new HashMap<>();
		
		int cnt = loginService.joinUser(paramMap);
		resultMap.put("cnt", cnt);
		
		return resultMap;
	}
	
	@PostMapping(value = "/login/getUserId.do")
	@ResponseBody
	public Map<String, Object> getUserId(@RequestBody Map<String,Object> paramMap) throws Exception {
		
		Map<String,Object> resultMap = new HashMap<>();
		
		String userId = loginService.getUserId(paramMap);
		resultMap.put("userId", userId);
		
		return resultMap;
	}
}
