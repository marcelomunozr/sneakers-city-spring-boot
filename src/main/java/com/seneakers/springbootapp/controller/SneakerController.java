package com.seneakers.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.seneakers.springbootapp.service.SneakerService;
import com.seneakers.springbootapp.dto.Sneaker;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/sneakers")
public class SneakerController {

	@Autowired
	private SneakerService sneakerService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Sneaker saveSneaker(@RequestBody Sneaker sneaker) {
		return sneakerService.create(sneaker);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Sneaker> getAllSneakers() {
		return sneakerService.read();
	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Sneaker updateSneaker(@RequestBody Sneaker sneaker) {
		return sneakerService.update(sneaker);
	}

	@DeleteMapping("/{id}")
	public Map<String, String> deleteSneaker(@PathVariable String id) {

		return sneakerService.delete(id);
	}
}
