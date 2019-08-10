package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.OffreEmploiRepository;
import com.example.demo.entities.Offre;





@RestController
public class OffreEmploiController {
	@Autowired
	private OffreEmploiRepository offreEmploiRepository;

	
	@RequestMapping("/saveo")
	public Offre saveOffreEmploi(Offre o) {
		
		offreEmploiRepository.save(o);
		return o ;
	}
	
	
	@RequestMapping("/allo")
	public List<Offre> getOffres(){
		
		
		return offreEmploiRepository.findAll();
		
	}

	@RequestMapping("/offres")

	public Page<Offre>  getOffress(int page){

		System.out.println("Danss /offres");
		
	return offreEmploiRepository.findAll( PageRequest.of(0, 3));	
	}
	
	
	
	@RequestMapping("/geto")
	public Optional<Offre> getOffre(String ref) {
		return offreEmploiRepository.findById(ref);	
	
	}
	
	@RequestMapping("/updateo")
	public Offre updateo (Offre o){
offreEmploiRepository.save(o);
return o;
}
	
	@RequestMapping("/deleteo")
	public boolean deleteo(String ref) {
			offreEmploiRepository.deleteById(ref);
			return true;
			
		}
	
	@RequestMapping("/FMC")
	public List<Offre> produitParMC(String nomOffre){
		return offreEmploiRepository.offreParMC(nomOffre);
		
		
	}
	
	
	@GetMapping("/recruteurr/{recId}")
	public List<Offre> GetOffress(@PathVariable("recId") String recId){
	List<Offre> LOFFRE = this.offreEmploiRepository.findByRecruteurId(recId);
	return LOFFRE;

	}

		
		
		
	
	
	
	
	
	
	
	
}
