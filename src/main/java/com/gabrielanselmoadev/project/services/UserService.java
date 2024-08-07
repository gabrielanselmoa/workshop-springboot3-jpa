package com.gabrielanselmoadev.project.services;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielanselmoadev.project.entities.User;
import com.gabrielanselmoadev.project.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> userOpt = repository.findById(id);
		if (userOpt.isEmpty()){
			throw new EntityNotFoundException("User not found!");
		}
		return userOpt.get();
	}

	public User insert(User u){
		return repository.save(u);
	}

	public void delete(Long id){
		repository.deleteById(id);
	}

	public User update(Long id, User user){
		User entity = repository.getReferenceById(id);
		updateData(entity, user);
		return repository.save(entity);
	}

	private void updateData(User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
	}
}
