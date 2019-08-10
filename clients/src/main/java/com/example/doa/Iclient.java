package com.example.doa;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entities.Client;

public interface Iclient extends MongoRepository<Client, String>{

}
