package kr.co.farmstory.dao;

import org.springframework.stereotype.Repository;

import kr.co.farmstory.vo.TermsVo;
import kr.co.farmstory.vo.UserVo;

@Repository
public interface UserDao {
	
	public void insertUser(UserVo vo);
	public TermsVo selectTerms();
	public UserVo selectUser(UserVo vo);
	public void selectUsers();
	public void updateUser();
	public void deleteUser();

}
