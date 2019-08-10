package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entites.Produit;
@RepositoryRestResource
public interface IproduitRepository extends MongoRepository<Produit, String> {

}
