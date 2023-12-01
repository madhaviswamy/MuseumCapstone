package com.barclays.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
public class Museum {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String location;
    private String curator;

    //wiring to artist
    @OneToMany
    @JoinColumn(name = "museum")
    private List<Artist> artists;

    public Museum(){}

    public Museum(String name, String location){
        this.name = name;
        this.location = location;
    }

    public Museum(String name, String location, String curator) {
        this.name = name;
        this.location = location;
        this.curator = curator;
        //artistList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCurator() {
        return curator;
    }

    public void setCurator(String curator) {
        this.curator = curator;
    }
}
