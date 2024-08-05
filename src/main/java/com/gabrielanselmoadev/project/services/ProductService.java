package com.gabrielanselmoadev.project.services;

import com.gabrielanselmoadev.project.entities.Product;
import com.gabrielanselmoadev.project.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> productOpt = repository.findById(id);
        if (productOpt.isEmpty()){
            throw new EntityNotFoundException("Entity not found!!");
        }
        return productOpt.get();
    }

}
