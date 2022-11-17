package github.adeniltonarcanjo.course.resources;


import github.adeniltonarcanjo.course.entities.Category;
import github.adeniltonarcanjo.course.entities.Payment;
import github.adeniltonarcanjo.course.services.CategoryService;
import github.adeniltonarcanjo.course.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/payments")
public class PaymentResource {

    @Autowired
    public PaymentService service;

    @RequestMapping
    ResponseEntity<List<Payment>> findAll() {
        List<Payment> obj = service.findAll();
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = {"/{id}"})
    public ResponseEntity<Payment> findById(@PathVariable Long id) {
        Payment obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
