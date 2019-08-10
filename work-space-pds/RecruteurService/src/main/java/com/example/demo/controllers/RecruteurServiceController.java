package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.RecruteurRepository;
import com.example.demo.entities.Offre;
import com.example.demo.entities.Recruteur;
import com.example.demo.feignpds.Ifeign_Recruteur;

@RestController
public class RecruteurServiceController {
	@Autowired
	private RecruteurRepository recruteurRepository;
	@Autowired
	private Ifeign_Recruteur feignRecruteur;
	
	
	
	@RequestMapping("/saveR")
	public Recruteur saveRecruteur(Recruteur r) {
		
		recruteurRepository.save(r);
		return r ;
	}
	
	
	@RequestMapping("/allR")
	public List <Recruteur> getRecruteurs(){
		
		
		return recruteurRepository.findAll();
		
	}
	
	
	
	@RequestMapping("/recruteurs")

	public Page < Recruteur>  getrecruteurs(int page){
		
	return recruteurRepository.findAll( PageRequest.of(0, 3));	
	}
	
	
	
	@RequestMapping("/getR")
	public Optional <Recruteur> getrecruteur(String ref) {
		return recruteurRepository.findById(ref);	
	
	}
	
	@RequestMapping("/updateR")
	public Recruteur update (Recruteur r){
recruteurRepository.save(r);
return r;
}
	
	@RequestMapping("/deleteR")
	public boolean delete(String ref) {
			recruteurRepository.deleteById(ref);
			return true;
			
		}
	
	@RequestMapping("/FMCR")
	public List<Recruteur> recruteurParMC(String nomRecruteur ){
		return recruteurRepository.recruteurparMC( nomRecruteur );
		
		
	}
	
	
	
	@RequestMapping("/listeoffreparrecruteur")
	public Optional<Recruteur> getById(String id){		

		Optional<Recruteur> recruteur= recruteurRepository.findById(id);//recuperer la commande
		
		
		List<Offre> offres=feignRecruteur.GetOffress(id);
		
		recruteur.get().setListe_offres(offres);
		
		return recruteur;
	}
	
	
	
}
