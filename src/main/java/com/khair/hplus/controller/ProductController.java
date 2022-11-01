package com.khair.hplus.controller;

import com.khair.hplus.domain.Product;
import com.khair.hplus.dtos.ProductInput;
import com.khair.hplus.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @QueryMapping
    public Iterable<Product> products(){
        return productRepository.findAll();
    }

    @QueryMapping
    public Product productById(@Argument String id){
        return productRepository.findById(id).orElseThrow();
    }

    @MutationMapping
    public Product addProduct(@Argument(name = "input") ProductInput productInput){
        return productRepository.save(productInput.getProductEntity());
    }

}
