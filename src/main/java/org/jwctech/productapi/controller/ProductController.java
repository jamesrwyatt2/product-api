package org.jwctech.productapi.controller;

import org.jwctech.productapi.modal.Product;
import org.jwctech.productapi.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductService productService;

    @GetMapping("")
    public List<Product> getProducts() {
        logger.info("Getting products!");
        return productService.getAllProducts();
    }

    @PostMapping("")
    public Product createProduct(@RequestBody Product product) {
        logger.info("Creating Product: "+product.toString());
        return productService.createProduct(product);
    }
}
