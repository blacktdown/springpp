package kr.co.farmstory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.farmstory.service.MainService;
import kr.co.farmstory.vo.BoardVo;

@Controller
public class MainController {

	@Autowired
	private MainService service;
	
	@GetMapping("/index")
	public String index(Model model) {
		
		List<List<BoardVo>> latests = service.selectLatest();
		
		model.addAttribute("latest1", latests.get(0));
		model.addAttribute("latest2", latests.get(1));
		model.addAttribute("latest3", latests.get(2));
		
		return "/index";
	}
	
}