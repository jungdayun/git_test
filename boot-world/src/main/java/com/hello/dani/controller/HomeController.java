package com.hello.dani.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.dani.dto.HomeDTO;
import com.hello.dani.service.HomeService;

@RestController
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@RequestMapping("/")
	public String hello(){
		
		String hongData = homeService.selectHomeData();
		System.out.println("hongData>>>>>>" + hongData);
		HomeDTO dtoData = homeService.selectHomeTimeInfo("2");
		System.out.println(">>>>>dtoData>>>>>" + dtoData);
		
		System.out.println(">>>>GIT 수정 테스트>>>>>");
		
		return "hello World";
	}
}
