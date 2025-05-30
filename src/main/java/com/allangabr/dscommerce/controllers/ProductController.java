package com.allangabr.dscommerce.controllers;

import com.allangabr.dscommerce.dto.ProductDTO;
import com.allangabr.dscommerce.entities.Product;
import com.allangabr.dscommerce.repositories.ProductRepository;
import com.allangabr.dscommerce.services.ProductService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public ProductDTO findById(@PathVariable Long id){
        return productService.findById(id);
    }

}
