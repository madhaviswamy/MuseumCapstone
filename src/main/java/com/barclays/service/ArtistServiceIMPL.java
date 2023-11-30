package com.barclays.service;

import com.barclays.model.Artist;
import com.barclays.repository.ArtistRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class ArtistServiceIMPL implements ArtistService{

    private ArtistRepository artistRepository;
    @Override
    public List<Artist> findAll() {

        List<Artist> artists = new ArrayList<>();
        Iterable<Artist> artistsIts = artistRepository.findAll();
        artistsIts.forEach(artists::add);

        return artists;
    }

    @Override
    public Artist findById(int id) {

        Optional<Artist> artist = artistRepository.findById(id);
        return artist.orElseGet(() ->new Artist("Default name: Nothing Found", 0, 0));
    }

    @Override
    public List<Artist> searchByName(String name) {
        return artistRepository.searchByName("");
    }

//    @Override
//    public Artist save(Artist a) {
//        return artistRepository.save(a);
//    }
}
