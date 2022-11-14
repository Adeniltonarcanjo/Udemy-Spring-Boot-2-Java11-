package github.adeniltonarcanjo.course.resources;


import github.adeniltonarcanjo.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    ResponseEntity<User> getUsers() {
        User user = new User(null, "maria", "maria@gmail.com", "4723846732", "37829749324");
        return ResponseEntity.ok().body(user);
    }


}
