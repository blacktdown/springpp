package kr.co.farmstory.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.farmstory.dao.MainDao;
import kr.co.farmstory.vo.BoardVo;

@Service
public class MainService {

	@Autowired
	private MainDao dao;
	
	public List<List<BoardVo>> selectLatest(){
		
		List<BoardVo> list = dao.selectLatest();
		List<List<BoardVo>> newList = reformDataSet(list);
		
		return newList;
	}
	
	public List<List<BoardVo>> reformDataSet(List<BoardVo> list) {
		
		List<List<BoardVo>> newList = new ArrayList<>();
		
		for (int k=0 ; k<3 ; k++) {
			
			List<BoardVo> smallList = new ArrayList<>();
			
			for(int i=0 ; i<5 ; i++) {		
				
				smallList.add(list.get(i));
				list.remove(i);
				
			}
			newList.add(smallList);
		}
		
		return newList;
	}
	
}