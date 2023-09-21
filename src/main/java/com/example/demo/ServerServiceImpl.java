package com.example.demo;
import java.util.List;
import java.util.Optional;
import com.example.demo.Server;
import com.example.demo.ServerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServerServiceImpl implements ServerService {

    @Autowired
    private ServerRepository serverRepository;

    @Override
    public List<Server> findAll() {
        return serverRepository.findAll();
    }

    @Override
    public Optional<Server> findById(String Id) {
        return serverRepository.findById(Id);
    }

    @Override
    public void createOrUpdateServer(Server server) {
        serverRepository.save(server);
    }

    @Override
    public void deleteServerById(String Id) {
        serverRepository.deleteById(Id);
    }

    @Override
    public List<Server> findByName(String name) {
        return serverRepository.findByName(name);
    }

    public boolean existsServerById(String id) {
        return serverRepository.existsById(id);
    }

}
