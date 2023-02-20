package com.example.finalnosql.service;

import com.example.finalnosql.model.*;
//import com.example.finalnosql.model.PersonaFullModel;
import com.example.finalnosql.model.Number;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MainServiceInterface {
    List<Persona> getAllUsers();

    void save(Persona persona);

    List<Towns> getAllAddresses();

    void saveAddresses(Towns addresses);

    List<Job> getAllJobs();

    void saveJob(Job job);

    List<PersonaFullModel> getPersonaFull(Number number);


}
