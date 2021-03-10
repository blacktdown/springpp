package kr.co.farmstory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.farmstory.dao.UserDao;
import kr.co.farmstory.vo.TermsVo;
import kr.co.farmstory.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	public void insertUser(UserVo vo) {
		dao.insertUser(vo);
	}
	public TermsVo selectTerms() {
		return dao.selectTerms();
	}
	public UserVo selectUser(UserVo vo) {
		return dao.selectUser(vo);
	}
	public void selectUsers() {}
	public void updateUser() {}
	public void deleteUser() {}

}
