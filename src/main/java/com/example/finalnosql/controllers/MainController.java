package com.example.finalnosql.controllers;

import com.example.finalnosql.model.*;
import com.example.finalnosql.model.Number;
import com.example.finalnosql.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    MainService mainService;
    @GetMapping(value="/getusers")
    public List<Persona> getUsers()
    {
        return   mainService.getAllUsers();
    }
    @PostMapping(value="/add")
    public Persona addUser(@RequestBody Persona persona){
        mainService.save(persona);
        return persona;
    }
    @GetMapping(value="/getAddresses")
    public List<Towns> getAddresses()
    {
        return mainService.getAllAddresses();
    }
    @PostMapping(value="/addAddresses")
    public Towns addAddresses(@RequestBody Towns towns){
        mainService.saveAddresses(towns);
        return towns;
    }
    @GetMapping(value="/getJob")
    public List<Job> getJob()
    {
        return mainService.getAllJobs();
    }
    @PostMapping(value="/addJob")
    public Job addJob(@RequestBody Job job){
        mainService.saveJob(job);
        return job;
    }

    @PostMapping(value="/getRandomPersona")
    public List<PersonaFullModel> getPersonaFullModel(@RequestBody Number number)
    {
        return mainService.getPersonaFull(number);
    }



}
