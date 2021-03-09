package kr.co.ppol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ppol.dao.MemberDao;
import kr.co.ppol.vo.MemberVo;
import kr.co.ppol.vo.TermsVo;

@Service
public class MemberService {

	@Autowired
	private MemberDao dao;
	
	public void insertMember(MemberVo vo) {
		dao.insertMember(vo);
	}
	public TermsVo selectTerms() {
		return dao.selectTerms();
	}
	public MemberVo selectMember(MemberVo vo) {
		return dao.selectMember(vo);
	}
	public void selectMembers() {}
	public void updateMember() {}
	public void deleteMember() {}

}