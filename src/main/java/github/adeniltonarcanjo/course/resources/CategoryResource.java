package github.adeniltonarcanjo.course.resources;


import github.adeniltonarcanjo.course.entities.Category;
import github.adeniltonarcanjo.course.entities.Order;
import github.adeniltonarcanjo.course.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryResource {

    @Autowired
    public CategoryService service;

    @GetMapping
    ResponseEntity<List<Category>> findAll() {
        List<Category> obj = service.findAll();
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = {"/{id}"})
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
