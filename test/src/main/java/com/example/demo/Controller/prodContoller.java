package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.IproduitRepository;
import com.example.demo.entities.produit;

@RestController
public class prodContoller {

	
	@Autowired
	private IproduitRepository prodRepo;
	
	@RequestMapping("/save")
	public produit saveProduit(produit p) {
		prodRepo.save(p);
		return p;
	}
	@RequestMapping("/all")
	public List<produit> getProduits(){
		return prodRepo.findAll();
	}
}
