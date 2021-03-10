package kr.co.farmstory.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import kr.co.farmstory.service.BoardService;
import kr.co.farmstory.vo.BoardVo;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;

	@GetMapping("/board/list")
	public String list(String pg, String group, String cate, Model model) {
		
		int start = service.getLimitStart(pg);
		int total = service.selectCountTotalArticle(cate);
		int lastPageNum = service.getLastPageNum(total);
		int count = service.getListCount(total, start);
		
		List<BoardVo> articles = service.selectArticles(cate, start);
		
		model.addAttribute("articles", articles);
		model.addAttribute("group", group);
		model.addAttribute("cate", cate);
		model.addAttribute("lastPageNum", lastPageNum);
		model.addAttribute("count", count);
		
		return "/board/list";
	}
	
	@GetMapping("/board/write")
	public String write(String group, String cate, Model model) {
		
		model.addAttribute("group", group);
		model.addAttribute("cate", cate);
		
		return "/board/write";
	}
	
	@PostMapping("/board/write")
	public String write(String group, String cate, BoardVo vo, HttpServletRequest req) {
		
		String regip = req.getRemoteAddr();
		vo.setRegip(regip);

		service.insertArticle(vo);
		
		return "redirect:/board/list?group="+group+"&cate="+cate;
	}
	
	@GetMapping("/board/view")
	public String view(String seq, String group, String cate, Model model) {
		
		BoardVo article = service.selectArticle(seq);
		
		model.addAttribute("seq", seq);
		model.addAttribute("article", article);
		model.addAttribute("group", group);
		model.addAttribute("cate", cate);
		
		return "/board/view";
	}
	
	@GetMapping("/board/modify")
	public String modify(String seq, String group, String cate, Model model) {
		
		BoardVo article = service.selectArticle(seq);
		
		model.addAttribute("seq", seq);
		model.addAttribute("article", article);
		model.addAttribute("group", group);
		model.addAttribute("cate", cate);
		
		return "/board/modify";
	}
	
	@PostMapping("/board/modify")
	public String modify(BoardVo vo, String group, String cate) {
		
		service.updateArticle(vo);
		
		return "redirect:/board/view?seq="+vo.getSeq()+"&group="+group+"&cate="+cate;
	}
}