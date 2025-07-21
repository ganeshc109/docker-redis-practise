package com.example.A_user_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import com.example.A_user_service.model.User;
import com.example.A_user_service.repository.UserRepository;

@SpringBootApplication
@EnableCaching
public class AUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AUserServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository userRepository) {
		return args -> {
			userRepository.save(new User("1", "Alice", "alice@example.com"));
			userRepository.save(new User("2", "Bob", "bob@example.com"));
		};
	}

}
