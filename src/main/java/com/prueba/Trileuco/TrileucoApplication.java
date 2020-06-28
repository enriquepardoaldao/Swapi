package com.prueba.Trileuco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import service.SwapiService;

@SpringBootApplication
@Configuration
@ComponentScan("controller")
public class TrileucoApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(TrileucoApplication.class, args);
	}
	
	@Bean(name = "restTemplate")
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean(name = "swapiService")
	public SwapiService swapiService() {
		return new SwapiService();
	}

}
