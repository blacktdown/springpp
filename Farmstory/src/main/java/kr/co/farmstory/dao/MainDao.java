package kr.co.farmstory.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.farmstory.vo.BoardVo;

@Repository
public interface MainDao {

	public List<BoardVo> selectLatest();
	
}