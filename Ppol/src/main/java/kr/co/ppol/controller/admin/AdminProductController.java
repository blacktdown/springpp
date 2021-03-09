package kr.co.ppol.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.ppol.service.AdminService;
import kr.co.ppol.vo.Cate1Vo;
import kr.co.ppol.vo.Cate2Vo;
import kr.co.ppol.vo.ProductsVo;

@Controller
public class AdminProductController {

	@Autowired
	private AdminService service;
	
	@GetMapping("/admin/product/list")
	public String list() {
		return "/admin/product/list";
	}
	
	@GetMapping("/admin/product/register")
	public String register() {
		return "/admin/product/register";
	}
	
	@PostMapping("/admin/product/register")
	public String register(ProductsVo vo, HttpServletRequest req) {
		
		String regip = req.getRemoteAddr();
		vo.setIp(regip);
		
		// 상품 이미지 업로드
		ProductsVo product = service.uploadThumb(vo);
		service.insertProduct(product);
		
		return "/admin/product/register";
	}
	
	@ResponseBody
	@GetMapping("/admin/product/cate1")
	public List<Cate1Vo> getCate1() {
		List<Cate1Vo> cate1s = service.selectCate1();
		return cate1s;
	}
	
	@ResponseBody
	@GetMapping("/admin/product/cate2")
	public List<Cate2Vo> getCate2(int code1) {
		List<Cate2Vo> cate2s = service.selectCate2(code1);
		return cate2s;
	}

}
