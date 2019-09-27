package com.abc.mortgage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Application entry point
 * 
 * @author PRASOBH KOLLATTU
 *
 */
@SpringBootApplication
@EnableCaching
@EnableJpaRepositories("com.abc.mortgage.dao")
@ComponentScan("com.abc.mortgage")
@EntityScan("com.abc.mortgage.dao.entity")
public class AccountsApp {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApp.class, args);
	}

}
