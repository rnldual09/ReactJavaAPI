package com.ReactJava.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ReactJava.servlce.CodeService;


@Controller("codeController")
public class CodeController {

	@Autowired
	private CodeService codeService;
	
	@PostMapping(value = "/code/getCodeList.do")
	@ResponseBody
	public Map<String, Object> getCodeList(@RequestBody Map<String,Object> paramMap) throws Exception {
		
		Map<String,Object> resultMap = new HashMap<>();
		
		List<Map<String,String>> codeList = codeService.getCodeList(paramMap);
		resultMap.put("codeList", codeList);
		
		return resultMap;
	}
	
}
