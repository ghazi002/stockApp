package com.esprit.microservice;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProduitRepository  extends JpaRepository<Produit , Integer> {
	@Query("select p from Produit p where p.ref like :ref")
	public Page<Produit> produitByRef(@Param("ref") String n, Pageable pageable);
}
