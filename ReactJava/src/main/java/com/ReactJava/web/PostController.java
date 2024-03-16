package com.ReactJava.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ReactJava.servlce.PostService;


@Controller("postController")
public class PostController {

	@Autowired
	private PostService postService;
	
	@PostMapping(value = "/post/getPostList.do")
	@ResponseBody
	public Map<String, Object> getPostList(@RequestBody Map<String,Object> paramMap) throws Exception {
		
		Map<String,Object> resultMap = new HashMap<>();
		
		List<Map<String,String>> postList = postService.getPostList(paramMap);
		resultMap.put("postList", postList);
		
		return resultMap;
	}
	
	@PostMapping(value = "/post/editPost.do")
	@ResponseBody
	public Map<String, Object> editPost(@RequestBody Map<String,Object> paramMap) throws Exception {
		
		Map<String,Object> resultMap = new HashMap<>();
		
		int cnt = postService.editPost(paramMap);
		resultMap.put("cnt", cnt);
		
		return resultMap;
	}
}
