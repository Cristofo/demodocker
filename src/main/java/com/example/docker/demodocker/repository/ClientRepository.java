package com.example.docker.demodocker.repository;

import com.example.docker.demodocker.dto.Client;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ClientRepository extends MongoRepository<Client, String> {
                                                    //type string dependes on the id type in this case dni is String


}
