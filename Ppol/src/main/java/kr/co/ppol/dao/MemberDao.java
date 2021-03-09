package kr.co.ppol.dao;

import org.springframework.stereotype.Repository;

import kr.co.ppol.vo.MemberVo;
import kr.co.ppol.vo.TermsVo;

@Repository
public interface MemberDao {
	
	public void insertMember(MemberVo vo);
	public TermsVo selectTerms();
	public MemberVo selectMember(MemberVo vo);
	public void selectMembers();
	public void updateMember();
	public void deleteMember();

}