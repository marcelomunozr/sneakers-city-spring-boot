package com.seneakers.springbootapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.seneakers.springbootapp.dto.Size;

@Repository
public interface SizeRepository extends MongoRepository<Size, String> {

}
