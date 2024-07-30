package com.gabrielanselmoadev.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielanselmoadev.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
