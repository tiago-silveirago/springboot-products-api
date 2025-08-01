package com.tiago_silveirago.course.springboot.springbootproductsapi.controller;

import com.tiago_silveirago.course.springboot.springbootproductsapi.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    @PostMapping
    public Product create(@RequestBody Product product) {
        System.out.println("Product created: " + product);
        return product;
    }
}
