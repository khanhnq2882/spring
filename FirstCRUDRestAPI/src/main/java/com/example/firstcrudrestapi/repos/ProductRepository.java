package com.example.firstcrudrestapi.repos;

import com.example.firstcrudrestapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
