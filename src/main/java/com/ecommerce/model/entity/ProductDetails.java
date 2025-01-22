package com.ecommerce.model.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "product_details")
@Data
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageUrl;

    @NotEmpty(message = "Product details name is required")
    private String name;

    @NotNull(message = "Price is required")
    private double price;

    @NotEmpty(message = "Expiration date is required")
    private String expirationDate;

    @NotEmpty(message = "Manufacturer is required")
    @Size(max = 100, message = "Manufacturer must be less than 100 characters")
    private String manufacturer;

    private boolean available;


//    @OneToOne(mappedBy = "productDetails")
//    private Product product;

}