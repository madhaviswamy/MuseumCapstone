package com.barclays.service;

import com.barclays.model.Artist;
import com.barclays.repository.ArtistRepository;
import jakarta.persistence.Persistence;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArtistService {
    List<Artist> findAll();

    Artist findById(int id);

    List<Artist> searchByName(String name);

    //public Artist save(Artist a);
}
