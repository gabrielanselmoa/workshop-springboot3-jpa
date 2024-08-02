package com.gabrielanselmoadev.project.repositories;

import com.gabrielanselmoadev.project.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
