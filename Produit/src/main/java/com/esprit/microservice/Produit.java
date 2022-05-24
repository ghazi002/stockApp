package com.esprit.microservice;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private int id;
	  private String marque;
	  private String modele;
	  private String ref;
	  private float prix;
	  private float poids;
	  private Date dateReal;
	  private Date dateExp;
	
	public Produit() {
		super();
	}

	public Produit(String marque, String modele, String ref, float prix, float poids, Date dateReal, Date dateExp) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.ref = ref;
		this.prix = prix;
		this.poids = poids;
		this.dateReal = dateReal;
		this.dateExp = dateExp;
	}

	public Produit(int id, String marque, String modele, String ref, float prix, float poids, Date dateReal,
			Date dateExp) {
		super();
		this.id = id;
		this.marque = marque;
		this.modele = modele;
		this.ref = ref;
		this.prix = prix;
		this.poids = poids;
		this.dateReal = dateReal;
		this.dateExp = dateExp;
	}

	
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public Date getDateReal() {
		return dateReal;
	}

	public void setDateReal(Date dateReal) {
		this.dateReal = dateReal;
	}

	public Date getDateExp() {
		return dateExp;
	}

	public void setDateExp(Date dateExp) {
		this.dateExp = dateExp;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", marque=" + marque + ", modele=" + modele + ", ref=" + ref + ", prix=" + prix
				+ ", poids=" + poids + ", dateReal=" + dateReal + ", dateExp=" + dateExp + "]";
	}
	
	
	  

}
