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
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@GetMapping("/member/logout")
	public String logout(HttpSession sess) {
		sess.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/member/login")
	public String login() {
		return "/member/login";
	}

	@PostMapping("/member/login")
	public String login(MemberVo vo, HttpSession sess) {
		
		MemberVo member = service.selectMember(vo);
		
		if(member != null) {
			sess.setAttribute("smember", member);
			return "redirect:/index";
		} else {
			return "redirect:/member/login";
		}
	}
	
	@GetMapping("/member/terms")
	public String terms(Model model) {
		
		TermsVo vo = service.selectTerms();
		model.addAttribute("vo", vo);
		
		return "/member/terms";
	}
	
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	
	@PostMapping("/member/register")
	public String register(MemberVo vo, HttpServletRequest req) {
		
		String regip = req.getRemoteAddr();
		vo.setRegip(regip);
		
		service.insertMember(vo);
		
		return "redirect:/member/login";
	}
	
	@GetMapping("/member/register-seller")
	public String registerSeller() {
		return "/member/register-seller";
	}
	
	@GetMapping("/member/signup")
	public String signup() {
		return "/member/signup";
	}

}
