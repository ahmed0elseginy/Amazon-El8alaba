# E-Commerce Product Management System

## Overview

This project is a simple E-Commerce Product Management System built using **Spring Boot** and **Thymeleaf**. It allows users to manage products, including adding, updating, deleting, and searching for products. The system also includes product details such as price, expiration date, manufacturer, and availability status.

The application uses **MySQL** as the database and **Spring Data JPA** for data access. The front-end is built using **Thymeleaf** templates with **Bootstrap** for styling.

---

## Features

- **Product Management**:
  - Add new products with details such as name, price, expiration date, manufacturer, and availability.
  - Update existing product details.
  - Delete products.
  - View product details.

- **Search Functionality**:
  - Search for products by name or price.

- **Responsive UI**:
  - A clean and responsive user interface built with Bootstrap.

- **Database Integration**:
  - Uses MySQL for storing product data.
  - Automatic schema updates using Hibernate.

---

## Technologies Used

- **Backend**:
  - Spring MVC
  - Spring Data JPA
  - Spring Boot
  - Hibernate
  - MySQL


- **Frontend**:
  - Thymeleaf
  - Bootstrap

- **Build Tool**:
  - Maven

---

## Project Structure

```
src/main/java/com/ecommerce/
├── controller/          # Contains Spring MVC controllers
├── entity/              # Contains JPA entities (Product, ProductDetails)
├── dto/                 # Contains Data Transfer Objects (DTOs)
├── dao/                 # Contains Data Access Objects (DAOs)
├── service/             # Contains business logic and service classes
```

---

## Setup Instructions

### Prerequisites

- Java 17 or higher
- MySQL Server
- Maven

### Steps to Run the Project

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-repo/ecommerce-product-management.git
   cd ecommerce-product-management
   ```

2. **Configure MySQL Database**:
   - Create a database named `ecommerce` in MySQL.
   - Update the `application.properties` file with your MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
     spring.datasource.username=your-username
     spring.datasource.password=your-password
     ```

3. **Build the Project**:
   ```bash
   mvn clean install
   ```

4. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

5. **Access the Application**:
   Open your browser and navigate to:
   ```
   http://localhost:8080/products
   ```

---

## Screenshots

### Product List Page
![image](https://github.com/user-attachments/assets/2b64b3ba-6cf2-47ac-83a8-8f03f4b10239)


### Add Product Page
![image](https://github.com/user-attachments/assets/e33a4e60-936d-47ed-8cb4-ce93740f785a)


### Product Details Page
![image](https://github.com/user-attachments/assets/08f7b074-8a20-4629-89e1-93d31e23b94e)

### Update Product Page
![image](https://github.com/user-attachments/assets/efa502f1-a3cd-4fd5-8a6b-4d9f1d56f577)

---

## API Endpoints

| HTTP Method | Endpoint                | Description                          |
|-------------|-------------------------|--------------------------------------|
| GET         | `/products`             | Display all products                 |
| GET         | `/products/add`         | Display add product form             |
| POST        | `/products/add`         | Add a new product                    |
| GET         | `/products/details/{id}`| Display product details              |
| GET         | `/products/update/{id}` | Display update product form          |
| POST        | `/products/update/{id}` | Update a product                     |
| GET         | `/products/delete/{id}` | Delete a product                     |
| GET         | `/products/search`      | Search products by name or price     |

---

## Database Schema

### `products` Table
| Column Name       | Data Type     | Description                     |
|-------------------|---------------|---------------------------------|
| `id`              | BIGINT        | Primary key, auto-incremented   |
| `name`            | VARCHAR(100)  | Product name                    |
| `product_details_id` | BIGINT     | Foreign key to `product_details`|

### `product_details` Table
| Column Name       | Data Type     | Description                     |
|-------------------|---------------|---------------------------------|
| `id`              | BIGINT        | Primary key, auto-incremented   |
| `price`           | DOUBLE        | Product price                   |
| `expiration_date` | DATE          | Product expiration date         |
| `manufacturer`    | VARCHAR(50)   | Product manufacturer            |
| `available`       | BOOLEAN       | Product availability status     |

---

## Future Enhancements

- Add image upload functionality for products.
- Implement user authentication and authorization.
- Add pagination for the product list.
- Integrate with a payment gateway for purchasing products.

---

## Contact

For any questions or feedback, please reach out to:
- **Ahmed El-Seginy**  
- **Email**: ahmed0elseginy@gmail.com  
- **GitHub**: ([https://github.com/your-github-profile](https://github.com/ahmed0elseginy))

---

Enjoy managing your products! 🚀
