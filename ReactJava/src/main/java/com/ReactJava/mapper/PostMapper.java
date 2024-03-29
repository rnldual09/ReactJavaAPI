package com.ReactJava.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostMapper {

	// 게시글가져오기 
	List<Map<String, String>> getPostList(Map<String, Object> paramMap);
	
	// 게시글 수정
	int editPost(Map<String, Object> paramMap);
		
	// 게시글 등록
	int insertPost(Map<String, Object> paramMap);

	// 게시글 조회수 +
	int viewCountUp(Map<String, Object> paramMap);

	// 하이라이트 게시글리스트
	List<Map<String, Object>> getHighPostIdList();

	// 게시글 삭제
	int delPost(Map<String, Object> paramMap);

}
