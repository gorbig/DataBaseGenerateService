package com.example.finalnosql.repositories;

import com.example.finalnosql.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends MongoRepository<Persona, String> {
    Persona findById(Long id);
}
