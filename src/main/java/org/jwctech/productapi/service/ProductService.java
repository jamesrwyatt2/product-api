package org.jwctech.productapi.service;

import org.jwctech.productapi.modal.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product createProduct(Product product);

    Product getById(Long id);

    void deleteProduct(Long id);
}
