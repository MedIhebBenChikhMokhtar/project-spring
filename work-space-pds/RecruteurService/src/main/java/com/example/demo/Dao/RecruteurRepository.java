package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Recruteur;

@RepositoryRestResource
public interface RecruteurRepository extends MongoRepository<Recruteur, String>{

	
	@Query(value="{'secteur_Activite': { $regex: ?0, $options: 'i' } }")
	List<Recruteur> recruteurparMC(String nomRecruteur);

}
