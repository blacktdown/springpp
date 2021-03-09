package kr.co.ppol;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("kr.co.ppol.dao")
public class PpolApplication {

	public static void main(String[] args) {
		SpringApplication.run(PpolApplication.class, args);
	}

}
