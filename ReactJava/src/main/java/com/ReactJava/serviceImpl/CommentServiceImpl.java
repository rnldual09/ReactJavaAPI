package com.ReactJava.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ReactJava.mapper.CommentMapper;
import com.ReactJava.servlce.CommentService;

@Service("commentService")
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentMapper commentMapper;

	@Override
	public List<Map<String, Object>> getCommentList(Map<String, Object> paramMap) throws Exception {
		
		
		List<Map<String, Object>> parentCommentList = commentMapper.getCommentList(paramMap);
		
		for(int i=0; i<parentCommentList.size(); i++ ) {
			
			int parentCommentId = (int) parentCommentList.get(i).get("commentId");
			paramMap.put("parentCommentId", parentCommentId);
			
			List<Map<String, Object>> childCommentList = commentMapper.getCommentList(paramMap);
			parentCommentList.get(i).put("childCommentList", childCommentList);
		}
		
		return parentCommentList;
	}
	
	@Override
	public int editComment(Map<String, Object> paramMap) throws Exception {
		return commentMapper.editComment(paramMap);
	}

}
