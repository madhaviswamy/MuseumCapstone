package com.barclays.controller;

import com.barclays.model.Artist;
import com.barclays.model.Museum;
import com.barclays.model.Painting;
import com.barclays.service.ArtistService;
import com.barclays.service.PaintingService;
import jakarta.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@Slf4j
public class PaintingController {
    private final PaintingService paintingService;

    public PaintingController(PaintingService paintingService) {
        this.paintingService = paintingService;
    }

    @GetMapping("/paintings")
    public List<Painting> getAllPaintings(){
        List<Painting> paintings = Collections.emptyList();
        paintings = paintingService.findAll();

        return paintings;
    }

    @GetMapping("/paintings/{id}")
    public Painting getPainting(@PathVariable int id){
        return paintingService.findById(id);
    }

    @GetMapping("/paintings/search")
    public List<Painting>searchByPName(@PathParam("name") String name) {
        //log.debug(name);
        return paintingService.searchByPName(name);
    }

    @GetMapping("/paintings/yearcompleted")
    public List<Painting>findByYearCompleted(@PathParam("yearCompleted") String yearCompleted){
        //log.debug(yearCompleted);
        return paintingService.findByYearCompleted(Integer.valueOf(yearCompleted));
    }

}
