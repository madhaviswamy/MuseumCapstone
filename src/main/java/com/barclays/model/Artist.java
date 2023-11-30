package com.barclays.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Artist {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int yearBorn;
    private int yearDown;

    //wiring to Museum
    @ManyToOne
    @JoinColumn(name = "museum_id")
    private Museum museum;

    //wriring to Paintings
    @JsonManagedReference
    @OneToMany(mappedBy = "artist")
    private List<Painting> paintings;

    public Artist(){}

    public Artist(String name){
        this.name= name;
    }

    public Artist(String name, int yearBorn, int yearDown) {
        this.name = name;
        this.yearBorn = yearBorn;
        this.yearDown = yearDown;

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

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public int getYearDown() {
        return yearDown;
    }

    public void setYearDown(int yearDown) {
        this.yearDown = yearDown;
    }
}
