package com.barclays.controller;

import com.barclays.model.Artist;
import com.barclays.model.Museum;
import com.barclays.model.Painting;
import com.barclays.service.ArtistService;
import com.barclays.service.MuseumService;
import jakarta.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@Slf4j
public class MuseumController {
    private final MuseumService museumService;

    public MuseumController(MuseumService museumService) {
        this.museumService = museumService;
    }

    @GetMapping("/museums")
    public List<Museum> getAllMuseums(){
        List<Museum> museums = Collections.emptyList();
        museums = museumService.findAll();

        return museums;
    }

    @GetMapping("/museums/search")
    public List<Museum>searchByMName(@PathParam("name") String name) {
        //log.debug(name);
        return museumService.searchByMName(name);
    }

    @GetMapping("/museums/location/search")
    public List<Museum>searchByLocation(@Param("location") String location){
        return museumService.searchByLocation(location);
    }

    @GetMapping("/museums/{id}")
    public Museum getMuseum(@PathVariable int id){
        return museumService.findById(id);
    }
}
