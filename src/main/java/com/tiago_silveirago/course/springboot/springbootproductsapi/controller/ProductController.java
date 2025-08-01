package com.tiago_silveirago.course.springboot.springbootproductsapi.controller;

import com.tiago_silveirago.course.springboot.springbootproductsapi.model.Product;
import com.tiago_silveirago.course.springboot.springbootproductsapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
