package com.ReactJava.servlce;

import java.util.List;
import java.util.Map;

public interface CommentService {

	// 댓글리스트 가져오기
	List<Map<String, Object>> getCommentList(Map<String, Object> paramMap) throws Exception;
	
	// 댓글작성
	int editComment(Map<String, Object> paramMap) throws Exception;

	

}
