package com.hello.dani.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.dani.dao1.DaniMapper;
import com.hello.dani.dao2.HongMapper;
import com.hello.dani.dto.HomeDTO;

@Service
public class HomeService {

	@Autowired
	DaniMapper daniMapper;

	@Autowired
	HongMapper hongMapper;
	
	public HomeDTO selectHomeTimeInfo(String param) {
		return daniMapper.selectHomeTimeInfo(param);
	}
	
	public String selectHomeData() {
		return hongMapper.selectHomeData();
	}

}
