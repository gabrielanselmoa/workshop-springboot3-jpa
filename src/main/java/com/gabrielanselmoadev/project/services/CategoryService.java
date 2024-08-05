package com.gabrielanselmoadev.project.services;

import com.gabrielanselmoadev.project.entities.Category;
import com.gabrielanselmoadev.project.repositories.CategoryRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> categoryOpt = repository.findById(id);
		if (categoryOpt.isEmpty()){
			throw new EntityNotFoundException("Category not found!");
		}
		return categoryOpt.get();
	}
}
