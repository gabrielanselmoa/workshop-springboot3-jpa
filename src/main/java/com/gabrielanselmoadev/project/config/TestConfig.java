package com.gabrielanselmoadev.project.config;

import java.time.Instant;
import java.util.Arrays;

import com.gabrielanselmoadev.project.entities.Order;
import com.gabrielanselmoadev.project.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gabrielanselmoadev.project.entities.User;
import com.gabrielanselmoadev.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		Order o1 = new Order(null, Instant.now(), u1);
		Order o2 = new Order(null, Instant.now(), u2);

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2));
	}
	
	
}
