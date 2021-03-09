package kr.co.ppol.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.ppol.vo.CategoriesVo;
import kr.co.ppol.vo.ProductsVo;

@Repository
public interface MainDao {
	
	public List<CategoriesVo> selectCategories();
	
	public List<ProductsVo> selectHitProducts();
	public List<ProductsVo> selectBestProducts();
	public List<ProductsVo> selectRecommendProducts();
	public List<ProductsVo> selectNewProducts();
	public List<ProductsVo> selectDiscountProducts();
	
}
