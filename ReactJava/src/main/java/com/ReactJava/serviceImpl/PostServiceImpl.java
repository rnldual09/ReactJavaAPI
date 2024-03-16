package com.ReactJava.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ReactJava.mapper.PostMapper;
import com.ReactJava.servlce.PostService;

@Service("postService")
public class PostServiceImpl implements PostService {

	@Autowired
	private PostMapper postMapper;

	@Override
	public List<Map<String, String>> getPostList(Map<String, Object> paramMap) throws Exception {
		return postMapper.getPostList(paramMap);
	}

	@Override
	public int editPost(Map<String, Object> paramMap) throws Exception {
		return postMapper.editPost(paramMap);
	}
	

}
