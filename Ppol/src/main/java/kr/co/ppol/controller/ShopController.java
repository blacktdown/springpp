package kr.co.ppol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {
	
	@GetMapping("/shop/cart")
	public String cart() {
		return "/shop/cart";
	}
	
	@GetMapping("/shop/list")
	public String list() {
		return "/shop/list";
	}

	@GetMapping("/shop/noname")
	public String noname() {
		return "/shop/noname";
	}
	
	@GetMapping("/shop/order")
	public String order() {
		return "/shop/order";
	}
	
	@GetMapping("/shop/order_complete")
	public String orderComplete() {
		return "/shop/order_complete";
	}
	
	@GetMapping("/shop/view")
	public String view() {
		return "/shop/view";
	}

}
