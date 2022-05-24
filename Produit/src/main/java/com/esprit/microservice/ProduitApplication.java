package com.esprit.microservice;

import java.util.Date;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaClient
public class ProduitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProduitApplication.class, args);
	}
	@Bean
	ApplicationRunner init (ProduitRepository rep) {
	return args -> {
		Date dt= new Date(); 
		Produit pr= new Produit("sam","black-shoes-homme","P0193JU5",190,300,dt,dt);
		Produit pr2= new Produit("nike","black-shoes","P0193JU6",190,300,dt,dt);
		rep.save(pr);
		rep.save(pr2);
		rep.findAll().forEach(System.out::println);
		};
	}
}
