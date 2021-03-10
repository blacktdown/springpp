package kr.co.farmstory.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.farmstory.service.UserService;
import kr.co.farmstory.vo.TermsVo;
import kr.co.farmstory.vo.UserVo;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/user/logout")
	public String logout(HttpSession sess) {
		sess.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/user/login")
	public String login() {
		return "/user/login";
	}
	
	@PostMapping("/user/login")
	public String login(UserVo vo, HttpSession sess) {
		
		UserVo user = service.selectUser(vo);
		
		if(user != null) {
			sess.setAttribute("suser", user);
			return "redirect:/index";			
		}else {
			return "redirect:/user/login";			
		}
	}
	
	@GetMapping("/user/terms")
	public String terms(Model model) {
		TermsVo vo = service.selectTerms();
		
		model.addAttribute("vo", vo);
		
		return "/user/terms";
	}
	
	@GetMapping("/user/register")
	public String register() {
		return "/user/register";
	}
	
	@PostMapping("/user/register")
	public String register(UserVo vo, HttpServletRequest req) {
		
		String regip = req.getRemoteAddr();
		vo.setRegip(regip);
		
		service.insertUser(vo);
		
		return "redirect:/user/login";
	}
}