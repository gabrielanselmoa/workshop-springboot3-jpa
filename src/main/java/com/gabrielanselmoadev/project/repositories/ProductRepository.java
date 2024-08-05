package com.gabrielanselmoadev.project.repositories;

import com.gabrielanselmoadev.project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
