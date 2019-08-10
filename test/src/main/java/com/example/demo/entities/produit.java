package com.example.demo.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class produit implements Serializable {
@Id
private String id;
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
private String nom;
public produit(String nom) {
	super();
	this.nom = nom;
}
public produit() {
	super();
}



}
