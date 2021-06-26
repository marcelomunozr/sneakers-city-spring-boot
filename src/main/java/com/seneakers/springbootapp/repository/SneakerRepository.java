package com.seneakers.springbootapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.seneakers.springbootapp.dto.Sneaker;

@Repository
public interface SneakerRepository extends MongoRepository<Sneaker, String> {

}
