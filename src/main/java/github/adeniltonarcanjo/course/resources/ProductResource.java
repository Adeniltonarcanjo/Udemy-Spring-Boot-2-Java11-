package github.adeniltonarcanjo.course.resources;


import github.adeniltonarcanjo.course.entities.Category;
import github.adeniltonarcanjo.course.entities.Product;
import github.adeniltonarcanjo.course.services.CategoryService;
import github.adeniltonarcanjo.course.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductResource {

    @Autowired
    public ProductService service;

    @RequestMapping
    ResponseEntity<List<Product>> findAll() {
        List<Product> obj = service.findAll();
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = {"/{id}"})
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
