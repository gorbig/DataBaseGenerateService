package com.example.finalnosql.repositories;

import com.example.finalnosql.model.Persona;
import com.example.finalnosql.model.Towns;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TownsRepository extends MongoRepository<Towns, String> {
    Towns findById(Long id);
}
