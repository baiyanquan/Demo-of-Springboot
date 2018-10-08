package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

import model.Greetings;

public interface GreetingsRepository extends MongoRepository<Greetings, String> {

	public Greetings findByid(String id);
	
}
