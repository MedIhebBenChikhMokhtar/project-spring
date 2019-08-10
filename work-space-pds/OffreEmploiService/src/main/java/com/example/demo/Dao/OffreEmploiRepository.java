package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.demo.entities.Offre;
@RepositoryRestResource

public interface   OffreEmploiRepository  extends MongoRepository<Offre, String>{

	@Query(value="{'nomOffre': { $regex: ?0, $options: 'i' } }")
	public List <Offre> offreParMC(String nomOffre);


	//List<Offre> findBy (String recId);
	
	List <Offre> findByRecruteurId (String recId);

}
