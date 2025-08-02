package com.tiago_silveirago.course.springboot.springbootproductsapi.controller;

import com.tiago_silveirago.course.springboot.springbootproductsapi.model.Product;
import com.tiago_silveirago.course.springboot.springbootproductsapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        System.out.println("Product created: " + product);

        var id = UUID.randomUUID().toString();
        product.setId(id);

        productRepository.save(product);

        return product;
    }

    @GetMapping("{id}") //barra antes do id opcional
    public Product getById(@PathVariable("id") String id) {
        return productRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") String id) {
        productRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable("id") String id, @RequestBody Product product) {
        product.setId(id);
        productRepository.save(product);
    }

    @GetMapping
    public List<Product> get(@RequestParam("name") String name) {
        return productRepository.findByName(name);
    }
}
