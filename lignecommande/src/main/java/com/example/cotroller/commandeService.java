package com.example.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.Icommande;
import com.example.entities.Commande;
 com.example.entities.Commande;

@RestController
public class commandeService {
	@Autowired
	private Icommande CammandeRepository ;
	
	@RequestMapping("/save")
	public Commande saveClient(Commande c) {
		
		CammandeRepository.save(c);
		return c ;
	}
	
	@RequestMapping("/all")
	public List <Commande> getCommande(){
		
		
		return CammandeRepository.findAll();
		
	}

}
