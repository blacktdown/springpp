package kr.co.ppol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ppol.dao.MainDao;
import kr.co.ppol.vo.CategoriesVo;
import kr.co.ppol.vo.ProductsVo;

@Service
public class MainService {
	
	@Autowired
	private MainDao dao;
	
	public List<CategoriesVo> selectCategories() {
		return dao.selectCategories();
	}
	
	public List<ProductsVo> selectHitProducts() {
		return dao.selectHitProducts();
	}
	
	public List<ProductsVo> selectBestProducts() {
		return dao.selectBestProducts();
	}
	public List<ProductsVo> selectRecommendProducts() {
		return dao.selectRecommendProducts();
	}
	public List<ProductsVo> selectNewProducts() {
		return dao.selectNewProducts();
	}
	public List<ProductsVo> selectDiscountProducts() {
		return dao.selectDiscountProducts();
	}

}
