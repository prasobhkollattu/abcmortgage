package com.abc.mortgage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Application entry point
 * 
 * @author PRASOBH KOLLATTU
 *
 */
@SpringBootApplication
@EnableCaching
public class AccountsApp {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApp.class, args);
	}

}
