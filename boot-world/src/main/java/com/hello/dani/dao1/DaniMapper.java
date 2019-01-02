package com.hello.dani.dao1;

import com.hello.dani.dto.HomeDTO;

public interface DaniMapper {
	
	public String selectHomeData();
	
	public HomeDTO selectHomeTimeInfo(String param);
}
