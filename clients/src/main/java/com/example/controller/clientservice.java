package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Client;
import com.example.doa.Iclient;

@RestController
public class clientservice {

	@Autowired
	private Iclient ClientRepository ;
	
	@RequestMapping("/save")
	public Client saveClient(Client p) {
		
		ClientRepository.save(p);
		return p ;
	}
	
	@RequestMapping("/all")
	public List <Client> getClients(){
		
		
		return ClientRepository.findAll();
		
	}
	
	
	@RequestMapping("/get/{code}") public Optional<Client> getClient(@PathVariable String code){ 
		return ClientRepository.findById(code); 
	}
	@RequestMapping("/delete/{code}")
	public boolean delete(@PathVariable String code){ 
		ClientRepository.deleteById(code); return true; 
	}
	@RequestMapping("/update")
	public Client update(Client c)
	{ ClientRepository.save(c);
return c; 
} 

	
}
