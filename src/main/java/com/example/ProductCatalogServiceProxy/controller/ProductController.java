package com.example.ProductCatalogServiceProxy.controller;

import com.example.ProductCatalogServiceProxy.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/products")
@RestController
public class ProductController {

    @GetMapping
    public String getProducts(){
        return "Returning list of all products";
    }

    @GetMapping("/{id}")
    public String getProduct(@PathVariable("id") Long productId){
        return "Returning a product with id "+ productId;
    }

    @PostMapping
    public String createProduct(@RequestBody ProductDto productDto){
        return "Creating product = "+productDto;
    }

    @PatchMapping
    public String updateProduct(@RequestBody ProductDto productDto){
        return "Updating product = "+productDto;
    }
}

