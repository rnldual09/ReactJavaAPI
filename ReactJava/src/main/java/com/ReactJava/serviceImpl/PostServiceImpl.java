package com.ReactJava.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ReactJava.mapper.CommentMapper;
import com.ReactJava.mapper.PostMapper;
import com.ReactJava.servlce.PostService;

@Service("postService")
public class PostServiceImpl implements PostService {

	@Autowired
	private PostMapper postMapper;
	
	@Autowired
	private CommentMapper commentMapper;

	@Override
	public List<Map<String, String>> getPostList(Map<String, Object> paramMap) throws Exception {
		return postMapper.getPostList(paramMap);
	}

	@Override
	public int editPost(Map<String, Object> paramMap) throws Exception {
		
		if(paramMap.get("postId") != null && !"".equals(paramMap.get("postId"))) {
			return postMapper.editPost(paramMap);
		} else {
			return postMapper.insertPost(paramMap);
		}
	}

	@Override
	public int viewCountUp(Map<String, Object> paramMap) throws Exception {
		return postMapper.viewCountUp(paramMap);
	}

	@Override
	public Map<String, String> getPostInfo(Map<String, Object> paramMap) throws Exception {
		
		List<Map<String, String>> postList = postMapper.getPostList(paramMap);
		Map<String, String> postInfo = postList.get(0);
		
		return postInfo;
	}

	@Override
	public Map<String, Object> getHighPostList() throws Exception {
		
		Map<String, Object> resultMap = new HashMap<>();
		
		List<Map<String, String>> highCommentPostList = new ArrayList<>();
		List<Map<String, String>> highViewCountPostList = new ArrayList<>();
		
		List<Map<String, Object>> highPostIdList = postMapper.getHighPostIdList();
		
		for(int i=0; i<highPostIdList.size(); i++) {
			
			String type = (String) highPostIdList.get(i).get("type");
			int postId = (int) highPostIdList.get(i).get("postId");
			
			Map<String,Object> map = new HashMap<>();
			map.put("postId",postId);
			
			List<Map<String, String>> postList = postMapper.getPostList(map);
			
			if("comment".equals(type)) {
				highCommentPostList.add(postList.get(0));
			} else {
				highViewCountPostList.add(postList.get(0));
			}
		}
		
		resultMap.put("highCommentPostList", highCommentPostList);
		resultMap.put("highViewCountPostList", highViewCountPostList);
		
		return resultMap;
	}

	@Override
	public int delPost(Map<String, Object> paramMap) throws Exception {
		
		// 트랜잭션 없이
		int cnt1 = postMapper.delPost(paramMap);
		int cnt2 = commentMapper.delComent(paramMap);
		
		return cnt1 + cnt2;
	}
	

}
