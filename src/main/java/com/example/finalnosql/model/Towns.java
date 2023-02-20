package com.example.finalnosql.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("towns")
@Data
public class Towns {
    @Id
    @Field(name = "_id")
    private String _id;

    @Field(name = "id")
    private Long id;

    @Field(name="town")
    private String town;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String location) {
        this.town = location;
    }
}
