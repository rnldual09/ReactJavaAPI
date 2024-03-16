package com.ReactJava.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ReactJava.mapper.CommMapper;
import com.ReactJava.servlce.CommService;

@Service("commService")
public class CommServiceImpl implements CommService {

	@Autowired
	private CommMapper commMapper;

	@Override
	public List<Map<String, String>> getCodeList(Map<String, Object> paramMap) throws Exception {
		return commMapper.getCodeList(paramMap);
	}
	

}
