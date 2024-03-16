package com.ReactJava.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommMapper {

	// 코드리스트 가져오기
	List<Map<String, String>> getCodeList(Map<String, Object> paramMap);

	

}
