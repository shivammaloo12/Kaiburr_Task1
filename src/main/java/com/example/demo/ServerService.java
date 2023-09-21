package com.example.demo;

import java.util.List;
import java.util.Optional;

import com.example.demo.Server;

public interface ServerService {

    List<Server> findAll();

    Optional<Server> findById(String Id);

    void createOrUpdateServer(Server server);

    void deleteServerById(String Id);

    List<Server> findByName(String name);
}
