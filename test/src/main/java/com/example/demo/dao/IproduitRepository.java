package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entities.produit;

public interface IproduitRepository extends MongoRepository<produit, String>  {

}
