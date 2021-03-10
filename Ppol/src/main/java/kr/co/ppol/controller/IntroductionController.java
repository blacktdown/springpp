package kr.co.ppol.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ppol.service.MemberService;
import kr.co.ppol.vo.MemberVo;
import kr.co.ppol.vo.TermsVo;

@Controller
public class IntroductionController {
	
	
	@GetMapping("/introduction/hello")
	public String hello() {
		return "introduction/hello";
	}
	

}
