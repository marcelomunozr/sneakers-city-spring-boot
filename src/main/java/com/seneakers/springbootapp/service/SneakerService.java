package com.seneakers.springbootapp.service;

import com.seneakers.springbootapp.dto.Sneaker;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface SneakerService {

	Sneaker create(Sneaker sneaker);
	
	List<Sneaker> read();
	
	Sneaker update(Sneaker sneaker);
	
	Map<String, String> delete(String id);
}
