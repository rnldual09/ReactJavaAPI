package com.ReactJava.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {

	// 댓글리스트 가져오기
	List<Map<String, Object>> getCommentList(Map<String, Object> paramMap);
	
	// 댓글작성
	int editComment(Map<String, Object> paramMap);

	// 댓글삭제
	int delComent(Map<String, Object> paramMap);

}
