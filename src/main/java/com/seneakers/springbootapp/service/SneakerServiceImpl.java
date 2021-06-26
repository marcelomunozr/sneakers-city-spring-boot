package com.seneakers.springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seneakers.springbootapp.dto.Sneaker;
import com.seneakers.springbootapp.repository.SneakerRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SneakerServiceImpl implements SneakerService {

	@Autowired
	private SneakerRepository sneakerRepository;

	@Override
	public Sneaker create(Sneaker sneaker) {
		return sneakerRepository.insert(sneaker);
	}

	@Override
	public List<Sneaker> read() {
		return sneakerRepository.findAll();
	}

	@Override
	public Sneaker update(Sneaker sneaker) {
		return sneakerRepository.save(sneaker);
	}

	@Override
	public Map<String, String> delete(String id) {
		
		Number beforeDelete = sneakerRepository.count();

		sneakerRepository.deleteById(id);
		
		Number afterDelete = sneakerRepository.count();

		String messageValue = beforeDelete == afterDelete ? "No se pudo eliminar" : "Zapatilla eliminada";

		Map<String, String> deleteMap = new HashMap<>();
		deleteMap.put("mensaje", messageValue);

		return deleteMap;
	}
}
