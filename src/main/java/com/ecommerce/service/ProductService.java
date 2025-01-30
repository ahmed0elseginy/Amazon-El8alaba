package com.ecommerce.service;

import com.ecommerce.dao.ProductDAO;
import com.ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

//    private final List<Product> productList = new ArrayList<>();
//    private Long nextId = 1L;

    @Autowired
    private ProductDAO productDAO;


    // Add a new product
    public void addProduct(Product product) {
//        product.setId(nextId++);
//        productList.add(product);
        productDAO.save(product);
    }

    // Get all products
    public List<Product> getAllProducts() {
//        return new ArrayList<>(productList);
        return productDAO.findAll();
    }

    // Get product by ID
    public Optional<Product> getProductById(Long id) {
//        return productList.stream().filter(product -> product.getId().equals(id)).findFirst();
        return productDAO.findById(id);
    }

    // Update product
    public boolean updateProduct(Long id, Product updatedProduct) {
//        Optional<Product> existingProduct = getProductById(id);
//        if (existingProduct.isPresent()) {
//            Product product = existingProduct.get();
//            product.setName(updatedProduct.getName());
//            product.setProductDetails(updatedProduct.getProductDetails());
//            return true;
//        }
//        return false;
        Optional<Product> existingProduct = productDAO.findById(id);
        if (existingProduct.isPresent()) {
            Product product = existingProduct.get();
            product.setName(updatedProduct.getName());
            product.setProductDetails(updatedProduct.getProductDetails());
            productDAO.save(product);
            return true;
        }
        return false;
    }

    // Delete product
    public boolean deleteProduct(Long id) {
//        return productList.removeIf(product -> product.getId().equals(id));
        if (productDAO.existsById(id)) {
            productDAO.deleteById(id);
            return true;
        }
        return false;
    }

    // Search products by name or price
    public List<Product> searchProducts(String query) {
//        return productList.stream()
//                .filter(product -> product.getName().toLowerCase().contains(query.toLowerCase()) ||
//                        String.valueOf(product.getProductDetails().getPrice()).contains(query))
//                .collect(Collectors.toList());
        // Validate input
        if (query == null || query.trim().isEmpty()) {
            return new ArrayList<>();
        }
        return productDAO.searchProducts(query);
    }

}


