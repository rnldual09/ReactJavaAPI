package com.ReactJava.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ReactJava.servlce.CommentService;


@Controller("commentController")
public class CommentController {

	@Autowired
	private CommentService commentService;

	@PostMapping(value = "/comment/getCommentList.do")
	@ResponseBody
	public Map<String, Object> getCommentList(@RequestBody Map<String,Object> paramMap) throws Exception {
		
		Map<String,Object> resultMap = new HashMap<>();
		
		List<Map<String,Object>> commentList = commentService.getCommentList(paramMap);
		resultMap.put("commentList", commentList);
		
		return resultMap;
	}	
		
	@PostMapping(value = "/comment/editComment.do")
	@ResponseBody
	public Map<String, Object> editComment(@RequestBody Map<String,Object> paramMap) throws Exception {
		
		Map<String,Object> resultMap = new HashMap<>();
		
		int cnt = commentService.editComment(paramMap);
		resultMap.put("cnt", cnt);
		
		return resultMap;
	}
}
