package com.seneakers.springbootapp.service;

import com.seneakers.springbootapp.dto.Size;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface SizeService {

	Size create(Size size);
	
	List<Size> read();
	
	Size update(Size size);
	
	Map<String, String> delete(String id);
}
