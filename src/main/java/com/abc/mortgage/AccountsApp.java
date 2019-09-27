package com.abc.mortgage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * Application entry point
 * 
 * @author PRASOBH KOLLATTU
 *
 */
@SpringBootApplication
@ComponentScan({ "com.abc.mortgage", "com.abc.mortgage.services", "com.abc.mortgage.contollers.mapper" })
public class AccountsApp {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApp.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
