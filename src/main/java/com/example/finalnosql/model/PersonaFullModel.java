package com.example.finalnosql.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

public class PersonaFullModel {

    private Long id;

    @Field(name="nationality")
    private String nationality;
    @Field(name="gender")
    private String gender;

    @Field(name="firstName")
    private String firstName;
    @Field(name="lastName")
    private String lastName;
    @Field(name="town")
    private String town;
    @Field(name="job_name")
    private String job_name;
    @Field(name="job_address")
    private String job_addresses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getJob_addresses() {
        return job_addresses;
    }

    public void setJob_addresses(String job_addresses) {
        this.job_addresses = job_addresses;
    }
}
