package com.example.demo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.entities.Client;




public interface IclientRepository extends MongoRepository<Client, String> {

	@Query(value="{'date_naissance':{$regex:?0,$options:'i'} }")
	public List<Client> clientParCL( String cl);
	

	
}
