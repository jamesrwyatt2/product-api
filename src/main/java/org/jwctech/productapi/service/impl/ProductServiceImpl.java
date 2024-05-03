package org.jwctech.productapi.service.impl;

import org.jwctech.productapi.modal.Product;
import org.jwctech.productapi.repository.ProductRepository;
import org.jwctech.productapi.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepo;

    public ProductServiceImpl(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAllProducts() {
       return productRepo.findAll();
    }

    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    public Product getById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    public void deleteProduct(Long id) {

    }
}
