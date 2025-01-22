package com.ecommerce.repository;

import com.ecommerce.model.entity.Product;
import java.util.List;

public interface ProductRepository {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void saveProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Long id);
}