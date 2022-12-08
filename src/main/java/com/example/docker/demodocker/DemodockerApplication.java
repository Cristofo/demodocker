package com.example.docker.demodocker;

import com.example.docker.demodocker.dto.Client;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.docker.demodocker.repository.ClientRepository;

@SpringBootApplication
public class DemodockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemodockerApplication.class, args);
	}


	@Bean
	CommandLineRunner runner(ClientRepository clientRepository){
		return args -> {
			Client client = Client.builder().dni("123232").address("Street one").age(22).name("Felix").build();
			clientRepository.insert(client);
		};
	}
}
