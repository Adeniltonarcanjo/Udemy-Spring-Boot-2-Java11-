package github.adeniltonarcanjo.course.resources;


import github.adeniltonarcanjo.course.entities.User;
import github.adeniltonarcanjo.course.repositories.UserRepository;
import github.adeniltonarcanjo.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findALL(){
        List<User> obj = service.findAll();
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = {"/{id}"})
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj= service.findById(id);
        return ResponseEntity.ok().body(obj);
    }





}