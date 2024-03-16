package com.ReactJava.servlce;

import java.util.Map;

public interface LoginService {

	// 중복아이디 확인
	int getDupCnt(Map<String, Object> paramMap) throws Exception;
	
	// 회원가입
	int joinUser(Map<String, Object> paramMap) throws Exception;
	
	// 유저 아이디 가져오기
	String getUserId(Map<String, Object> paramMap) throws Exception;

}
