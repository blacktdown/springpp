package kr.co.ppol.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.ppol.vo.Cate1Vo;
import kr.co.ppol.vo.Cate2Vo;
import kr.co.ppol.vo.ProductsVo;

@Repository
public interface AdminDao {
	
	public List<Cate1Vo> selectCate1();
	public List<Cate2Vo> selectCate2(int code1);
	
	public void insertProduct(ProductsVo vo);
	
}