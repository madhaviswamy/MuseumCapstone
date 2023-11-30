package com.barclays.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class Sculpture {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private Artist artist;
    private String medium;
    private int yearCompleted;
    private String backstory;

    public Sculpture(){}

    public Sculpture(String name, Artist artist, String medium, int yearCompleted, String backstory) {
        this.name = name;
        this.artist = artist;
        this.medium = medium;
        this.yearCompleted = yearCompleted;
        this.backstory = backstory;
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

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public int getYearCompleted() {
        return yearCompleted;
    }

    public void setYearCompleted(int yearCompleted) {
        this.yearCompleted = yearCompleted;
    }

    public String getBackstory() {
        return backstory;
    }

    public void setBackstory(String backstory) {
        this.backstory = backstory;
    }
}
