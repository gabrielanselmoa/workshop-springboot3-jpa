package com.gabrielanselmoadev.project.repositories;

import com.gabrielanselmoadev.project.entities.OrderItem;
import com.gabrielanselmoadev.project.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
