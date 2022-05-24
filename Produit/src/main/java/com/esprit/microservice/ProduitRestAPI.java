package com.esprit.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/api/produits")
public class ProduitRestAPI {
	private String title="Welcome to product Microservice";
	@Autowired
	private ProduitService produitService;
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Produit> createProduit(@RequestBody Produit produit){
		return new ResponseEntity<>(produitService.addProduit(produit),HttpStatus.OK);
	}
	@PutMapping(value ="/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Produit> updateProduit(@PathVariable(value="id") int id,@RequestBody Produit produit){
		return new ResponseEntity<>(produitService.updateProduit(id,produit),HttpStatus.OK);
	}
	
	@DeleteMapping(value ="/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteProduit(@PathVariable(value="id") int id){
		return new ResponseEntity<>(produitService.deleteProduit(id),HttpStatus.OK);
	}
	
	
	
}
