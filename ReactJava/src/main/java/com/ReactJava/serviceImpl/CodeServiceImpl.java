package com.ReactJava.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ReactJava.mapper.CodeMapper;
import com.ReactJava.servlce.CodeService;

@Service("codeService")
public class CodeServiceImpl implements CodeService {

	@Autowired
	private CodeMapper codeMapper;

	@Override
	public List<Map<String, String>> getCodeList(Map<String, Object> paramMap) throws Exception {
		return codeMapper.getCodeList(paramMap);
	}
	

}
