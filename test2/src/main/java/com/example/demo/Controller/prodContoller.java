package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.IproduitRepository;
import com.example.demo.entites.Produit;

@RestController
public class prodContoller {
	
	@Autowired
	private IproduitRepository prod;
	
	@RequestMapping("/save")
	public Produit saveproduit(Produit p){
		prod.save(p);
	    return p;
	}
	@RequestMapping("/")
	public List <Produit> getProduits(){
		return prod.findAll();
	}

}
