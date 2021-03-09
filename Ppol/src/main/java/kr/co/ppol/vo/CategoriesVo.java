package kr.co.ppol.vo;

import java.util.List;

public class CategoriesVo {
	
	private int code1;
	private String title;
	
	private List<Cate2Vo> cate2List;

	public int getCode1() {
		return code1;
	}

	public void setCode1(int code1) {
		this.code1 = code1;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Cate2Vo> getCate2List() {
		return cate2List;
	}

	public void setCate2List(List<Cate2Vo> cate2List) {
		this.cate2List = cate2List;
	}
	
	

}
