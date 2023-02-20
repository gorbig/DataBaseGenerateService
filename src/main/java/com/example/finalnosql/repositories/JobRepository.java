package com.example.finalnosql.repositories;

import com.example.finalnosql.model.Job;
import com.example.finalnosql.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRepository extends MongoRepository<Job, String> {
    Job findById(Long id);
}
