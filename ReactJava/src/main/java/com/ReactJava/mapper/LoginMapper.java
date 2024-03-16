package com.ReactJava.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {

	// 중복아이디 확인
	int getDupCnt(Map<String, Object> paramMap);
	
	// 유저 아이디 가져오기
	String getUserId(Map<String, Object> paramMap);
	
	// 회원가입
	int joinUser(Map<String, Object> paramMap);

	

}
