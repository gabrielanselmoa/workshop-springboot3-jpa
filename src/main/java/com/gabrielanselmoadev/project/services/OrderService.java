package com.gabrielanselmoadev.project.services;

import com.gabrielanselmoadev.project.entities.Order;
import com.gabrielanselmoadev.project.repositories.OrderRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService{

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> orderOpt = repository.findById(id);
        if (orderOpt.isEmpty()){
            throw new EntityNotFoundException("Order not found!");
        }
        return orderOpt.get();
    }

}
