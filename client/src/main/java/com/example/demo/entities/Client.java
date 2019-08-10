package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Client implements Serializable{
@Id
private String id;
private String code;
private String nom;
private String prenom;
private Date date_naissance;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public Date getDate_naissance() {
	return date_naissance;
}
public void setDate_naissance(Date date_naissance) {
	this.date_naissance = date_naissance;
}
public Client(String code, String nom, String prenom, Date date_naissance) {
	super();
	this.code = code;
	this.nom = nom;
	this.prenom = prenom;
	this.date_naissance = date_naissance;
}
public Client() {
	super();
}



}
