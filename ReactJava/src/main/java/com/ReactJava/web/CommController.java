package com.ReactJava.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ReactJava.servlce.CommService;


@Controller("commController")
public class CommController {

	@Autowired
	private CommService commService;
	
	@PostMapping(value = "/comm/getCodeList.do")
	@ResponseBody
	public Map<String, Object> getCodeList(@RequestBody Map<String,Object> paramMap) throws Exception {
		
		Map<String,Object> resultMap = new HashMap<>();
		
		List<Map<String,String>> codeList = commService.getCodeList(paramMap);
		resultMap.put("codeList", codeList);
		
		return resultMap;
	}
	
}
