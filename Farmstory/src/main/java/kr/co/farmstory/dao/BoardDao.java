package kr.co.farmstory.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.farmstory.vo.BoardVo;

@Repository
public interface BoardDao {

	public void insertArticle(BoardVo vo);
	
	public int selectCountTotalArticle(String cate);
	public BoardVo selectArticle(String seq);
	
	public List<BoardVo> selectArticles(String cate, int start);
	
	public void updateArticle(BoardVo vo);
	public void deleteArticle();
	
	
}