package com.ecommerce.dto;

import jakarta.validation.constraints.*;

import java.time.LocalDate;


public class ProductDTO {

    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    private String name;

    @Positive(message = "Price must be a positive number")
    @NotNull(message = "Price is required")
    private double price;

    //    private String imageUrl;

    @FutureOrPresent(message = "Expiration date must be in the future or present")
    private LocalDate expirationDate;

    @Size(min = 2, max = 50, message = "Manufacturer must be between 2 and 50 characters")
    @NotNull(message = "Manufacturer is required")
    @Pattern(regexp = "^[A-Za-z\\s]+$", message = "Manufacturer can only contain alphabetic characters and spaces")
    private String manufacturer;

    @NotNull(message = "Availability status is required")
    private boolean available;

}
