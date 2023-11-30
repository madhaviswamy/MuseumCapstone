package com.barclays.controller;

import com.barclays.model.Artist;
import com.barclays.service.ArtistService;
import com.barclays.service.ArtistServiceIMPL;
import jakarta.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@Slf4j
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/artists")
    public List<Artist> getAllArtists(){
        List<Artist> artists = Collections.emptyList();
        artists = artistService.findAll();

        return artists;
    }

    @GetMapping("/artists/{id}")
    public Artist getArtist(@PathVariable int id){
        return artistService.findById(1);
    }

    @GetMapping("/artists/search")
    public List<Artist>searchByName(@PathParam("name") String name) {
        return artistService.searchByName(name);
    }

//    @PostMapping("/artist")
//    public Artist createArtist(@RequestBody Artist artist) {
//        return artistService.save(artist);
//    }

}
