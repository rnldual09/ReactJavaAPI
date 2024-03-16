package com.ReactJava.servlce;

import java.util.List;
import java.util.Map;

public interface PostService {

	// 게시글가져오기 
	List<Map<String, String>> getPostList(Map<String, Object> paramMap) throws Exception;

	// 게시글 등록 및 수정
	int editPost(Map<String, Object> paramMap) throws Exception;

	

}
