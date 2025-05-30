package com.allangabr.dscommerce.controllers;

import com.allangabr.dscommerce.entities.Product;
import com.allangabr.dscommerce.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public String test(){
        Optional<Product> productOptional = productRepository.findById(1L);
        Product product = productOptional.get();
        return product.getName();
    }

}
