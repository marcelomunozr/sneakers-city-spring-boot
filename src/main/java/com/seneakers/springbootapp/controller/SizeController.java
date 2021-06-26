package com.seneakers.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.seneakers.springbootapp.service.SizeService;
import com.seneakers.springbootapp.dto.Size;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/sizes")
public class SizeController {

	@Autowired
	private SizeService sizeService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Size saveSize(@RequestBody Size size) {
		return sizeService.create(size);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Size> getAllSizes() {
		return sizeService.read();
	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Size updateSize(@RequestBody Size size) {
		return sizeService.update(size);
	}

	@DeleteMapping("/{id}")
	public Map<String, String> deleteSize(@PathVariable String id) {

		return sizeService.delete(id);
	}

}
