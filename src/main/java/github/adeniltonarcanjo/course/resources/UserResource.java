package github.adeniltonarcanjo.course.resources;


import github.adeniltonarcanjo.course.entities.User;
import github.adeniltonarcanjo.course.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/users")
public class UserResource {

    UserRepository repository;





}
