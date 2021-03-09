package kr.co.ppol.service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.ppol.dao.AdminDao;
import kr.co.ppol.vo.Cate1Vo;
import kr.co.ppol.vo.Cate2Vo;
import kr.co.ppol.vo.ProductsVo;

@Service
public class AdminService {

	@Autowired
	private AdminDao dao;
	
	public List<Cate1Vo> selectCate1() {
		return dao.selectCate1();
	}
	
	public List<Cate2Vo> selectCate2(int code1) {
		return dao.selectCate2(code1);
	}
	
	public void insertProduct(ProductsVo vo) {
		dao.insertProduct(vo);
	}
	
public ProductsVo uploadThumb(ProductsVo vo) {
		
		String uploadPath = "src/main/resources/static/thumb/";
		String path = new File(uploadPath).getAbsolutePath();
		
		MultipartFile[] files = {vo.getFile1(), vo.getFile2(), vo.getFile3(), vo.getFile4()};
		
		for(int i=0 ; i<4 ; i++) {
			
			MultipartFile file = files[i];
			
			if(!file.isEmpty()) {
				
				String name = file.getOriginalFilename();
				String ext = name.substring(name.lastIndexOf("."));
				
				String uName = UUID.randomUUID().toString()+ext;
				String fullPath = path+"/"+vo.getCate1()+"/"+vo.getCate2()+"/";
				
				try {
					Path root = Paths.get(fullPath);
					Files.createDirectories(root);
					
					file.transferTo(new File(fullPath+uName));
					
					if(i == 0) vo.setThumb1(uName);
					if(i == 1) vo.setThumb2(uName);
					if(i == 2) vo.setThumb3(uName);
					if(i == 3) vo.setDetail(uName);
					
				}catch (Exception e) {
					e.printStackTrace();
				} 	
			} // if end
		} // for end
		return vo;
	} // method end
}