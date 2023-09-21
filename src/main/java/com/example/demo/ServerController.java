package com.example.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ServerController {
    @Autowired
    private ServerRepository sr;
    @GetMapping("/server")
    public List<Server> server(){
        return sr.findAll();
    }
    @GetMapping("/get/{name}")
    private List<Server> getServersByName(@PathVariable ("name") String name) {
        return sr.findByName(name);

    }
    @PostMapping("/add")
    private String saveServer(@RequestBody Server server) {
        sr.save(server);
        return  "Added Successfully";
    }
    @DeleteMapping("/delete/{id}")
    private String deleteServer(@PathVariable("id") String id) {
        sr.deleteById(id);
        return "Deleted Successfully";
    }

}