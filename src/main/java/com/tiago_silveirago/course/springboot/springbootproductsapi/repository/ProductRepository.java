package com.tiago_silveirago.course.springboot.springbootproductsapi.repository;

import com.tiago_silveirago.course.springboot.springbootproductsapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
