package com.seneakers.springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seneakers.springbootapp.dto.Size;
import com.seneakers.springbootapp.repository.SizeRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SizeServiceImpl implements SizeService {

	@Autowired
	private SizeRepository sizeRepository;

	@Override
	public Size create(Size size) {
		return sizeRepository.insert(size);
	}

	@Override
	public List<Size> read() {
		return sizeRepository.findAll();
	}

	@Override
	public Size update(Size size) {
		return sizeRepository.save(size);
	}

	@Override
	public Map<String, String> delete(String id) {
		
		Number beforeDelete = sizeRepository.count();

		sizeRepository.deleteById(id);
		
		Number afterDelete = sizeRepository.count();

		String messageValue = beforeDelete == afterDelete ? "No se pudo eliminar" : "Talla eliminada";

		Map<String, String> deleteMap = new HashMap<>();
		deleteMap.put("mensaje", messageValue);

		return deleteMap;
	}
}
