package com.example.demo;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServerRepository extends MongoRepository<Server, String> {
	public List<Server> findByName(String name);
}