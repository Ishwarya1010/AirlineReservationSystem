package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication   
@EnableAutoConfiguration
@EnableJpaAuditing
@ComponentScan(basePackages={"com.example.demo.*"})
@EnableJpaRepositories(basePackages="com.example.demo.repository")
@EnableTransactionManagement
@EntityScan(basePackages="com.example.demo.entity")


public class AirlineReservationSystemsApplication {
	public static void main(String[] args) {
		SpringApplication.run(AirlineReservationSystemsApplication.class, args);
		}
	 }
	


