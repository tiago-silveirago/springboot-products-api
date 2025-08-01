package com.tiago_silveirago.course.springboot.springbootproductsapi.repository;

import com.tiago_silveirago.course.springboot.springbootproductsapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {

    List<Product> findByName(String name); //"findBy é obrigatório e o seguinte tem que ser com letra maiúscula
}
