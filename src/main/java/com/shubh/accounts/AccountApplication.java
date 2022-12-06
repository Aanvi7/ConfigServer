package com.shubh.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@SpringBootConfiguration
@ComponentScans({ @ComponentScan("com.shubh.accounts.controller") })
@EnableJpaRepositories("com.shubh.accounts.repository")
@EntityScan("com.shubh.accounts.model")
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
		
		System.out.println("Account  Application is Running. on 81 poart...");
	}

}
