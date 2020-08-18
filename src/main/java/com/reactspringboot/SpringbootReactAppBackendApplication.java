package com.reactspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.reactspringboot.model.User;
import com.reactspringboot.repo.UserRepository;

@SpringBootApplication
public class SpringbootReactAppBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootReactAppBackendApplication.class, args);
	}
	
	@Autowired
	public UserRepository userRepository;
	
	
	@Override
	public void run(String... args) throws Exception{
		userRepository.save(new User("Roy", "Hudson", "roy@gmail.com"));
		userRepository.save(new User("Didier", "Drogba", "didier@gmail.com"));
		userRepository.save(new User("Eden", "Hazard", "eden@gmail.com"));
		userRepository.save(new User("John", "Obi Mikel", "john@gmail.com"));
		userRepository.save(new User("Cezar", "Azpilicueta", "cezar@gmail.com"));
		
	}
	
}
