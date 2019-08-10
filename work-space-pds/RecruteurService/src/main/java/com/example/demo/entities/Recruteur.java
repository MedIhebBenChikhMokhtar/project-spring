package com.example.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.entities.Offre;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Recruteur implements Serializable{
	
	@Id
	private String id;
	
	private String libelle;
	
	private String secteur_Activite;
	private String adresse;
	private long num_Tel;
	
	private List<Offre> liste_offres;
	
	public Recruteur() {}
	
////	public Recruteur(String libelle, String secteur_Activite, String adresse, long num_Tel) {
////		super();
////		this.libelle = libelle;
////		this.secteur_Activite = secteur_Activite;
////		this.adresse = adresse;
////		this.num_Tel = num_Tel;
//	}
	
	
	
	
	
	
	public String getId() {
		return id;
	}
	
	public Recruteur(String libelle, String secteur_Activite, String adresse, long num_Tel) {
	super();
	this.libelle = libelle;
	this.secteur_Activite = secteur_Activite;
	this.adresse = adresse;
	this.num_Tel = num_Tel;
}

	public void setId(String id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getSecteur_Activite() {
		return secteur_Activite;
	}
	public void setSecteur_Activite(String secteur_Activite) {
		this.secteur_Activite = secteur_Activite;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public long getNum_Tel() {
		return num_Tel;
	}
	public void setNum_Tel(long num_Tel) {
		this.num_Tel = num_Tel;
	}

	public List<Offre> getListe_offres() {
		return liste_offres;
	}

	public void setListe_offres(List<Offre> liste_offres) {
		this.liste_offres = liste_offres;
	}
	

}
