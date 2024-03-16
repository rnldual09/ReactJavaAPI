package com.ReactJava.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ReactJava.mapper.LoginMapper;
import com.ReactJava.servlce.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginMapper loginMapper;

	@Override
	public int getDupCnt(Map<String, Object> paramMap) throws Exception {
		return loginMapper.getDupCnt(paramMap);
	}
	
	@Override
	public String getUserId(Map<String, Object> paramMap) throws Exception {
		return loginMapper.getUserId(paramMap);
	}
	
	@Override
	public int joinUser(Map<String, Object> paramMap) throws Exception {
		return loginMapper.joinUser(paramMap);
	}

	
}
