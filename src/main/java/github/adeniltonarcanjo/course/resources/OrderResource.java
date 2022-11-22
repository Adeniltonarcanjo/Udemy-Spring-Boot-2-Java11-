package github.adeniltonarcanjo.course.resources;

import github.adeniltonarcanjo.course.entities.Order;
import github.adeniltonarcanjo.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService service;


    @GetMapping
    ResponseEntity<List<Order>> findAll() {
        List<Order> obj = service.findAll();
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = {"/{id}"})
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
