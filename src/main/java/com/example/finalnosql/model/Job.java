package com.example.finalnosql.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document("job")
@Data
public class Job {
    @Id
    private String _id;
    @Field(name="id")
    private Long id;
    @Field(name="job_name")
    private String job_name;
    @Field(name="job_addresses")
    private List<String> job_addresses;
}
