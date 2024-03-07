package com.example.workshopSpringMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.workshopSpringMongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
	

}
