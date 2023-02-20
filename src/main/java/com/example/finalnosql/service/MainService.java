package com.example.finalnosql.service;

import com.example.finalnosql.model.*;
//import com.example.finalnosql.model.PersonaFullModel;
import com.example.finalnosql.model.Number;
import com.example.finalnosql.repositories.JobRepository;
import com.example.finalnosql.repositories.PersonaRepository;
import com.example.finalnosql.repositories.TownsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class MainService implements MainServiceInterface{
    @Autowired
    PersonaRepository personaRepository;
    @Autowired
    TownsRepository townsRepository;
    @Autowired
    JobRepository jobRepository;


    @Override
    public List<Persona> getAllUsers() {
        return personaRepository.findAll();
    }

    @Override
    public void save(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public List<Towns> getAllAddresses() {
        return townsRepository.findAll();
    }

    @Override
    public void saveAddresses(Towns addresses) {
        townsRepository.save(addresses);
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public void saveJob(Job job) {
        jobRepository.save(job);
    }

    @Override
    public List<PersonaFullModel> getPersonaFull(Number number) {
        List<PersonaFullModel> answer = new LinkedList<>();

        IntStream.range(0, number.getNumber())
                .parallel()
                .forEach(i -> {
                    Long z = System.currentTimeMillis()%100;
                    Persona currentPersona = personaRepository.findById(z);

                    PersonaFullModel personaFullModel = new PersonaFullModel();
                    personaFullModel.setId((long) i);
                    personaFullModel.setFirstName(currentPersona.getFirstName());

                    Long x = System.currentTimeMillis()%100;
                    Persona currentPersona1 = personaRepository.findById(x);
                    personaFullModel.setLastName(currentPersona1.getLastName());
                    personaFullModel.setNationality(currentPersona.getNationality());
                    personaFullModel.setGender(currentPersona.getGender());

                    Long b = System.currentTimeMillis()%1000;
                    Towns currentTowns = townsRepository.findById(b);
                    personaFullModel.setTown(currentTowns.getTown());

                    Long n = Long.valueOf((int) Math.random()*(9-1)+1);
                    Job currentJob = jobRepository.findById(n);
                    personaFullModel.setJob_name(currentJob.getJob_name());

                    Long m = System.currentTimeMillis()%10;
                    Job currentJob1 = jobRepository.findById(m);

                    Long k = System.currentTimeMillis()%10;
                    personaFullModel.setJob_addresses(currentJob1.getJob_addresses().get(Math.toIntExact(Long.valueOf((int) Math.random()*(9-1)+1))));

                    answer.add(personaFullModel);
                });

        return answer;
    }



}
