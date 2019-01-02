package com.hello.dani.dao2;

import com.hello.dani.dto.HomeDTO;

public interface HongMapper {
	
	public String selectHomeData();
	
	public HomeDTO selectHomeTimeInfo(String param);
}
