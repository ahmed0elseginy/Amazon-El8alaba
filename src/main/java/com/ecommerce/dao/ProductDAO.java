package com.ecommerce.dao;

import com.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p JOIN p.productDetails pd " +
            "WHERE LOWER(p.name) LIKE LOWER(CONCAT('%', :query, '%')) " +
            "OR CAST(pd.price AS string) LIKE CONCAT('%', :query, '%')")
    List<Product> searchProducts(@Param("query") String query);
}