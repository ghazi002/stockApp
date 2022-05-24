package com.esprit.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitService {
	@Autowired
	private ProduitRepository produitRepository;
	
	public Produit addProduit(Produit produit) {
		return produitRepository.save(produit);
	}
	
	public Produit updateProduit(int id, Produit newProduit) {
		if(produitRepository.findById(id).isPresent()) {
			Produit existingProduit = produitRepository.findById(id).get();
			existingProduit.setMarque(newProduit.getMarque());
			existingProduit.setModele(newProduit.getModele());
			existingProduit.setRef(newProduit.getRef());
			existingProduit.setPrix(newProduit.getPrix());
			existingProduit.setPoids(newProduit.getPoids());
			existingProduit.setDateExp(newProduit.getDateExp());
			return produitRepository.save(existingProduit);
		}
		else 
			return null;
	}
	
	public String deleteProduit(int id) {
		if(produitRepository.findById(id).isPresent()) {
			produitRepository.deleteById(id);
			return "Poduit supprimé avec succéess";
		}
		else
			return "Produit n'existe pas";
	}

}
