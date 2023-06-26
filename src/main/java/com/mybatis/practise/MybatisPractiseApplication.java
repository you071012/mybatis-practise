package com.mybatis.practise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.mybatis.practise"})
@RestController
public class MybatisPractiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisPractiseApplication.class, args);
	}


	@GetMapping("/")
	public String index(){
		return "OK";
	}
}
