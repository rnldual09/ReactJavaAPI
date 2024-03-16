package com.ReactJava.servlce;

import java.util.List;
import java.util.Map;

public interface CommService {

	// 코드리스트 가져오기
	List<Map<String, String>> getCodeList(Map<String, Object> paramMap) throws Exception;

	

}
