package com.barclays.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Painting {

    @Id
    @GeneratedValue
    private int id;
    //@OneToOne(cascade = CascadeType.ALL)
    private Artist artist;
    private String name;
    private int yearCompleted;
    private String style;
    private String medium;
    private String backstory;

    //@JsonBackReference
    @ManyToOne
    @JoinColumn(name = "artist_id")
    Artist artists;

    public Painting(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearCompleted() {
        return yearCompleted;
    }

    public void setYearCompleted(int yearCompleted) {
        this.yearCompleted = yearCompleted;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getBackstory() {
        return backstory;
    }

    public void setBackstory(String backstory) {
        this.backstory = backstory;
    }

    public Painting(String name){
        this.name = name;
        //this.yearCompleted=yearCompleted;
    }

    public Painting(Artist artist, String name, int yearCompleted, String style, String medium, String backstory) {
        this.artist = artist;
        this.name = name;
        this.yearCompleted = yearCompleted;
        this.style = style;
        this.medium = medium;
        this.backstory = backstory;
    }
}
