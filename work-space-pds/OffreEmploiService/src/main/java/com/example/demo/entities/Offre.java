package com.example.demo.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Offre implements Serializable{

	@Id 
	private String id;
	private String nomOffre;
	private String domaine;
	private String description;
	private String recruteurId;
	
	public Offre() {}

	public Offre(String nomOffre, String domaine, String description, String recruteurId) {
		super();
		this.nomOffre = nomOffre;
		this.domaine = domaine;
		this.description = description;
		this.recruteurId = recruteurId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNomOffre() {
		return nomOffre;
	}

	public void setNomOffre(String nomOffre) {
		this.nomOffre = nomOffre;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRecruteurId() {
		return recruteurId;
	}

	public void setRecruteurId(String recruteurId) {
		this.recruteurId = recruteurId;
	}
	

	}
