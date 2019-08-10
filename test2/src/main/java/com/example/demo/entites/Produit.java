package com.example.demo.entites;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Produit implements Serializable {
@Id
	private String id ;
	private String nom;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Produit(String nom) {
		super();
		this.nom = nom;
	}
	public Produit() {
		super();
	}
	

}
